package org.example.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRepository {

    Connection conn;
    private final Logger logger = LoggerFactory.getLogger(UserRepository.class);

    public UserRepository(Connection conn) {
        this.conn = conn;
    }

    public ResultSet getAllUsers() {

        String query = "SELECT * FROM users";
        PreparedStatement ps;
        ResultSet rs = null;

        try {
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
        } catch (SQLException e) {
            logger.error("Error in SQL Query Execution", e);
        } catch (Exception e) {
            logger.error("Error in Query Execution", e);
        }

        return rs;
    }
}