package com.estagio4me.Model.apiEst4Me.abstractModel;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Created by alankardec on 29/05/17.
 */

public abstract class AbstractModel {

    @SerializedName("_createdAt")
    private Date createdAt;
    @SerializedName("_updatedAt")
    private Date updatedAt;

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
