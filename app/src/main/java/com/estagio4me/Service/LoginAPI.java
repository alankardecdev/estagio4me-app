package com.estagio4me.Service;

import com.estagio4me.Model.apiEst4Me.Login;
import com.estagio4me.Model.apiEst4Me.UserParameter;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by alankardec on 23/08/17.
 */

public interface LoginAPI {

    @POST("/api/login/login")
    Call<Login> logar(@Body UserParameter userParameter);
}
