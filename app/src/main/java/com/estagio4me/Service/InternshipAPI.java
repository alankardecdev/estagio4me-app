package com.estagio4me.Service;

import com.estagio4me.Model.apiEst4Me.Internship;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

/**
 * Created by alankardec on 29/08/17.
 */
public interface InternshipAPI {

    @GET("/api/internship/findAll")
    Call<List<Internship>> findAll(@Header("Authorization") String token);
}
