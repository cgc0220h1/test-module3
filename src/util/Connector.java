package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Duc on 5/26/2020
 * @project test-module3-
 **/

public class Connector {
    public static final String DB_URL = "jdbc:mysql://localhost:3306/module3_test";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "123456";

    private Connector() {
    }

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
