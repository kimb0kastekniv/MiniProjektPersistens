package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import dblayer.DBConnection;

class TryToConnect {
    
    private static DBConnection dbConnection;
    private static Connection connection;
    
    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        dbConnection = DBConnection.getInstance();
        connection = dbConnection.getConnection();
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
        
    }

    @Test
    void testConnection() {
        try {
            assertFalse(connection.isClosed());
            System.out.println("Connection is open!");
        } catch (SQLException e) {
            e.printStackTrace();
            fail("Connection is closed!");
        }
    }
}
