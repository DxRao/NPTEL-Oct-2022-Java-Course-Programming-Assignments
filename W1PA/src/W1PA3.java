// Find the Sum of numbers which are divided by both 2 and 3 without a remainder up to a user given n number.

import java.util.Scanner;

public class W1PA3 {
       
	public static void main(String[] args) {
	   
		Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
	   int sum=0;	
	   int counter = 1;
		  for(int i =0; counter <= n; i++) {
		      
			     if((i % 2) == 0) {	
			    
			       if((i % 3) == 0) {	
			    	 sum += i;
	               }
	                 counter += 1;
			     }		               
	        }        
		   
		    System.out.print(sum);   
      }
}
