import java.util.*;
public class W7PA3 {
    public static void main(String[] args) { 
       try{	
	  byte barr[]={'N','P','T','E','L','-','J','A','V','A','J','A','N','-','N','O','C','C','S','E'};
          Scanner inr = new Scanner(System.in);
	  int n = inr.nextInt();
	// Complete the code to get specific indexed byte value and its corresponding char value.	  	  
			  System.out.println(barr[n]);
			  System.out.print((char)barr[n]);
		  
       } catch (Exception e){    	   
		    System.out.println("exception occur");		    
       }	   
	}  
}



/*
Week 7 : Programming Assignment 3
Due on 2022-09-15, 23:59 IST
A byte char array is initialized. You have to enter an index value "n". According to index your program 
will print the byte and its corresponding char value.
Complete the code segment to catch the exception in the following, if any. 
On the occurrence of such an exception, your program should print “exception occur”.
If there is no such exception, it will print the required output.


Input			Output
Test Case 1	
1
				80
				P
Test Case 2	
24
				exception occur


*/
