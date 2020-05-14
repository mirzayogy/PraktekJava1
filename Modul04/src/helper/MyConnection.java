package helper;

import model.Matakuliah;

import java.sql.*;
import java.util.ArrayList;

public class MyConnection {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/db_pekerjaan_rumah?serverTimezone=Asia/Makassar";

    static final String USER = "root";
    static final String PASS = "";

    public Connection getConnection(){
        Connection con = null;
        try{
            Class.forName(JDBC_DRIVER);
            System.out.println("Sedang menghubungkan..");
            con = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("Berhasil");
            return con;

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
