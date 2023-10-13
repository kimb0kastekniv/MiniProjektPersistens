package dblayer;

import java.sql.SQLException;

import model.SaleOrder;

public interface DBSaleOrderIF {
	public SaleOrder findSaleOrderById(int id) throws SQLException;
}
