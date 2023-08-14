/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Movies {
    private String maPhim, tenPhim, daoDien, giaPhim;
    private ArrayList<String> theLoai;
    
    public ArrayList<String> getTheLoai() {
        return theLoai;
    }

    public Movies(String maPhim, String tenPhim, String daoDien, String giaPhim, ArrayList<String> theLoai, int thoiLuong, Date ngPhatHanh, String backround) {
        this.maPhim = maPhim;
        this.tenPhim = tenPhim;
        this.daoDien = daoDien;
        this.giaPhim = giaPhim;
        this.theLoai = theLoai;
        this.thoiLuong = thoiLuong;
        this.ngPhatHanh = ngPhatHanh;
        this.backround = backround;
    }

    public void setTheLoai(ArrayList<String> theLoai) {
        this.theLoai = theLoai;
    }


    private int thoiLuong;
    private Date ngPhatHanh;
    private String backround;

    public Movies() {
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }



    public String getMaPhim() {
        return maPhim;
    }

    public void setMaPhim(String maPhim) {
        this.maPhim = maPhim;
    }

    public String getDaoDien() {
        return daoDien;
    }

    public void setDaoDien(String daoDien) {
        this.daoDien = daoDien;
    }

    public String getGiaPhim() {
        return giaPhim;
    }

    public void setGiaPhim(String giaPhim) {
        this.giaPhim = giaPhim;
    }



    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public Date getNgPhatHanh() {
        return ngPhatHanh;
    }

    public void setNgPhatHanh(Date ngPhatHanh) {
        this.ngPhatHanh = ngPhatHanh;
    }

    public String getBackround() {
        return backround;
    }

    public void setBackround(String backround) {
        this.backround = backround;
    }


    
}
