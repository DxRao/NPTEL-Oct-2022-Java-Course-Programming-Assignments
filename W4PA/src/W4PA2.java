// The following is the declaration of the main class named W4PA2.
	
public class W4PA2 {
	
	
		public static void main(String args[]){
			
			int year; // integer type variable to store year
			
			
			java.util.Calendar obj = java.util.Calendar.getInstance();
	
			year = obj.get(java.util.Calendar.YEAR);	     
			
			// Print the current Year
			System.out.println("Current Year: " + year);
			
			// there is some invisible code here
		}

}
/*

Complete the code segment to print the current year. Your code should compile successfully.

Note: In this program, you are not allowed to use any import statement. Use should use predefined class

 Calendar defined in java.util package.
 
		// Create an object of Calendar class. 

		// Use getInstance() method to initialize the Calendar object.
	
		// Initialize the int variable year with the current year
*/