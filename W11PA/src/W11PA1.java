import java.sql.*;
import java.lang.*;

public class W11PA1 {
    
	public static void main(String args[]) {
        
		try {
              
			  Connection conn = null;
              Statement stmt = null;
              
              String DB_URL = "jdbc:sqlite:/tempfs/db";
              System.setProperty("org.sqlite.tmpdir", "/tempfs");
            
              // Open a connection
              conn = DriverManager.getConnection(DB_URL);
              stmt = conn.createStatement();
              
              // The statement containing SQL command to create table "players"
              String CREATE_TABLE_SQL="CREATE TABLE players (UID INT, First_Name VARCHAR(45), Last_Name VARCHAR(45), Age INT);";
              
              // Execute the statement containing SQL command
              stmt.executeUpdate(CREATE_TABLE_SQL);
			
                     PreparedStatement PreparedstatementObj = conn.prepareStatement("insert into Players Values (?, ?, ?, ?)");
					 
                     PreparedstatementObj .setInt(1, 1);
					 PreparedstatementObj .setString(2, "Ram");
					 PreparedstatementObj .setString(3, "Gopal");
					 PreparedstatementObj .setInt(4, 26);

					 int a = PreparedstatementObj.executeUpdate();

					 PreparedStatement PreparedstatementObj1 = conn.prepareStatement("insert into Players Values (?, ?, ?, ?)");
					 
					 PreparedstatementObj1 .setInt(1, 2);
					 PreparedstatementObj1 .setString(2, "John");
					 PreparedstatementObj1 .setString(3, "Mayer");
					 PreparedstatementObj1 .setInt(4, 22);

					 int b = PreparedstatementObj1.executeUpdate();					
					
					 //Evaluation Portion
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM players;");
			
			while(rs.next())  
				
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
				
			conn.close();
			
        }catch(Exception e){ 
        	
        	System.out.println(e);
        	
        }  
	}  
}  
