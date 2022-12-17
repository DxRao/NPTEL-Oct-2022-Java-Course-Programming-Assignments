import java.util.Scanner;
public class W9PA5	{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		// Declare the 5X5 2D array to store the input
		// Input 2D Array using Scanner Class and check data validity
		// Perform the Flip-Flop Operation
		// Output the 2D Flip-Flop Array

		char[][] ch = new char[5][5];		
		for(int k =0; k < 5; k++ ) {
			String ip = sc.nextLine();
			char c[] = ip.toCharArray();
			if(c.length == 5) {
				for(int x =0; x < 5; x++) {
					if((c[x] == '0') || (c[x] == '1')) {
					ch[k][x] = c[x];
					}//if
				}//for
			}//if
		}//for
		sc.close();
		
		for(int y =0; y < 5; y++) {
			for(int z = 0; z < 5; z++) {				
				
				if (ch[y][z] == '0'){
            		(ch[y][z]) = '1';            		            		
            	} //if           	
            	else if (ch[y][z] == '1') {
            		(ch[y][z]) = '0';    			
            	}//else if 	
							
			}//for
		}//for
		
		for(int i =0; i < 5; i++) {
			for(int j = 0; j<5; j++) {
				System.out.print(ch[i][j]);
				if(j == 4) {
				System.out.println();
				}//if			
			}//for
		}//for
	}//main
}//class
		
		


/*

import java.util.Scanner;
public class W9PA5	{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		// Declare the 5X5 2D array to store the input
		// Input 2D Array using Scanner Class and check data validity
		// Perform the Flip-Flop Operation
		// Output the 2D Flip-Flop Array
		
		int[][] twoD_Array  =  new int[5][5];
		twoD_Array[0][0] = 0;
		
		for (int x =0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
            	twoD_Array[x][y] = sc.nextInt();           	
            }
         }
		 sc.close();        
		
		for (int i =0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
            		
            	if ((twoD_Array[i][j]) == 0) {
            		twoD_Array[i][j] = 1;
            		            		
            	}            	
            	else if ((twoD_Array[i][j]) == 1){
            			twoD_Array[i][j] = 0;            			
            		} 			              
		}
	}
    
		for (int a =0; a < 5; a++) {
            for (int b = 0; b < 5; b++) {
	
            	System.out.print(twoD_Array[a][b]);
            	if(b == 4) {
            		System.out.println();
            	}
            }
            	
          }
	 	
		
	} // The main() ends here
} // The main class ends here





Week 9 : Programming Assignment 5
Due on 2022-09-29, 23:59 IST
Write suitable code to develop a 2D Flip-Flop Array with dimension 5 × 5, which replaces all input elements
with values 0 by 1 and 1 by 0. An example is shown below:

INPUT:
               00001
               00001
               00001
               00001
               00001

OUTPUT:

               11110
               11110
               11110
               11110
               11110

Note the following points carefully:
1. Here, the input must contain only 0 and 1.

2. The input and output array size must be of dimension 5 × 5.
3. Flip-Flop: If 0 then 1 and vice-versa.

Input			Output
Test Case 1	
00001
00001
00001
00001
00001
				11110
				11110
				11110
				11110
				11110




*/