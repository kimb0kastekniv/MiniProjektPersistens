package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import dblayer.*;

class DBCustomerTest {

	static DBConnection con = null;

	@Before
	void setUp() throws Exception {
		con = DBConnection.getInstance();
	}

	@After
	void tearDown() throws Exception {
		con.disconnect();
	}

	@Test
	void ChecksIfDBCustomerReturnsCorrectPhoeno() throws SQLException{
		// Arrange
		DBCustomer dbCustomer = new DBCustomer();
		int customerIdToFind = 1;
		
		int expectedPhoneNumber = 51234567;
		
		// Act
        int result = dbCustomer.findCustomerById(customerIdToFind).getPhone();
        
		// Assert
        assertEquals(expectedPhoneNumber, result);
	}
	
	@Test
	void ChecksIfDBCustomerReturnsCorrectCustomerType() throws SQLException {
		// Arrange
		DBCustomer dbCustomer = new DBCustomer();
		int customerIdToFind = 4;
		
		int expectedCustomerType = 2;
		
		// Act
        int result = dbCustomer.findCustomerById(customerIdToFind).getCustomerType();
        
		// Assert
        assertEquals(expectedCustomerType, result);
	}
	
	@Test
	void ChecksIfDBCustomerThrowsWhenNonExistentCustomerId() throws SQLException {
		// Arrange
		DBCustomer dbCustomer = new DBCustomer();
		
		int nonExistentCustomerId = 9;
				
		// Act
		
		// Assert
        assertThrows(SQLException.class, () -> {
            dbCustomer.findCustomerById(nonExistentCustomerId);	
        });
	}

}