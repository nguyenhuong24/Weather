package com.nguyenhuong.baitapday13.modal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Player {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("ten")
    @Expose
    private String ten;
    @SerializedName("doi")
    @Expose
    private String doi;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("social")
    @Expose
    private String social;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSocial() {
        return social;
    }

    public void setSocial(String social) {
        this.social = social;
    }

}

