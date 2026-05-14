package org.example.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private final Logger logger = LoggerFactory.getLogger(DBConnection.class);

    public Connection dbConnection(String url, String user, String password) {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, user, password);

            logger.info("DB Connected Successfully");
        } catch (SQLException e) {
            logger.error("Error Connecting DB ", e);
        }

        return conn;
    }
}