package dblayer;

import java.sql.SQLException;

import model.Product;

public interface DBProductIF {

	Product findProductByBarcode(int barcode) throws SQLException;
}
