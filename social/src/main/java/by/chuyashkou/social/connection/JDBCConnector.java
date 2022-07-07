package by.chuyashkou.social.connection;


import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnector {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/social";
    private static final String USER = "root";
    private static final String PASSWORD = "user";
    private Connection connection;

    @SneakyThrows
    public Connection getConnection() {
        Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        return connection;
    }
}
