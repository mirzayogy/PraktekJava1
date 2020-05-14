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

    public static void main(String[] args) {
        Matakuliah matakuliah;
        ArrayList<Matakuliah> matakuliahList = new ArrayList<>();
        MyConnection myConnection = new MyConnection();
        Connection con = myConnection.getConnection();

        String selectQuery = "Select * FROM matakuliah ";
        Statement statement;
        ResultSet resultSet;

        try{
            statement = con.createStatement();
            resultSet =statement.executeQuery(selectQuery);
            while(resultSet.next()){
                matakuliah = new Matakuliah(
                        resultSet.getInt("id_matakuliah"),
                        resultSet.getString("nama_matakuliah"),
                        resultSet.getString("singkatan_matakuliah"),
                        resultSet.getString("nama_dosen"),
                        resultSet.getString("kontak_dosen"),
                        resultSet.getBoolean("aktif")
                );
                matakuliahList.add(matakuliah);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        for (Matakuliah value : matakuliahList) {
            System.out.print(value.getIdMatakuliah());
            System.out.print("\t");
            System.out.print(value.getSingkatanMatakuliah());
            System.out.print("\t");
            System.out.print(value.getNamaDosen());
            System.out.println();
        }
    }
}
