/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamelagu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author windows
 */
public class Koneksi {

    public static Connection conn;

//    public Koneksi() {
//        konek();
//    }

    public static void konek() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gamelagu", "root", "");
            System.out.println("Koneksi berhasil");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Koneksi gagal. kesalahan " + ex);
        }
    }

    public Connection getKoneksi() {
        return conn;
    }
}
