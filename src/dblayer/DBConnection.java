package dblayer;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dblayer.*;
import model.*;

public class DBConnection { //private
	private Connection connection = null;
	private static DBConnection dbConnection;

	private static final String driverClass = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String dbName = "DMA-CSD-V23_10511081";
	private static final String serverAddress = "hildur.ucn.dk";
	// private static final String serverAddress = "192.168.56.2";
	private static final int serverPort = 1433;
	private static final String userName = "DMA-CSD-V23_10511081";
	private static final String password = "Password1!";

	private DBConnection() {
		String connectionString = String.format(
				"jdbc:sqlserver://%s:%d;databaseName=%s;user=%s;password=%s;encrypt=false", serverAddress, serverPort,
				dbName, userName, password);
		try {
			Class.forName(driverClass);
			connection = DriverManager.getConnection(connectionString);
		} catch (ClassNotFoundException e) {
			System.err.println("Could not load JDBC driver");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("Could not connect to database " + dbName + "@" + serverAddress + ":" + serverPort
					+ " as user " + userName + " using password ******");
			System.out.println("Connection string was: "
					+ connectionString.substring(0, connectionString.length() - password.length()) + "....");
			e.printStackTrace();
		}
	}

	public static DBConnection getInstance() {
		if (dbConnection == null) {
			dbConnection = new DBConnection();
		}
		return dbConnection;
	}

	public void startTransaction() throws SQLException {
		connection.setAutoCommit(false);
	}

	public void commitTransaction() throws SQLException {
		connection.commit();
		connection.setAutoCommit(true);
	}

	public void rollbackTransaction() throws SQLException {
		connection.rollback();
		connection.setAutoCommit(true);
	}

	public Connection getConnection() {
		return connection;
	}

	public void disconnect() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	public static void main(String[] args) {
		DBConnection dbCon = DBConnection.getInstance();
		Connection connection = dbCon.getConnection();
		
		try {
			DBProduct dbProduct = new DBProduct();
			
            int barcodeToFind = 1; // 

            Product product = dbProduct.findProductByBarcode(barcodeToFind);

            if (product != null) {
                System.out.println("Product found:");
                System.out.println("Name: " + product.getName());
                System.out.println("Purchase Price: " + product.getPurchasePrice());
                System.out.println("Sales Price: " + product.getSalesPrice());
            } else {
                System.out.println("Product not found.");
            }
            
            dbCon.disconnect();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
