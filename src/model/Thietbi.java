/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Thietbi {

    private String matb, tentb;
    private int soluongtb;
    private String motatb, maphong;

    public String getMatb() {
        return matb;
    }

    public void setMatb(String matb) {
        this.matb = matb;
    }

    public String getTentb() {
        return tentb;
    }

    public void setTentb(String tentb) {
        this.tentb = tentb;
    }

    public int getSoluongtb() {
        return soluongtb;
    }

    public void setSoluongtb(int soluongtb) {
        this.soluongtb = soluongtb;
    }

    public String getMotatb() {
        return motatb;
    }

    public void setMotatb(String motatb) {
        this.motatb = motatb;
    }

    public String getMaphong() {
        return maphong;
    }

    public void setMaphong(String maphong) {
        this.maphong = maphong;
    }

    public Thietbi(String matb, String tentb, int soluongtb, String motatb, String maphong) {
        this.matb = matb;
        this.tentb = tentb;
        this.soluongtb = soluongtb;
        this.motatb = motatb;
        this.maphong = maphong;
    }

    public Thietbi() {
    }

}
