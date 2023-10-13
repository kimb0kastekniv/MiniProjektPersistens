package dblayer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Clothing;
import model.Equipment;
import model.GunReplica;
import model.Product;
import dblayer.*;

public class DBProduct implements DBProductIF {

	private static final String selectAllQ = "SELECT * FROM Product";
	private static final String findByProductIdQ = selectAllQ + " WHERE product_Id = ?";
	private PreparedStatement selectAll;
	private PreparedStatement findByProductId;

	public DBProduct() throws SQLException {
		selectAll = DBConnection.getInstance().getConnection().prepareStatement(selectAllQ);
		findByProductId = DBConnection.getInstance().getConnection().prepareStatement(findByProductIdQ);
	}

	@Override
	public Product findProductByBarcode(int barcode) throws SQLException {
		try {

			findByProductId.setInt(1, barcode);
			ResultSet rs = findByProductId.executeQuery();
			Product p = null;
			if (rs.next()) {
				p = buildProduct(rs);
			}
			return p;
		} catch (SQLException e) {
			e.printStackTrace();
          return null;
		}
	}

	public Product buildProduct(ResultSet rs) throws SQLException {
		return new Product(
				rs.getString("name"), 
				rs.getDouble("purchasePrice"), 
				rs.getDouble("salesPrice"),
				rs.getInt("minStock"), 
				rs.getInt("product_Id"), 
				rs.getInt("supplier_Id"), 
				rs.getInt("country_Id"),
				rs.getInt("type")

		);
	}

}
