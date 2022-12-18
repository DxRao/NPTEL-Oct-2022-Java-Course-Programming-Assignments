// Calculate the perimeter and area of a given radius for a circle.

import java.util.Scanner;

public class W1PA1 {
       public static void main(String[] args) {
    	   
    	   Scanner s = new Scanner(System.in); 
    	   double radius = s.nextDouble();
    	   double perimeter;
    	   double area;
    	   	
    	   if(radius <= 0) {
    	   		System.out.println("Please enter a non-zero positive number: ");
    	   		radius = s.nextDouble();
    	   	}      
    	   	
    	   	perimeter = 2 * (Math.PI * radius);
    	   	area = Math.PI * (radius * radius);
    	   	
    	   	System.out.println(perimeter);
    	   	System.out.print(area);
       
       }
}