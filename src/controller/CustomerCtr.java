package controller;

import java.sql.SQLException;

import dblayer.DBCustomer;
import dblayer.DBCustomerIF;
import model.Customer;

public class CustomerCtr {
	private Customer customer;
	private DBCustomerIF dBCustomerIF;
	
	public CustomerCtr() throws SQLException{
        //dBCustomer = new DBCustomer();
        
	}
	public Customer findCustomerById(int id) throws SQLException {
		return dBCustomerIF.findCustomerById(id);
	}

}
