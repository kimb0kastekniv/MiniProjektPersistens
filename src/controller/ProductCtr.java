package controller;

import java.sql.SQLException;

import db.ProductDB;
import db.ProductDBIF;
import model.Product;

public class ProductCtr {
	private Product p;
	private DBProductIF dBproductIF;
	
	public ProductCtr() throws SQLException {
		dBproductIF = new ProductDB();
	}
	
	public Product findProductByBarcode(int barcode) throws SQLException {
		return dBproductIF.findProductByBarcode(barcode);
	}
	

}
