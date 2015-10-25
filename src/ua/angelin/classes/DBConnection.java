package ua.angelin.classes;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Ангелин on 25.10.2015.
 */
public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static  final String USER = "root";
    private static final String PASSWORD = "aass8885";
    private static Connection connection;

    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            if (connection != null) {
                closeConnection();
            }
            e.printStackTrace();
        }
        return connection;
    }
    public static void closeConnection(){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
