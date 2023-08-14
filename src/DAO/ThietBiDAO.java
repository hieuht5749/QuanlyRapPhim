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
import model.NhanVien;
import model.Phong;
import model.Thietbi;

/**
 *
 * @author Admin
 */
public class ThietBiDAO {

    public static List<Thietbi> getAll() {
        List<Thietbi> list = new ArrayList<>();
        try {
            Connection con = DBHelper.getConnectionDB();
            String SQL = "SELECT * FROM THIET_BI";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                Thietbi emp = new Thietbi();
                emp.setMatb(rs.getString("MA_THIET_BI"));
                emp.setTentb(rs.getString("TEN_THIET_BI"));
                emp.setSoluongtb(rs.getInt("SO_LUONG"));
                emp.setMotatb(rs.getString("MO_TA"));
                emp.setMaphong(rs.getString("MA_PHONG"));
                list.add(emp);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Kết nối thất bại");
            e.printStackTrace();
        }
        return list;
    }

    public static int insert(Thietbi emp) {
        int rs = 0;
        try {
            Connection con = DBHelper.getConnectionDB();
            String SQL = "INSERT INTO THIET_BI VALUES(?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(SQL);
            stmt.setString(1, emp.getMatb());
            stmt.setString(2, emp.getTentb());
            stmt.setInt(3, emp.getSoluongtb());
            stmt.setString(4,  emp.getMotatb());
            stmt.setString(5, emp.getMaphong());
            rs = stmt.executeUpdate();
            con.close();
        } catch (SQLException e) {
            System.out.println("Kết nối lỗi ");
            e.printStackTrace();
        }
        return rs;
    }
     public static int update(Thietbi emp) {
        int rs = 0;
        try {
            Connection con = DBHelper.getConnectionDB();
            String SQL = "UPDATE  THIET_BI SET TEN_THIET_BI =?, SO_LUONG=?, MO_TA=?, MA_PHONG=? WHERE MA_THIET_BI =?";
            PreparedStatement stmt = con.prepareStatement(SQL);
            stmt.setString(5, emp.getMatb());
            stmt.setString(1, emp.getTentb());
            stmt.setInt(2, emp.getSoluongtb());
            stmt.setString(3,  emp.getMotatb());
            stmt.setString(4, emp.getMaphong());
            rs = stmt.executeUpdate();
            con.close();
        } catch (SQLException e) {
            System.out.println("Kết nối lỗi ");
            e.printStackTrace();
        }
        return rs;
    }
     
         public static int delet(Thietbi movies) {
        int rs = 0;
        try {
            Connection con = DBHelper.getConnectionDB();
            String sql = "delete from THIET_BI WHERE MA_THIET_BI=?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, movies.getMatb());
            rs = statement.executeUpdate();
        } catch (Exception ex) {

        }
        return rs;
    }
    
}
