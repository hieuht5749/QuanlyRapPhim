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
import model.NhanVien;

/**
 *
 * @author thuan
 */
public class NhanVienDao {

    public static List<NhanVien> getAll() {
        List<NhanVien> list = new ArrayList<>();
        try {
            Connection con = DBHelper.getConnectionDB();
            String SQL = "SELECT * FROM NHAN_VIEN";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                NhanVien emp = new NhanVien();
                emp.setMaNV(rs.getString("MA_NHAN_VIEN"));
                emp.setTenNV(rs.getString("TEN_NHAN_VIEN"));
                emp.setGioiTinh(rs.getInt("GIOI_TINH"));
                emp.setNamSinh(rs.getDate("NGAY_SINH"));
                emp.setDiaChi(rs.getString("DIA_CHI"));
                emp.setSDT(rs.getString("SO_DIEN_THOAI"));
                emp.setEmail(rs.getString("EMAIL"));
                emp.setNgayVaoLam(rs.getDate("NGAY_VAO_LAM"));
                emp.setChucVu(rs.getString("CHUC_VU"));
                emp.setLuong(rs.getFloat("LUONG"));
                emp.setTrangThai(rs.getString("TRANG_THAI"));
                list.add(emp);
            }
        } catch (SQLException e) {
            System.out.println("Kết nối thất bại");
            e.printStackTrace();
        }
        return list;
    }

    public static int insert(NhanVien emp) {
        int rs = 0;
        try {
            Connection con = DBHelper.getConnectionDB();
            String SQL = "INSERT INTO NHAN_VIEN VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(SQL);
            stmt.setString(1, emp.getMaNV());
            stmt.setString(2, emp.getTenNV());
            stmt.setInt(3, emp.getGioiTinh());
            stmt.setDate(4, (Date) emp.getNamSinh());
            stmt.setString(5, emp.getDiaChi());
            stmt.setString(6, emp.getSDT());
            stmt.setString(7, emp.getEmail());
            stmt.setDate(8, (Date) emp.getNgayVaoLam());
            stmt.setString(9, emp.getChucVu());
            stmt.setDouble(10, emp.getLuong());
            stmt.setString(11, emp.getTrangThai());
            rs = stmt.executeUpdate();
            con.close();
        } catch (SQLException e) {
            System.out.println("Kết nối lỗi ");
            e.printStackTrace();
        }
        return rs;
    }

    public static int delete(NhanVien emp) {
        int rs = 0;
        try {
            Connection con = DBHelper.getConnectionDB();
            String SQL = "DELETE NHAN_VIEN WHERE MA_NHAN_VIEN= ?";
            PreparedStatement stmt = con.prepareStatement(SQL);
            stmt.setString(1, emp.getMaNV());
            rs = stmt.executeUpdate();
            con.close();
        } catch (SQLException e) {
            System.out.println("Kết nối lỗi ");
            e.printStackTrace();
        }
        return rs;
    }

    public static int update(NhanVien emp) {
        int rs = 0;
        try {
            Connection con = DBHelper.getConnectionDB();
            String SQL = "UPDATE NHAN_VIEN SET TEN_NHAN_VIEN =?, GIOI_TINH= ?, NGAY_SINH=?, "
                    + "DIA_CHI=?, SO_DIEN_THOAI= ?, EMAIL= ?,  NGAY_VAO_LAM= ?, CHUC_VU= ?, LUONG= ?, TRANG_THAI= ? WHERE MA_NHAN_VIEN=?";
            PreparedStatement stmt = con.prepareStatement(SQL);
            stmt.setString(11, emp.getMaNV());
            stmt.setString(1, emp.getTenNV());
            stmt.setInt(2, emp.getGioiTinh());
            stmt.setDate(3, (Date) emp.getNamSinh());
            stmt.setString(4, emp.getDiaChi());
            stmt.setString(5, emp.getSDT());
            stmt.setString(6, emp.getEmail());
            stmt.setDate(7, (Date) emp.getNgayVaoLam());
            stmt.setString(8, emp.getChucVu());
            stmt.setDouble(9, emp.getLuong());
            stmt.setString(10, emp.getTrangThai());
            rs = stmt.executeUpdate();
            con.close();
        } catch (SQLException e) {
            System.out.println("Kết nối lỗi ");
            e.printStackTrace();
        }
        return rs;
    }

}
