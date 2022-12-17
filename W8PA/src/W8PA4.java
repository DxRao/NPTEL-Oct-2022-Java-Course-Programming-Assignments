import java.util.*;
public class W8PA4 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);

int n = inr.nextInt();
        // Add the necessary code in the below space
      if (n % 2 != 0) {	
        
       // n = ((n/2) + (n/2) + (1));
	  
	  int  i, j, space = 1;
        
        space = ((n/2)+1) - 1;
        
        for (j = 1; j <= ((n/2) + 1); j++) {
        
          for (i = 1; i <= space; i++) {
            
                System.out.print(" ");
            }
            space--;
          for (i = 1; i <= j; i++){ 
            
                System.out.print("* ");                
            }
          
            System.out.println();
        }
        space = 1;
        
        for (j = 1; j <= ((n/2)+1) - 1; j++){ 
        
          	for (i = 1; i <= space; i++) {
            
                System.out.print(" ");
            }
            space++;
          	for (i = 1; i <= (((n/2)+1) - j); i++) {
            
                System.out.print("* ");
            }
          
            System.out.println();
        }        
        
	  }    
	  else {
    	System.out.print("Invalid line number");    	
    }
   }
}
    

/*

import java.util.*;
public class W8PA4 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
	  int n = inr.nextInt();
        // Add the necessary code in the below space
	  if (n % 2 != 0) {
		  
	  
	  int  i, j, space = 1;

        
        space = n - 1;
        for (j = 1; j <= n; j++) 
        {
            for (i = 1; i <= space; i++) 
            {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) 
            {
                System.out.print("*");                
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j <= n - 1; j++) 
        {
            for (i = 1; i <= space; i++) 
            {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * (n - j) - 1; i++) 
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        
        
	  }    
	  else {
    	System.out.println("Invalid line number");    	
    }
   }
}
    



/*

import java.util.*;
public class W8PA4 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
	  int l = inr.nextInt();
        // Add the necessary code in the below space
	  int rows = l, x=0;
	   
	   for(int i = 1; i <= rows; ++i, x=0) {
		   
		 for(int space = 1; space <= rows-i; ++space)  {			 
			 
			 System.out.print(" ");
		 }
		   while(x != i) {
			   
			   System.out.print(("* "));
			   ++x;
		   }
		   System.out.println();	
		//////////////////////////////////////
		   rows = l-1;
		   for(i = rows; i > 1; --i) {
			   
				 for(int space = 1; space <= rows-i; ++space)  {			 
					 
					 System.out.print(" ");
				 }
				   //while(i != x) {
					   
					   //System.out.print(("* "));
					   //++x;
				 
				 for(int j =1; j <= l-1; ++j) {
					 
					System.out.print(("* "));
				   }
				 
				 for(int j =0; j < l-1; ++j) {
					 
					System.out.print(("* "));
					 
				 }
				   System.out.println();
					   
					   
		   }
		   
		   
	   }
	   
	   }
	   
	   
   }
}   









/*

Week 8 : Programming Assignment 4
Due on 2022-09-22, 23:59 IST
Write a program to print symmetric Pascal's triangle of "*" 's of  height "l" of odd length . If input "l" is even then your program will print "Invalid line number".

For example:

input : 5
output:
  *
 * *
* * *
 * *
  *
input : 6

output:

Invalid line number

Input	Output
Test Case 1	
6
Invalid line number
Test Case 2	
7
   * 
  * * 
 * * * 
* * * * 
 * * *
  * *
   *

*/