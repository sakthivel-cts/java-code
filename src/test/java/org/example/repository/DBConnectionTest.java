package org.example.repository;

import java.util.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.*;

public class DBConnectionTest {

    @Test
    public void dbConnectionTest() {
        DBConnection dbConnection = new DBConnection();

        Connection connection = dbConnection.dbConnection(
                "",
                "",
                ""
        );

        assertNull(connection);

    }
}