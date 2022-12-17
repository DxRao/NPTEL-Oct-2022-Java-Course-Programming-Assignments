
public class W10PA5 {

	public static void main(String[] args) {
		

	}

}

/*

  import java.sql.*;
import java.lang.*;
public class RenameTable {
    public static void main(String args[]) {
        try {
              Connection conn = null;
              Statement stmt = null;
              String DB_URL = "jdbc:sqlite:/tempfs/db";
              System.setProperty("org.sqlite.tmpdir", "/tempfs");
            
              // Open a connection
              conn = DriverManager.getConnection(DB_URL);
              stmt = conn.createStatement();
              
              ~~~THERE IS SOME INVISIBLE CODE HERE~~~
              
              // Write the SQL command to rename a table

				// Execute the SQL command


				String alter="ALTER TABLE PLAYERS RENAME TO SPORTS";

				stmt.executeUpdate(alter);
				
				~~~THERE IS SOME INVISIBLE CODE HERE~~~
				
				 }
       			catch(Exception e){ System.out.println(e);}  
    	}
}



  
  
 */
