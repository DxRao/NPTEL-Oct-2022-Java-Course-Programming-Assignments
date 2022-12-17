import java.util.*;
public class W8PA2 {
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
		   }	     
	    }
	}   








/*
Week 8 : Programming Assignment 2
Due on 2022-09-22, 23:59 IST
Write a program which will print a pascal  pyramid of  "*" 's of height "l" .

For example:

input: 8

output :
       * 
      * * 
     * * * 
    * * * * 
   * * * * * 
  * * * * * * 
 * * * * * * * 
* * * * * * * * 

Input	Output
Test Case 1	
8
       * 
      * * 
     * * * 
    * * * * 
   * * * * * 
  * * * * * * 
 * * * * * * * 
* * * * * * * * 
Test Case 2	
7
      * 
     * * 
    * * * 
   * * * * 
  * * * * * 
 * * * * * * 
* * * * * * *





*/