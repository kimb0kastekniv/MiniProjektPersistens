package dblayer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dblayer.*;
import controller.*;
import model.*;

public class DBSaleOrder implements DBSaleOrderIF {
	private static final String selectAllSaleOrderLinesBySaleOrderIdQ =
			"SELECT * from SaleOrderLine where saleOrder_Id = ?;";
	private static final String selectAllQ = 
			"SELECT saleOrder_Id, date, amount, deliveryStatus, deliveryDate, invoice_id FROM SaleOrder; ";
	private static final String selectByIdQ=
	selectAllQ + "WHERE id = ? ";
	private PreparedStatement selectAllSaleOrderLinesBySaleOrderId;
	private PreparedStatement selectAll;
	private PreparedStatement selectByID;
	private DBProduct DBProduct;
    private SaleOrderLine sol;
 
    
    public DBSaleOrder() throws SQLException {	
		selectAll = DBConnection.getInstance().getConnection()
                .prepareStatement(selectAllQ);
        selectByID = DBConnection.getInstance().getConnection()
                .prepareStatement(selectByIdQ);
        selectAllSaleOrderLinesBySaleOrderId = DBConnection.getInstance().getConnection().prepareStatement(selectAllSaleOrderLinesBySaleOrderIdQ);
   DBProduct = new DBProduct();
	}
	 
    
	public SaleOrder findSaleOrderById(int id) throws SQLException {
		try {

			
			findSaleOrderById.setInt(1, id);
			ResultSet rs = findSaleOrderById.executeQuery();
			SaleOrder so = null;
			if (rs.next()) {
				so = buildSaleOrder(rs);
			}
			return so;
		} catch (SQLException e) {
			e.printStackTrace();
          return null;
		}
	}

	public SaleOrder buildSaleOrder(ResultSet rs) throws SQLException {
		return new SaleOrder(
				rs.getInt("saleOrder_Id"), 
				rs.getDate("date"), 
				rs.getDouble("amount"),
				rs.getBoolean("deliveryStatus"), 
				rs.getInt("deliveryDate"), 
				rs.getInt("invoice_Id"), 
				rs.getInt("customer_Id")
				);
	}


	


}
