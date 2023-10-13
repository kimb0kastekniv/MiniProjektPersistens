package dblayer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dblayer.*;
import controller.*;
import model.*;

public class DBSaleOrder implements DBSaleOrderIF {
	private static final String selectAllQ = 
			"SELECT * FROM SaleOrder";
	private static final String findSaleOrderByIdQ = selectAllQ + " WHERE customer_Id = ?";
	
	private PreparedStatement selectAll;
	private PreparedStatement findSaleOrderById;
    
    public DBSaleOrder() throws SQLException {	
		selectAll = DBConnection.getInstance().getConnection()
                .prepareStatement(selectAllQ);
        findSaleOrderById = DBConnection.getInstance().getConnection()
        		.prepareStatement(findSaleOrderByIdQ);
	}
    
	public SaleOrder findSaleOrderById(int id) throws SQLException {
		try {
			findSaleOrderById.setInt(1, id);
			ResultSet rs = findSaleOrderById.executeQuery();
			SaleOrder so = null;
			if (rs.next()) {
				so = buildSaleOrder(rs);
			}
			else {
				throw new SQLException();
			}
			return so;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException();
		}
	}

	private SaleOrder buildSaleOrder(ResultSet rs) throws SQLException {
		return new SaleOrder(
				rs.getInt("saleOrder_Id"), 
				rs.getDate("date"), 
				rs.getInt("amount"),
				rs.getBoolean("deliveryStatus"), 
				rs.getDate("deliveryDate"), 
				rs.getInt("invoice_Id"), 
				rs.getInt("customer_Id")
				);
	}
}
