import java.net.*;
import java.sql.*;

public class W10PA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		    
		        try {
		              Connection conn = null;
		              Statement stmt = null;
		              String DB_URL = "jdbc:sqlite:/tempfs/db";
		              System.setProperty("org.sqlite.tmpdir", "/tempfs");
		              
		              // JDBC Codes in the hidden section

		              // Open a connection
		              conn = DriverManager.getConnection(DB_URL);
		              System.out.print(conn.isValid(1));
		              conn.close();

		// JDBC Codes in the visible section

		        }
		       catch(Exception e){ System.out.println(e);} 

	}

}
