package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/hotel_db";

        String username = "root";
        String password = "password";
        try
        // Class.forName("com.mysql.cj.jdbc.Driver");
        (Connection conn = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected to Database Successfully....!!!");
        } catch (SQLException e) {
            // Throwable e;
            System.out.println("Connection failed: "+e.getMessage());
        }
    }
}
