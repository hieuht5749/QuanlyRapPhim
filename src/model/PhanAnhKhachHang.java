/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author thuan
 */
public class PhanAnhKhachHang {

    String maKH;
    String noiDung;
    String tenKh;

    public PhanAnhKhachHang() {
    }

    public PhanAnhKhachHang(String maKH, String noiDung, String tenKh) {
        this.maKH = maKH;
        this.noiDung = noiDung;
        this.tenKh = tenKh;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getTenKh() {
        return tenKh;
    }

    public void setTenKh(String tenKh) {
        this.tenKh = tenKh;
    }

}
