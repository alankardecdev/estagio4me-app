package com.estagio4me.Model.apiEst4Me;

import com.estagio4me.Model.apiEst4Me.abstractModel.AbstractModel;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by alankardec on 29/05/17.
 */

public class Internship extends AbstractModel implements Serializable{

    @SerializedName("_companyName") private String companyName;
    @SerializedName("_role") private String role;
    @SerializedName("_requiredSkills") private List<SkillModel> requiredSkills;
    @SerializedName("_prederredSkills") private List<SkillModel> preferredSkills;
    @SerializedName("_compensation") private float compensation;
    @SerializedName("_isCompanyPrivate") private boolean isCompanyPrivate;
    @SerializedName("_isCompensationPrivate") private boolean isCompensationPrivate;
    @SerializedName("_isActive") private boolean isActive;
    @SerializedName("_contact") private String contact;
    @SerializedName("_area") private String area;
    @SerializedName("_description") private String description;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<SkillModel> getRequiredSkills() {
        return requiredSkills;
    }

    public void setRequiredSkills(SkillModel requiredSkills) {
        this.requiredSkills.add(requiredSkills);
    }

    public List<SkillModel> getPreferredSkills() {
        return preferredSkills;
    }

    public void setPreferredSkills(SkillModel preferredSkills) {
        this.preferredSkills.add(preferredSkills);
    }

    public float getCompensation() {
        return compensation;
    }

    public void setCompensation(float compensation) {
        this.compensation = compensation;
    }

    public boolean isCompanyPrivate() {
        return isCompanyPrivate;
    }

    public void setCompanyPrivate(boolean companyPrivate) {
        isCompanyPrivate = companyPrivate;
    }

    public boolean isCompensationPrivate() {
        return isCompensationPrivate;
    }

    public void setCompensationPrivate(boolean compensationPrivate) {
        isCompensationPrivate = compensationPrivate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
