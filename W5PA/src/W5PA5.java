import java.util.Scanner;
public class W5PA5 {
	public static void main (String   args[ ] ) {
           Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();
	    int j;
	 // Put the following code under try-catch block to handle exceptions
	      
	    try {
	    	
	    
	    switch (i) {
		    case 0 : 
			int zero = 0; 
			j = 92/ zero; 		
			break;
	        case 1 : 
			int b[ ] = null; 
			j = b[0] ; 	
			break;
	      	    default:
		       System.out.println("No exception");
	    }//switch ends
	    }//try ends 
	     catch (ArithmeticException ae)   
	     {	     	    	
	    	System.out.println("java.lang.ArithmeticException: / by zero");
	     }    	
	    	
	     catch (NullPointerException npe)
	     {
	    	System.out.println("java.lang.NullPointerException");
	     }
	    
	    
	    }
	    
	}
	






/*
 * 
 * Week 5 : Programming Assignment 5
Due on 2022-09-01, 23:59 IST
In the following program, there may be multiple exceptions. 
You have to complete the code using only one try-catch block to handle all the possible exceptions.

For example, if user’s input is 1, then it will throw and catch “java.lang.NullPointerException“.
 * 
 Input	Output
Test Case 1	
5
			No exception
Test Case 2	
0
			java.lang.ArithmeticException: / by zero
Test Case 3	
1
			java.lang.NullPointerException

* 
 * 
 * 
 * */
