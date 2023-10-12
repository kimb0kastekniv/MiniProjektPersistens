package dblayer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Customer;

public class DBCustomer {
	private static final String selectAllQ = "SELECT c.*,cc.city,czc.zipCode FROM Customer c, CustomerCity cc,CityZipCode czc WHERE c.adress = cc.adress AND cc.city = czc.city";
	private static final String findCustomerByIdQ = selectAllQ + " AND customerId = ?";
	
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
			return customer;
		}
		catch (SQLException e){
			throw e;
			}
	}

		private Customer buildCustomerFromRS(ResultSet rs){
		try {
			// Needs to be handled, upcoming fix
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