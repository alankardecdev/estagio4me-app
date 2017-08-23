package com.estagio4me;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by alankardec on 23/08/17.
 */

public class PrincipalActivity extends AppCompatActivity {

    TextView txtNome;
    TextView txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        txtNome = (TextView) findViewById(R.id.txtPrincipalNome);
        txtEmail = (TextView) findViewById(R.id.txtPrincipalEmail);

        Intent it = getIntent();

        String nome = it.getStringExtra("nome");
        txtNome.setText(nome);

        String email = it.getStringExtra("email");
        txtEmail.setText(email);



    }
}
