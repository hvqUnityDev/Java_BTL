/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btl_java_qlcf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.cj.jdbc.Driver;

public class ConnectMySQL {

    public static void main(String[] args) throws SQLException {
        ConnectToMySQLForLaptop();
    }

    public static void ConnectToMySQLForLaptop() {
        Connection connection = null;
        String url = "jdbc:mysql://localhost:3306/coffe_db";
        String username = "root";
        String password = "";
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Succes!");
            // Kết nối thành công, bạn có thể thực hiện các truy vấn SQL
            String query = "SELECT * FROM quyen";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                // Lấy dữ liệu từ các cột trong kết quả
                int column1Value = resultSet.getInt("ID");
                String column2Value = resultSet.getString("tenQuyen");
                // Làm cái gì đó với dữ liệu đã lấy được
                System.out.println("column1Value: " + column1Value + "-column2Value:" + column2Value);

            }

            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            System.out.println("E!");
        } finally {
            // Đảm bảo đóng kết nối sau khi không sử dụng nữa
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    // Xử lý ngoại lệ nếu không thể đóng kết nối
                    System.out.println("Err!");
                }
            }
        }
    }
}
