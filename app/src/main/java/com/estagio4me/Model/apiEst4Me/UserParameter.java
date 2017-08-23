package com.estagio4me.Model.apiEst4Me;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by alankardec on 23/08/17.
 */

public class UserParameter implements Serializable {

    @SerializedName("_username")
    private String username;
    @SerializedName("_password")
    private String password;

    public UserParameter() {}

    public UserParameter(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
