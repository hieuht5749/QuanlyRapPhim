/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import connectDb.DBHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.PhanAnhKhachHang;

/**
 *
 * @author thuan
 */
public class PhanAnhKhachHangDAO {
// thêm dl 

    public static int insert(PhanAnhKhachHang emp) {
        int rs = 0;
        try {
            Connection con = DBHelper.getConnectionDB();
            String SQL = "INSERT INTO PHAN_ANH_KHACH_HANG VALUES(?,?,?)";
            PreparedStatement stmt = con.prepareStatement(SQL);
            stmt.setString(1, emp.getMaKH());
            stmt.setString(2, emp.getTenKh());
            stmt.setString(3, emp.getNoiDung());
            rs = stmt.executeUpdate();
            con.close();
        } catch (SQLException e) {
            System.out.println("Kết nối lỗi ");
            e.printStackTrace();
        }
        return rs;
    }
    //truy vấn    

    public static List<PhanAnhKhachHang> getAll() {
        List<PhanAnhKhachHang> list = new ArrayList<>();
        try {
            Connection con = DBHelper.getConnectionDB();
            String SQL = "SELECT * FROM PHAN_ANH_KHACH_HANG ";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                PhanAnhKhachHang emp = new PhanAnhKhachHang();
                emp.setMaKH(rs.getString("MA_KHACH_HANG"));
                emp.setTenKh(rs.getString("TEN_KH"));
                emp.setNoiDung(rs.getString("NOI_DUNG"));
                list.add(emp);
            }
        } catch (SQLException e) {
            System.out.println("Kết nối thất bại");
            e.printStackTrace();
        }
        return list;
    }

//    public static PhanAnhKhachHang Select(PhanAnhKhachHang emp) {
//        PhanAnhKhachHang gr = null;
//        try {
//            Connection con = DBHelper.getConnectionDB();
//            String SQL1 = "SELECT * FROM PHAN_ANH_KHACH_HANG A INNER JOIN KHACH_HANG B ON A.MA_KHACH_HANG = B.MA_KHACH_HANG WHERE B.MA_KHACH_HANG LIKE ?";
//            PreparedStatement stmt1 = con.prepareStatement(SQL1);
//            stmt1.setString(1, emp.getMaKH());
//            ResultSet rs1 = stmt1.executeQuery();
//
//            String SQL2 = "SELECT * FROM  KHACH_HANG WHERE MA_KHACH_HANG LIKE ?";
//            PreparedStatement stmt2 = con.prepareStatement(SQL2);
//            stmt2.setString(1, emp.getMaKH());
//            ResultSet rs2 = stmt2.executeQuery();
//
//            if (rs1.next()) {
//                gr = new PhanAnhKhachHang();
//                gr.setMaKH(rs1.getString("MA_KHACH_HANG"));
//                gr.setTenKh(rs1.getString("TEN_KHACH_HANG"));
//                gr.setNoiDung(rs1.getString("NOI_DUNG"));
//            } else if (rs2.next()) {
//                gr = new PhanAnhKhachHang();
//                gr.setMaKH(rs2.getString("MA_KHACH_HANG"));
//                gr.setTenKh(rs2.getString("TEN_KHACH_HANG"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return gr;
//    }
}
