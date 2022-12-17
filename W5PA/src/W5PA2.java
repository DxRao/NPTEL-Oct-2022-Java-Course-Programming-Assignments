/*
Week 5 : Programming Assignment 2
Due on 2022-09-01, 23:59 IST
This program is to find the GCD (greatest common divisor) of two integers writing a recursive function findGCD(n1,n2).
Your function should return -1, if the argument(s) is(are) other than positive number(s).
*/

import java.util.Scanner;

interface GCD {
    public int findGCD(int n1,int n2);
}
//Create a class B, which implements the interface GCD.

class B implements GCD{
	public int findGCD(int n1, int n2) {
		int GCDValue = -1;
      int max;
		//n1 and n2 are the numbers to find the GCD  
		//running loop from 1 to the maximum of the  two numbers     
        
      if( n1 >= 0 && n2 >= 0) {       
    	  if (n1 > n2){
    		  max = n1;
    	  } else{
    		  max = n2;
     	}
      
		for(int i = 1; i <= max; i++) {  
		//returns true if both conditions are satisfied   
			if(n1 % i==0 && n2 % i== 0) {  
		//storing the variable i in the variable GCDValue 
			GCDValue = i;              
			}		
		}
        
      }    
      
		return GCDValue;
	}	
}




/*
class B{
	public int findGCD(int n1, int n2) {
		int GCDValue = 0;		
		//n1 and n2 are the numbers to find the GCD  
		//running loop from 1 to the smallest of both the numbers  
		for(int i = 1; i <= n1 && i <= n2; i++) {  
		//returns true if both conditions are satisfied   
		if(n1 % i==0 && n2 % i== 0) {  
		//storing the variable i in the variable GCDValue 
		GCDValue = i; 
		}		
		}
		return GCDValue;
	}	
}
*/







public class W5PA2 { 
    public static void main (String[] args){ 
      B a = new B();   //Create an object of class B
        // Read two numbers from the keyboard
        Scanner sc = new Scanner(System.in);  
         int p1 = sc.nextInt();
         int p2 = sc.nextInt();
        System.out.print(a.findGCD(p1,p2)); 
    } 
}

/*
Test Case 1	
Input	Output
40 60	20
*/