package com.estagio4me.Model.apiEst4Me;

import com.estagio4me.Model.apiEst4Me.Internship;
import com.estagio4me.Model.apiEst4Me.User;
import com.estagio4me.Model.apiEst4Me.abstractModel.AbstractModel;

/**
 * Created by alankardec on 29/05/17.
 */

public class Rating extends AbstractModel {

    private float stars;
    private Internship internship;
    private User user;

    public float getStars() {
        return stars;
    }

    public void setStars(float stars) {
        this.stars = stars;
    }

    public Internship getInternship() {
        return internship;
    }

    public void setInternship(Internship internship) {
        this.internship = internship;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
