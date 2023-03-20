package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private final String userName = "root";
    private final String  password = "root";
    private final String connectionURL = "jdbc:mysql://localhost:3306/my_db";

    public Connection getConnection() {
        Connection connection;
        {
            try {
                connection = DriverManager.getConnection(connectionURL, userName, password);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return connection;
    }
}
