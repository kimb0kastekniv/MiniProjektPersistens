package dblayer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Customer;

public class DBCustomer implements DBCustomerIF {
	private static final String selectAllQ = "SELECT * FROM Customer";
	private static final String findCustomerByIdQ = selectAllQ + " WHERE customer_Id = ?";
	
	private PreparedStatement selectAll;
	private PreparedStatement findCustomerById;
	
	public DBCustomer() throws SQLException {
		selectAll = DBConnection.getInstance().getConnection()
				.prepareStatement(selectAllQ);
		findCustomerById = DBConnection.getInstance().getConnection()
				.prepareStatement(findCustomerByIdQ);
	}
	
	public Customer findCustomerById(int customerId) throws SQLException {
		try {
			findCustomerById.setInt(1, customerId);
			ResultSet rs = findCustomerById.executeQuery();
			rs.getStatement().toString();
			Customer customer = null;
			
			// Checks if another row exists in the result set, if so returns true
			if(rs.next()) {
				customer = buildCustomerFromRS(rs);
			}
			else {
				throw new SQLException();
			}
			return customer;
		}
		catch (SQLException e){
			e.getStackTrace();
			throw new SQLException();
			}
	}

		private Customer buildCustomerFromRS(ResultSet rs) throws SQLException{
			try {
			Customer tempCustomer = new Customer(
				rs.getInt("customer_Id"),
				rs.getString("streetName"),
				rs.getInt("streetNo"),
				rs.getInt("zipcode"),
				rs.getInt("country_Id"),
				rs.getInt("phone"),
				rs.getString("email"),
				rs.getInt("customerType")
					);
			return tempCustomer;
			}
			catch (SQLException e) {
				e.printStackTrace();
				throw e;
		}
	}
}