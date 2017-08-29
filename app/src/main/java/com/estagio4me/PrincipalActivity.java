package com.estagio4me;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.estagio4me.Model.apiEst4Me.Internship;
import com.estagio4me.Model.apiEst4Me.singleton.RetrofitSingleton;
import com.estagio4me.Service.InternshipAPI;
import com.estagio4me.ui.InternshipAdapter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class PrincipalActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        Retrofit retrofit = RetrofitSingleton.getIntance();
        InternshipAPI internshipAPI = retrofit.create(InternshipAPI.class);
        final Activity app = this;
        SharedPreferences preferences = getSharedPreferences("config", MODE_PRIVATE);
        Call<List<Internship>> call = internshipAPI.findAll(preferences.getString("token", null));
        call.enqueue(new Callback<List<Internship>>() {
            @Override
            public void onResponse(Call<List<Internship>> call, Response<List<Internship>> response) {
                List<Internship> internships = response.body();
                InternshipAdapter adapter = new InternshipAdapter(internships, app);
                ListView listInternship = (ListView) findViewById(R.id.lista);
                listInternship.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Internship>> call, Throwable t) {

            }
        });


    }

}
