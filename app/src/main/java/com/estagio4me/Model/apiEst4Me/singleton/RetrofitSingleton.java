package com.estagio4me.Model.apiEst4Me.singleton;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by alankardec on 24/08/17.
 */

public class RetrofitSingleton {

    private static Retrofit retrofit = null;
    private static String URL = "https://estagio4me-server.herokuapp.com";

    public static Retrofit getIntance() {
        if(retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;

    }

}
