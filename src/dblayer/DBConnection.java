package dblayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import controller.DataAccessException;


public class DBConnection {
	private Connection connection = null;
	private static DBConnection dbConnection;

	private static final String driverClass = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String dbName = "DMA-CSD-V23_10511081";
	private static final String serverAddress = "hildur.ucn.dk";
	

	private static final String userName = "DMA-CSD-V23_10511081";
	private static final String password = "Password1!";

	private DBConnection() throws DataAccessException {
		
		String connectionString = String.format("jdbc:sqlserver://%s:%d;databaseName=%s;user=%s;password=%s;encrypt=false",
				serverAddress, dbName, userName, password);
		try {
			Class.forName(driverClass);
			connection = DriverManager.getConnection(connectionString);
		} catch (ClassNotFoundException e) {
			throw new DataAccessException("Missing JDBC driver", e);
			
		} catch (SQLException e) {
			throw new DataAccessException(String.format("Could not connect to database %s@%s:%d user %s", dbName,
					serverAddress, userName), e);
			
		}
	}

	public static synchronized DBConnection getInstance() throws DataAccessException {
		if (dbConnection == null) {
			dbConnection = new DBConnection();
		}
		return dbConnection;
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
}
