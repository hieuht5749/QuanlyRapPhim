/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import connectDb.DBHelper;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Phong;

/**
 *
 * @author thuan
 */
public class PhongDao {

    public static List<Phong> getAll() {
        List<Phong> list = new ArrayList<>();
        try {
            Connection con = DBHelper.getConnectionDB();
            String SQL = "SELECT * FROM PHONG";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                Phong emp = new Phong();
                emp.setMa(rs.getString("MA_PHONG"));
                emp.setTen(rs.getString("TEN_PHONG"));
                emp.setSoLuongGhe(rs.getInt("SO_GHE"));
                emp.setTinhTrang(rs.getString("MO_TA"));
                list.add(emp);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Kết nối thất bại");
            e.printStackTrace();
        }
        return list;
    }
}
