/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import connectDb.DBHelper;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Movies;
import model.Ve;

/**
 *
 * @author Admin
 */
public class VeDAO {

    public static List<Ve> getAll() {
        List<Ve> list = new ArrayList<>();
        try {
            Connection con = DBHelper.getConnectionDB();
            String SQL = "SELECT * FROM HOADON";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                Ve emp = new Ve();
                emp.setMahoadon(rs.getString("MA_HOA_DON"));
                emp.setMakhachhang(rs.getString("MA_KHACH_HANG"));
                emp.setManv(rs.getString("MA_NHANVIEN"));
                emp.setMaphim(rs.getString("MA_PHIM"));
                emp.setTenphim(rs.getString("TEN_PHIM"));
                emp.setSove(rs.getInt("SO_VE"));
                emp.setSuatchieu(rs.getString("SUAT_CHIEU"));
                emp.setNgaymua(rs.getDate("NGAY_MUA"));
                emp.setPhong(rs.getString("PHONG"));
                emp.setMaghe(rs.getString("MA_GHE"));
                emp.setSohang(rs.getString("SO_HANG"));
                emp.setSocot(rs.getString("SO_COT"));
                emp.setTongtien(rs.getInt("TONG_TIEN"));
                list.add(emp);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Kết nối thất bại");
            e.printStackTrace();
        }
        return list;
    }

    public static int insert(Ve v) {
        int rs = 0;
        try {
            Connection con = DBHelper.getConnectionDB();

            String sql = "INSERT INTO HOADON VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, v.getMahoadon());
            statement.setString(2, v.getMakhachhang());
            statement.setString(3, v.getManv());
            statement.setString(4, v.getMaphim());
            statement.setString(5, v.getTenphim());
            statement.setInt(6, v.getSove());
            statement.setString(7, v.getSuatchieu());
            statement.setDate(8, (Date) v.getNgaymua());
            statement.setString(9, v.getPhong());
            statement.setString(10, v.getMaghe());
            statement.setString(11, v.getSohang());
            statement.setString(12, v.getSocot());
            statement.setInt(13, v.getTongtien());

            rs = statement.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return rs;
    }
}
