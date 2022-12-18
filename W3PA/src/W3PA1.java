// complete the code segment to find the nth Fibonacci number in the Fibonacci sequence
// and return the value. Write the function recursively.

import java.util.Scanner;

public class W3PA1 { 

	public static void main(String args[]){ 
	
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println(fib(n)); 

} 
		//Template code:
	static int fib(int n) { 
		int x = 0;
		int y = 1;
		int z = 0;
			
			if(n==1) {
				z = 0;
			}else if(n==2){
				z = 1;		
			}
			else {
				
				for( int i=2; i < n; i++) {
				
					z= x + y;
					x = y;
					y = z;
		
				}	
			}

			return z;
		}
}
