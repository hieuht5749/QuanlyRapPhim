/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import connectDb.DBHelper;
import java.util.List;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Movies;
import connectDb.DBHelper;
import java.sql.Date;

/**
 *
 * @author Admin
 */
public class MoviesDAO {

    public static List<Movies> getAll() {
        List<Movies> movieses = new ArrayList<>();
        try {

//            movieses.clear();
            Connection con = DBHelper.getConnectionDB();
            String sql = "select * from PHIM";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Movies mv = new Movies();
                mv.setMaPhim(rs.getString("MA_PHIM"));
                mv.setTenPhim(rs.getString("TEN_PHIM"));
                mv.setDaoDien(rs.getString("DAO_DIEN"));
                mv.setGiaPhim(rs.getString("GIA_PHIM"));
                mv.setTheLoai(rs.getString("THE_LOAI"));
                mv.setThoiLuong(rs.getInt("THOI_LUONG"));
                mv.setNgPhatHanh(rs.getDate("NG_PHAT_HANH"));
                mv.setBackround(rs.getString("BACKGROUGD"));
                movieses.add(mv);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return movieses;
    }
//    them du lieu phim

    public static int insert(Movies movies) {
        int rs = 0;
        try {
            Connection con = DBHelper.getConnectionDB();

            String sql = "INSERT INTO QLRP VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, movies.getMaPhim());
            statement.setString(2, movies.getTenPhim());
            statement.setString(3, movies.getDaoDien());
            statement.setString(4, movies.getGiaPhim());
            statement.setString(5, movies.getTheLoai());
            statement.setInt(6, movies.getThoiLuong());
         statement.setDate(7, (Date) movies.getNgPhatHanh());
            statement.setString(8, movies.getBackround());

            rs = statement.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return rs;
    }
//    public static int update(Connection con, Students student){
//        try{
//            int rs = 0;
//            String sql = "UPDATE STUDENTS SET HOTEN=?, EMAIL =?, SODT=?,GIOITINH=?,DIACHI=? WHERE MASV=?";
//            PreparedStatement statement = con.prepareStatement(sql);
//            
//            statement.setString(1, student.getHoTen());
//            statement.setString(2, student.getEmail());
//            statement.setString(3, student.getSoDT());
//            statement.setInt(4, student.getGioiTinh());
//            statement.setString(5, student.getDiaChi());
//            statement.setString(6, student.getMaSV());
//            rs = statement.executeUpdate();
//            return rs;
//        }catch(Exception ex){
//            
//        }
//        return 0;
//    }
//    
//    public static int delet(Connection con, Students student){
//        try{
//            int rs = 0;
//            String sql = "delete from STUDENTS WHERE MASV=?";
//            PreparedStatement statement = con.prepareStatement(sql);
//            
//            
//            statement.setString(1, student.getMaSV());
//            rs = statement.executeUpdate();
//            return rs;
//        }catch(Exception ex){
//            
//        }
//        return 0;
//    }
}
