import java.sql.*;
import java.lang.*;
import java.util.Scanner;

public class W10PA2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
            Connection conn = null;
            Statement stmt = null;
            String DB_URL = "jdbc:sqlite:/tempfs/db";
            System.setProperty("org.sqlite.tmpdir", "/tempfs");
            
            conn = DriverManager.getConnection(DB_URL);
        	stmt = conn.createStatement();
        	stmt.close();
        	
            System.out.print(conn.isValid(1));
        	conn.close();
        	conn = DriverManager.getConnection(DB_URL);
        	stmt = conn.createStatement();
        	stmt.close();
        	
        	//~~~THERE IS SOME INVISIBLE CODE HERE~~~
        	
		}
	       catch(Exception e){ System.out.println(e);}  
	}		
}


