package com.estagio4me.Model.apiEst4Me;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by alankardec on 23/08/17.
 */

public class Login implements Serializable {

    @SerializedName("user")
    private User user;
    @SerializedName("token")
    private String token;
    @SerializedName("message")
    private String message;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
