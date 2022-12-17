import java.util.Scanner;

public class W1PA2 {

	public static void main(String[] args) {
				
		Scanner s = new Scanner(System.in);
		//object of Scanner class
		int x, y, z;		      
        int result = 0;
        //reading input from the user  
        System.out.println("Enter the first number:");  
		x = s.nextInt();  
		System.out.println("Enter the second number:");  
		y = s.nextInt();  
		System.out.println("Enter the third number:");  
		z = s.nextInt(); 
		
		if((x > y) && (x > z)) {
			result = x;
			System.out.println (" The largest number you entered is " + result );
		} else if(y > z) {
				 result = y;
			     System.out.println (" The largest number you entered is " + result );
		} else if ( z > y) {
			    result = z;
			 	System.out.println (" The largest number you entered is " + result );
  
		}
		
	}		
	

}

