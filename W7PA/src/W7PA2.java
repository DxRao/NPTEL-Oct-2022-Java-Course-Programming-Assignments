import java.io.*;  
public class W7PA2 {  
public static void main(String args[]) { 
	
	//Use appropriate Try..catch block to complete the code
	try {
	   InputStreamReader r = new InputStreamReader(System.in);  
	   BufferedReader br = new BufferedReader(r);  
	   String number = br.readLine();  
	   int x = Integer.parseInt(number);
	   System.out.println(x*x);
	   
	}
	catch(Exception e) {
		
		System.out.print("Please enter valid data");
	}
  }
}


/*
Week 7 : Programming Assignment 2
Due on 2022-09-15, 23:59 IST
Complete the code segment to catch the exception in the following, if any. On the occurrence of such an exception,
 your program should print “Please enter valid data”.
 If there is no such exception, it will print the "square of the number".
 
 Input			Output
Test Case 1	
2
				4
Test Case 2	
q
				Please enter valid data
*/