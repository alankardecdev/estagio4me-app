package com.estagio4me.Model.apiEst4Me;

import com.estagio4me.Model.apiEst4Me.abstractModel.AbstractModel;

import java.util.List;

/**
 * Created by alankardec on 29/05/17.
 */

public class Profile extends AbstractModel {

    private List<SkillModel> likedSkills;
    private List<SkillModel> experiencedSkills;
    private User user;

    public List<SkillModel> getLikedSkills() {
        return likedSkills;
    }

    public void setLikedSkills(SkillModel likedSkills) {
        this.likedSkills.add(likedSkills);
    }

    public List<SkillModel> getExperiencedSkills() {
        return experiencedSkills;
    }

    public void setExperiencedSkills(SkillModel experiencedSkills) {
        this.experiencedSkills.add(experiencedSkills);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
