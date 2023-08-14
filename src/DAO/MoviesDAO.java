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
import java.util.Arrays;

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
                String theLoaiString = rs.getString("THE_LOAI");
                ArrayList<String> theLoaiList = new ArrayList<>(Arrays.asList(theLoaiString.split(", ")));
                mv.setTheLoai(theLoaiList);
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

            String sql = "INSERT INTO PHIM VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, movies.getMaPhim());
            statement.setString(2, movies.getTenPhim());
            statement.setString(3, movies.getDaoDien());
            statement.setString(4, movies.getGiaPhim());
            String theLoaiString = String.join(", ", movies.getTheLoai());
            statement.setString(5, theLoaiString);
            statement.setInt(6, movies.getThoiLuong());
            statement.setDate(7, (Date) movies.getNgPhatHanh());
            statement.setString(8, movies.getBackround());
            rs = statement.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return rs;
    }

    public static int update(Movies movies) {
        int rs = 0;
        try {
            Connection con = DBHelper.getConnectionDB();
            String sql = "UPDATE PHIM SET TEN_PHIM =?, DAO_DIEN=?,GIA_PHIM=?,THE_LOAI=?,THOI_LUONG =?, NG_PHAT_HANH=?, BACKGROUGD =? WHERE MA_PHIM=?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, movies.getTenPhim());
            statement.setString(2, movies.getDaoDien());
            statement.setString(3, movies.getGiaPhim());
            String theLoaiString = String.join(", ", movies.getTheLoai());
            statement.setString(4, theLoaiString);
            statement.setInt(5, movies.getThoiLuong());
            statement.setDate(6, (Date) movies.getNgPhatHanh());
            statement.setString(7, movies.getBackround());
            statement.setString(8, movies.getMaPhim());
            rs = statement.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return rs;
    }
//    

    public static int delet(Movies movies) {
        int rs = 0;
        try {
            Connection con = DBHelper.getConnectionDB();
            String sql = "delete from PHIM WHERE MA_PHIM=?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, movies.getMaPhim());
            rs = statement.executeUpdate();
        } catch (Exception ex) {

        }
        return rs;
    }
}
