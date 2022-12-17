import java.util.*;
public class W7PA5 {  
    public static void main(String[] args) { 
       try{	
	    
    	   String s1 = "NPTELJAVA"; 
            Scanner inr = new Scanner(System.in);
	    int n = inr.nextInt();
            char c = 'a';            
            
          //Replace the char in string "s1" with the char 'a' at index "n"  and print the modified string

            s1 = s1.substring(0, n) + c + s1.substring(n + 1);
        	System.out.println(s1);
            
       }
         catch (Exception e){
                System.out.println("exception occur");
      	    }
       		
     }  
 } 
    
    
/*
Week 7 : Programming Assignment 5
Due on 2022-09-15, 23:59 IST
A string "s1" is already initialized. You have to read the index "n" from the keyboard. 
Complete the code segment to catch the exception in the following, if any. On the occurrence of such an exception, 
your program should print “exception occur” .If there is no such exception, your program should replace the 
char "a" at the index value "n" of the "s1", then it will print the modified string.

Input			Output
Test Case 1	
-1
				exception occur
Test Case 2	
e
				exception occur
Test Case 3	
4
				NPTEaJAVA


*/