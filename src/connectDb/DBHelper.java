/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectDb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nttai
 */
public class DBHelper {
    public static Connection getConnectionDB(){
        String connectionUrl = "jdbc:sqlserver://localhost:1433;"
                + "databaseName=QLRP;"
                + "user=sa;password=12345;"
                + "encrypt=true;trustServerCertificate=true;";

        try {
            //ket noi vo sql sever
            Connection con = DriverManager.getConnection(connectionUrl); 
            System.out.println("ket noi thanh cong");
            return con;
            
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            System.out.println("ket noi loi");
            e.printStackTrace();
        }
        return null;
    }
}
