package dblayer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Clothing;
import model.Equipment;
import model.GunReplica;
import model.Product;


public class DBProduct implements DBProductIF {
	
	private static final String selectAllQ = "";
    private static final String findProductByBarcode = selectAllQ + " where barcode = ?";
    
    private PreparedStatement selectAll;
    private PreparedStatement findProductByBarcode;
    
    public DBProduct() throws SQLException {
    	selectAll = DBConnection.getInstance().getConnection().prepareStatement(selectAllQ);
    	
    	findProductByBarcode = DBConnection.getInstance().getConnection().prepareStatement(findProductByBarcode);
    }
	
}
