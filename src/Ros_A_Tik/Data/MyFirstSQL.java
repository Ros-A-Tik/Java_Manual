package Ros_A_Tik.Data;

import java.sql.*;

public class MyFirstSQL {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/__________";
        String user = "_________";
        String password = "**********************";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM rst_user");

            while (rs.next()) {
                System.out.println(rs.getInt("______"));
                System.out.println(rs.getString("_______"));
                System.out.println(rs.getString("______"));
                System.out.println(rs.getString("_______"));
                System.out.println(rs.getString("________"));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


