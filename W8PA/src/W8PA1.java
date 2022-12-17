import java.util.*;
public class W8PA1 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
	   int n = inr.nextInt();
        // Add the necessary code in the below space ...
	   
	   int rows = n, x=0, starCounter = 0;
	   
	   for(int i = 1; i <= rows; ++i, x=0) {
		   
		 for(int space = 1; space <= rows-i; ++space)  {			 
			 
			 System.out.print("  ");
		 }
		   while(x != 2 * i - 1) {
			   
			   System.out.print(("* "));
			   starCounter++;
			   ++x;
		   }
		   System.out.println();		   
	   }	   
	   System.out.print(starCounter);  
    }
}   




/*

Week 8 : Programming Assignment 1
Due on 2022-09-22, 23:59 IST
Write a program which will print a pyramid of "*" 's of height "n" and print the number of "*" 's in the pyramid.

For example:

Input : 5
Output:  

        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 
25

Input	Output
Test Case 1	
3
    * 
  * * * 
* * * * * 
9
Test Case 2	
5
        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 
25


*/