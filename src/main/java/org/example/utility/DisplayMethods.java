package org.example.utility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DisplayMethods {

    private final Logger logger = LoggerFactory.getLogger(DisplayMethods.class);

    public void displayResultSet(ResultSet rs) {

        try {
            while (rs.next()) System.out.printf("%d | %s | %d%n",
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age")
                    );
        } catch (SQLException e) {
            logger.error("Error while printing result set", e);
        }
    }
}