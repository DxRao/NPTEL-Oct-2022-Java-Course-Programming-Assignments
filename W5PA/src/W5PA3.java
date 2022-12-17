import java.util.Scanner;
  
public class W5PA3 {
	public static void main(String[] args) { 
    int a, b;
    Scanner input = new Scanner(System.in);

    //Read any two values for a and b.

    //Get the result of a/b;
      
      a = input.nextInt();
      b = input.nextInt();      
      int result = 0;
      
      try {      
      result = (a / b);
      System.out.println(result);
      }      
      catch(ArithmeticException ae) {
    	  System.out.println("Exception caught: Division by zero.");    	  
      }
    }      
 }
  


/*
Week 5 : Programming Assignment 3
Due on 2022-09-01, 23:59 IST
Complete the code segment to catch the ArithmeticException in the following, if any. 
On the occurrence of such an exception, your program should print “Exception caught: Division by zero.” 
If there is no such exception, it will print the result of division operation on two integer values.

Test Case 1	

Input	Output

4 5
		0



*/