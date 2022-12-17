import java.util.Scanner;
// Write the appropriate statement(s) to import the package(s) you need in your program

public class W7PA1 { 
     public static void main (String[] args){
    	 
       int sum = 0;    	 
    	 
    	Scanner in = new Scanner(System.in);
        
        int x = in.nextInt();        
        int y = in.nextInt();        
        int z = in.nextInt();
   
		 sum = x + y + z;
		 System.out.println(sum);
     }
   } 



/*
import java.io.DataInputStream;

//Write the appropriate statement(s) to import the package(s) you need in your program

public class W7PA1 { 
     public static void main (String[] args){
    	 int sum = 0;
    	 int  x = 0, y = 0, z = 0;
    	 
    	 DataInputStream in = new DataInputStream(System.in);
         
         try
         {
               System.out.println();
               x = Integer.parseInt(in.readLine());
               System.out.println();
               y = Integer.parseInt(in.readLine());
               System.out.println();
               z = Integer.parseInt(in.readLine());
         }
         catch(Exception e) {}

   
		 sum = x + y + z;
    	 
    	 System.out.println(sum);
   }
 }

*/
//Write the appropriate code to read the 3 integer values and find their sum.

/*

Week 7 : Programming Assignment 1
Due on 2022-09-15, 23:59 IST
Complete the following code fragment to read three integer values from the keyboard and find the sum of the values.
Declare a variable "sum" of type int and store the result in it.

Input			Output
Test Case 1	
1
1
1
				3
*/