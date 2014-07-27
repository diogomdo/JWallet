package pt.diogo.jwallet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class WalletDBConn {
	
	private static WalletDBConn instance = new WalletDBConn();
    public static final String URL = "jdbc:mysql://localhost/jwalletdb";
    public static final String USER = "";
    public static final String PASSWORD = "";
    public static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
    
  //private constructor
    private WalletDBConn() {
        try {
            Class.forName(DRIVER_CLASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
     
    private Connection createConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("ERROR: Unable to Connect to Database.");
        }
        return connection;
    }   
     
    public static Connection getConnection() {
        return instance.createConnection();
    }

}
