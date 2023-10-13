package Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.SQLException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dblayer.*;

class DBSaleOrderTest {

	static DBConnection con = null;
	
	@BeforeEach
	void setUp() throws Exception {
		con = DBConnection.getInstance();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void ChecksIfDBSaleOrderReturnsCorrectDeliveryStatus() throws SQLException {
		// Arrange
		DBSaleOrder dbSaleOrder = new DBSaleOrder();
		int saleOrderIdToFind = 3;
		
		// Act
		boolean result = dbSaleOrder.findSaleOrderById(saleOrderIdToFind).isDeliveryStatus();
		
		// Assert
		assertTrue(result);
	}
	
	@Test
	void ChecksifDBSaleOrderThrowsWhenNonExistentSaleOrderId() throws SQLException {
		// Arrange
		DBSaleOrder dbSaleOrder = new DBSaleOrder();
		int nonExistentSaleOrderId = 10;
		
		// Act
		
		// Assert
        assertThrows(SQLException.class, () -> {
            dbSaleOrder.findSaleOrderById(nonExistentSaleOrderId);	
        });
		
	}
}
