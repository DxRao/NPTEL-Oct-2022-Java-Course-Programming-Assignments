import java.util.Scanner;

public class W9PA1 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine(); // Read as string, e.g., 5+6
		
		// Declare and initialize the required variable(s)
		int operand1;
		int operand2;		
		double result = 0.0;
		long output = 0;
		 
		// Split the input string into character array
		char[] ch = input.toCharArray();
		/*
		Write your method to separate two operands and operators and then perform the required operation.		
		 */
		
		
		for(int i=0;i<ch.length;i++){
			
			if (ch[i] == '+') {
					operand1 = Integer.parseInt(input.substring(0, i));
					operand2 = Integer.parseInt(input.substring(i+1, ch.length));
					result = (double)operand1 + operand2;
				
			}else if  (ch[i] == '-') {
					operand1 = Integer.parseInt(input.substring(0, i));
					operand2 = Integer.parseInt(input.substring(i+1, ch.length));
					result = (double)operand1 - operand2;				
			}else if  (ch[i] == '*') {
					operand1 = Integer.parseInt(input.substring(0, i));
					operand2 = Integer.parseInt(input.substring(i+1, ch.length));
					result = (double)operand1 * operand2;				
			}else if (ch[i] == '/') {
					operand1 = Integer.parseInt(input.substring(0, i));
					operand2 = Integer.parseInt(input.substring(i+1, ch.length));
					result = (double)operand1 / operand2;
			}			
		}	
		
		 output = Math.round(result);		
		System.out.print(input + " = " + output);
		}
}





/*
 * Week 9 : Programming Assignment 1
Due on 2022-09-29, 23:59 IST
Problem statement:

Complete the code to develop a BASIC CALCULATOR that can perform operations like Addition, Subtraction, Multiplication and Division.

Note the following points carefully:
1. Use only double data type to store calculated numeric values.
2. Assume input to be of integer datatype.
3. The output should be rounded using Math.round() method.
4. Take care of the spaces during formatting output (e.g., single space each before and after =).
5. The calculator should be able to perform required operations on a minimum of two operands 
as shown in the below example:

Input:
                       5+6 

Output:
                       5+6 = 11

 
 * 
 */
