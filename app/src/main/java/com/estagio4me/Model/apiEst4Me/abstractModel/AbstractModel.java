package com.estagio4me.Model.apiEst4Me.abstractModel;

import java.util.Date;

/**
 * Created by alankardec on 29/05/17.
 */

public abstract class AbstractModel {
    private Date createdAt;
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
