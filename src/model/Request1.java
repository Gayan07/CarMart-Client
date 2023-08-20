package model;

import java.io.Serializable;

public class Request1 implements Serializable {
    private  Integer rID = null;
    private  String rBrandName = null;
    private  String rModel = null;
    private  String rColor = null;
    private  String rCusName = null;
    private  String rCusEmail = null;
    private  Integer rContactNo = null;

    public Request1() {
    }

    public Request1(Integer rID, String rBrandName, String rModel, String rColor, String rCusName, String rCusEmail, Integer rContactNo) {
        this.rID = rID;
        this.rBrandName = rBrandName;
        this.rModel = rModel;
        this.rColor = rColor;
        this.rCusName = rCusName;
        this.rCusEmail = rCusEmail;
        this.rContactNo = rContactNo;
    }

    public Integer getrID() {
        return rID;
    }

    public void setrID(Integer rID) {
        this.rID = rID;
    }

    public String getrBrandName() {
        return rBrandName;
    }

    public void setrBrandName(String rBrandName) {
        this.rBrandName = rBrandName;
    }

    public String getrModel() {
        return rModel;
    }

    public void setrModel(String rModel) {
        this.rModel = rModel;
    }

    public String getrColor() {
        return rColor;
    }

    public void setrColor(String rColor) {
        this.rColor = rColor;
    }

    public String getrCusName() {
        return rCusName;
    }

    public void setrCusName(String rCusName) {
        this.rCusName = rCusName;
    }

    public String getrCusEmail() {
        return rCusEmail;
    }

    public void setrCusEmail(String rCusEmail) {
        this.rCusEmail = rCusEmail;
    }

    public Integer getrContactNo() {
        return rContactNo;
    }

    public void setrContactNo(Integer rContactNo) {
        this.rContactNo = rContactNo;
    }
}
