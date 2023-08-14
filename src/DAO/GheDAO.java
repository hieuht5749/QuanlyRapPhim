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
import model.Ghe;
import model.Phong;

/**
 *
 * @author Admin
 */
public class GheDAO {
       public static List<Ghe> getAll() {
        List<Ghe> list = new ArrayList<>();
        try {
            Connection con = DBHelper.getConnectionDB();
            String SQL = "SELECT * FROM GHE";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                Ghe emp = new Ghe();
                emp.setMaghe(rs.getString("MA_GHE"));
                emp.setHang(rs.getString("SO_HANG"));
                emp.setCot(rs.getInt("SO_COT"));
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
