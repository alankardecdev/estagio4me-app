package com.estagio4me;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.estagio4me.Model.apiEst4Me.Login;
import com.estagio4me.Model.apiEst4Me.UserParameter;
import com.estagio4me.Model.apiEst4Me.singleton.RetrofitSingleton;
import com.estagio4me.Service.LoginAPI;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;


/**
 * Created by alankardec on 23/08/17.
 */

public class LoginActivity extends AppCompatActivity
        implements View.OnClickListener {


    EditText edtUsername;
    EditText edtPassword;
    TextView mTextMensagem;
    ProgressBar mProgressBar;
    Context _this;

    Retrofit retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        _this = this;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUsername = (EditText) findViewById(R.id.edtUsername);
        edtPassword = (EditText) findViewById(R.id.edtPassword);

        View view = getLayoutInflater().inflate(R.layout.activity_login, null);
        mTextMensagem = (TextView)view.findViewById(android.R.id.empty);
        mProgressBar = (ProgressBar)view.findViewById(R.id.progressBar);

        Button btnEntrar = (Button) findViewById(R.id.btnEntrar);
        btnEntrar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Retrofit retrofit = RetrofitSingleton.getIntance();
        String email = edtUsername.getText().toString();
        String senha = edtPassword.getText().toString();
        UserParameter user = new UserParameter(email, senha);

        LoginAPI loginCliente = retrofit.create(LoginAPI.class);
        Call<Login> call = loginCliente.logar(user);
        call.enqueue(new Callback<Login>() {
            @Override
            public void onResponse(Call<Login> call, Response<Login> response) {
                Login usuario = response.body();
                Intent intent = new Intent(_this, PrincipalActivity.class);
                intent.putExtra("nome", usuario.getUser().getUsername());
                intent.putExtra("email", usuario.getUser().getEmail());
                intent.putExtra("message", usuario.getMessage());
                startActivity(intent);
            }

            @Override
            public void onFailure(Call<Login> call, Throwable t) {
                t.printStackTrace();
                Toast.makeText(LoginActivity.this, "Erro :(", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
