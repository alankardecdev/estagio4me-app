package com.estagio4me.Model.apiEst4Me.singleton;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by alankardec on 24/08/17.
 */

public class RetrofitSingleton {

    private static Retrofit retrofit = null;
    private static String URL = "http://172.16.13.98:3000";

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
