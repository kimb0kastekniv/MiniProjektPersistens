package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dblayer.*;

class DBProductTest {

	static DBConnection con = null;
	
	@BeforeEach
	void setUp() throws Exception {
		con = DBConnection.getInstance();
	}

	@AfterEach
	void tearDown() throws Exception {
		
	}

	@Test
	void ChecksIfDBProductReturnsCorrectNameOfItem() throws SQLException {
		// Arrange
		DBProduct dbProduct = new DBProduct();
		int productIdToFind = 1;
		
		String expectedName = "Denims";
		
		// Act
		String result = dbProduct.findProductByBarcode(productIdToFind).getName();
		
		// Assert
		assertEquals(expectedName, result);	
	}
	
	@Test
	void ChecksIfDBProductReturnsCorrectType() throws SQLException {
		// Arrange
		DBProduct dbProduct = new DBProduct();
		int productIdToFind = 4;
		
		int expectedType = 3;
		
		// Act
		int result = dbProduct.findProductByBarcode(productIdToFind).getType();
		
		// Assert
		assertEquals(expectedType, result);
	}
	
	@Test
	void ChecksIfDBCustomerThrowsWhenNonExistentCustomerId() throws SQLException{
		// Arrange
		DBProduct dbProduct = new DBProduct();
		
		int nonExistentProductId = 12;
		
		// Act
		
		
		// Assert
		assertThrows(SQLException.class, () -> {
			dbProduct.findProductByBarcode(nonExistentProductId);
		});
	}

}
