package Ros_A_Tik.Data;

import java.sql.*;

public class MyFirstSQL {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/ros_a_tik";
        String user = "root";
        String password = "13579MySql08642#";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM rst_user");

            while (rs.next()) {
                System.out.println(rs.getInt("user_id"));
                System.out.println(rs.getString("user_email"));
                System.out.println(rs.getString("user_countryCode"));
                System.out.println(rs.getString("user_phone"));
                System.out.println(rs.getString("user_password"));

            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


