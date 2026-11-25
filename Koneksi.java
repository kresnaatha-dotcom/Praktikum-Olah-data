/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumcrud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static final String URL = "jdbc:mysql://localhost:3306/db_mahasiswa";
    private static final String USER = "root";
    private static final String PASS = ""; // XAMPP bawaan: password kosong
    public static Connection getConnection() throws SQLException {
    return DriverManager.getConnection(URL, USER, PASS);
}
}
