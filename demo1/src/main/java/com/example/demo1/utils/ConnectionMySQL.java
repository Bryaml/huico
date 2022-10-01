package com.example.demo1.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMySQL {
    public  static Connection getConnection() throws SQLException {
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/huico?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root"

        );
    }
}
