package controller;

import java.sql.SQLException;


import dblayer.DBProduct;
import dblayer.DBProductIF;
import model.Product;

public class ProductCtr {
	private Product p;
	private DBProductIF dBproductIF;
	
	public ProductCtr() throws SQLException {
		dBproductIF = new DBProduct();
	}
	
	public Product findProductByBarcode(int barcode) throws SQLException {
		return dBproductIF.findProductByBarcode(barcode);
	}
	

}
