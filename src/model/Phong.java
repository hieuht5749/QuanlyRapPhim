/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author thuan
 */
public class Phong {
    private String Ma;
    private String Ten;
    private int soLuongGhe;
    private String tinhTrang;

    public Phong() {
    }

    public Phong(String Ma, String Ten, int soLuongGhe, String tinhTrang) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.soLuongGhe = soLuongGhe;
        this.tinhTrang = tinhTrang;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public int getSoLuongGhe() {
        return soLuongGhe;
    }

    public void setSoLuongGhe(int soLuongGhe) {
        this.soLuongGhe = soLuongGhe;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    
    
}
