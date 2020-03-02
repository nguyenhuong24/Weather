package com.nguyenhuong.baitapday13.modal;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Match {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("doi1")
    @Expose
    private String doi1;
    @SerializedName("quocky1")
    @Expose
    private String quocky1;
    @SerializedName("doi2")
    @Expose
    private String doi2;
    @SerializedName("quocky2")
    @Expose
    private String quocky2;
    @SerializedName("ngay")
    @Expose
    private String ngay;
    @SerializedName("gio")
    @Expose
    private String gio;
    @SerializedName("vong")
    @Expose
    private String vong;
    @SerializedName("kenh")
    @Expose
    private String kenh;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDoi1() {
        return doi1;
    }

    public void setDoi1(String doi1) {
        this.doi1 = doi1;
    }

    public String getQuocky1() {
        return quocky1;
    }

    public void setQuocky1(String quocky1) {
        this.quocky1 = quocky1;
    }

    public String getDoi2() {
        return doi2;
    }

    public void setDoi2(String doi2) {
        this.doi2 = doi2;
    }

    public String getQuocky2() {
        return quocky2;
    }

    public void setQuocky2(String quocky2) {
        this.quocky2 = quocky2;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getGio() {
        return gio;
    }

    public void setGio(String gio) {
        this.gio = gio;
    }

    public String getVong() {
        return vong;
    }

    public void setVong(String vong) {
        this.vong = vong;
    }

    public String getKenh() {
        return kenh;
    }

    public void setKenh(String kenh) {
        this.kenh = kenh;
    }
}


