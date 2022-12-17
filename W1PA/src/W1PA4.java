// if Armstrong Number ... Print 1 else Print 0.

import java.util.Scanner;
public class W1PA4 {

	public static void main(String[] args) {
	   
		Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
       int result=0;         
        int holder = n;
        int totaldigits =0, lastdigit;
         
         while(n > 0) {
        	 
        	 lastdigit = n%10;
        	 n = n/10;
        	 totaldigits = totaldigits + (lastdigit*lastdigit*lastdigit);           
         }
         
         if(holder == totaldigits)
        	 
        	 result = 1;
         else
        	 
        	 result = 0;
        
         System.out.print(result);
         
    }
}