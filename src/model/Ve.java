/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Ve {

    private String mahoadon, makhachhang, manv, maphim, tenphim;
    private int sove;
    private String suatchieu;
    private Date ngaymua;
    private String phong, maghe, sohang, socot;
    private int tongtien;

    public String getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(String mahoadon) {
        this.mahoadon = mahoadon;
    }

    public String getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(String makhachhang) {
        this.makhachhang = makhachhang;
    }

    public String getMaphim() {
        return maphim;
    }

    public void setMaphim(String maphim) {
        this.maphim = maphim;
    }

    public String getTenphim() {
        return tenphim;
    }

    public void setTenphim(String tenphim) {
        this.tenphim = tenphim;
    }

    public int getSove() {
        return sove;
    }

    public void setSove(int sove) {
        this.sove = sove;
    }

    public String getSuatchieu() {
        return suatchieu;
    }

    public void setSuatchieu(String suatchieu) {
        this.suatchieu = suatchieu;
    }

    public Date getNgaymua() {
        return ngaymua;
    }

    public void setNgaymua(Date ngaymua) {
        this.ngaymua = ngaymua;
    }

    public String getPhong() {
        return phong;
    }

    public void setPhong(String phong) {
        this.phong = phong;
    }

    public String getMaghe() {
        return maghe;
    }

    public void setMaghe(String maghe) {
        this.maghe = maghe;
    }

    public String getSohang() {
        return sohang;
    }

    public void setSohang(String sohang) {
        this.sohang = sohang;
    }

    public String getSocot() {
        return socot;
    }

    public void setSocot(String socot) {
        this.socot = socot;
    }

    public int getTongtien() {
        return tongtien;
    }

    public void setTongtien(int tongtien) {
        this.tongtien = tongtien;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public Ve(String mahoadon, String makhachhang, String manv, String maphim, String tenphim, int sove, String suatchieu, Date ngaymua, String phong, String maghe, String sohang, String socot, int tongtien) {
        this.mahoadon = mahoadon;
        this.makhachhang = makhachhang;
        this.manv = manv;
        this.maphim = maphim;
        this.tenphim = tenphim;
        this.sove = sove;
        this.suatchieu = suatchieu;
        this.ngaymua = ngaymua;
        this.phong = phong;
        this.maghe = maghe;
        this.sohang = sohang;
        this.socot = socot;
        this.tongtien = tongtien;
    }

    public Ve() {
    }
}
