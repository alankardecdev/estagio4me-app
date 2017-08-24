package com.estagio4me.Model.apiEst4Me;

import com.estagio4me.Model.apiEst4Me.abstractModel.AbstractModel;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by alankardec on 29/05/17.
 */

public class User extends AbstractModel implements Serializable {

    @SerializedName("_firstName") private String firstName;
    @SerializedName("_lastName") private String lastName;
    @SerializedName("_email") private String email;
    @SerializedName("_password") private String password;
    @SerializedName("_username") private String username;
    @SerializedName("_isAdmin") private Boolean isAdmin = false;


    public User() {}

    public User(String firstName, String lastName, String email, String password, String username) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.username = username;
    }

    public Boolean getAdmin() { return isAdmin; }

    public void setAdmin(Boolean admin) { isAdmin = admin; }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
