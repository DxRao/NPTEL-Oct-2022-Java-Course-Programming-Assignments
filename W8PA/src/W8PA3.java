import java.util.*;
  public class W8PA3 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
	   int n = inr.nextInt();
        // Add the necessary code in the below space
	   int rows =n, k=0,count =0, count1=0, sumOfDigits = 0;
	   
	   for(int i =1; i<= rows; ++i) {
		   for(int space = 1; space <= rows - i; ++space) {
			   System.out.print("  ");
			   ++count;		   
		   }
		   
		   while(k!= 2 * i - 1) {
			  if(count <= rows - 1) {
				System.out.print((1+k) + " ");
				sumOfDigits += (1+k);
			  }else {
				  ++count1;
				  System.out.print((i+k - 2 * count1) + " ");
			  }
			  ++k;			   
		   }
		   count1 = count = k = 0;
		   System.out.println();
		   
	   }
	   System.out.println(sumOfDigits);
    }
  }



/*
 * 
 * import java.util.*;
  public class W8PA3 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
	   int n = inr.nextInt();
        // Add the necessary code in the below space
	   int rows =n, k=0,count =0, count1=0,sumOfDigits =0;
	   
	   for(int i =1; i<= rows; ++i) {
		   for(int space = 1; space <= rows - i; ++space) {
			   System.out.print("  ");
			   ++count;		   
		   }
		   
		   while(k!= 2 * i - 1) {
			  if(count <= rows - 1) {
				System.out.print((i+k) + " "); 
				++count;				  
			  }else {
				  ++count1;
				  System.out.print((i + k - 2 * count1) + " ");
			  }
			  ++k;			   
		   }
		   count1 = count = k = 0;
		   System.out.println();
		   
	   }
    }
  }

 
Week 8 : Programming Assignment 3
Due on 2022-09-22, 23:59 IST
Write a program which will print a pyramid of "numbers" 's of height "n" and print the sum of all number's in the pyramid.

For example:

input: 5

output: 
        1 
      1 2 3 
    1 2 3 4 5 
  1 2 3 4 5 6 7 
1 2 3 4 5 6 7 8 9 
95



Input	Output
Test Case 1	
5
        1 
      1 2 3 
    1 2 3 4 5 
  1 2 3 4 5 6 7 
1 2 3 4 5 6 7 8 9 
95
Test Case 2	
3
    1 
  1 2 3 
1 2 3 4 5 
22


*/