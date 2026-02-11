package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {

    private static final String URL =
            "jdbc:mysql://localhost:3306/db_peminjaman?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "";

    public static Connection getConnection() {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Koneksi database BERHASIL");
            return conn;
        } catch (SQLException e) {
            System.out.println("Koneksi database GAGAL");
            e.printStackTrace();
            return null;
        }
    }
}
