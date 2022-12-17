import java.util.Scanner;
public class W9PA4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		
		// Declare necessary variables

		// Input 5x5 2D Array using Scanner Class

		// Perform the reflection operation

		// Output 5x5 2D Reflection Array
		
		char[][] ch = new char[5][5];
		char[][] reverse = new char[5][5];
		for(int k =0; k < 5; k++ ) {
			String ip = sc.nextLine();
			char c[] = ip.toCharArray();
			if(c.length == 5) {
				for(int x =0; x < 5; x++) {
					ch[k][x] = c[x];
				}//for
			}//if
		}//for
		
		for(int y =0; y < 5; y++) {
			for(int z = 0; z<5; z++) {
				reverse[y][z] = ch[y][4-z];			
			}//for
		}//for
		
		for(int i =0; i < 5; i++) {
			for(int j = 0; j<5; j++) {
				System.out.print(reverse[i][j]);
				if(j == 4) {
				System.out.println();
				}				
			}
		}
		

		
	} // The main() method ends here
} // The main class end

/*
Week 9 : Programming Assignment 4
Due on 2022-09-29, 23:59 IST
Problem statement:

A program needs to be developed which can mirror reflect any 5 × 5 2D character array 
into its side-by-side reflection. Write suitable code to achieve this transformation as shown below:

 INPUT:                                       OUTPUT:
               OOXOO                                        OOXOO
               OOXOO                                        OOXOO
               XXXOO                                        OOXXX
               OOOOO                                        OOOOO
               XOABC                                        CBAOX

Note the following points carefully:
1. Here, instead of X and O any character may be present.

2. The input and output array size must be of dimension 5 × 5 and nothing else.
3. Only side-by-side reflection should be performed i.e. ABC || CBA.




Input			Output
Test Case 1	
OOXOO
OOXOO
XXXOO
OOOOO
XOABC
				OOXOO
				OOXOO
				OOXXX
				OOOOO
				CBAOX
				
				
				class Main
{
    // Method to reverse a string in Java using a character array
    public static String reverse(String str)
    {
        // return if the string is null or empty
        if (str == null || str.equals("")) {
            return str;
        }
 
        // create a character array and initialize it with the given string
        char[] c = str.toCharArray();
 
        for (int l = 0, h = str.length() - 1; l < h; l++, h--)
        {
            // swap values at `l` and `h`
            char temp = c[l];
            c[l] = c[h];
            c[h] = temp;
        }
 
        // convert character array to string and return
        return String.copyValueOf(c);
    }
 
    public static void main(String[] args)
    {
        String str = "Reverse me!";
 
        // String is immutable
        str = reverse(str);
 
        System.out.println("The reversed string is " + str);
    }
}


Output:

The reversed string is !em esreveR

That’s all about reversing a String using a character array in
////////////////////////////////////////////////////////////////////////////////////
 
 
 class Main
{
    // Method to reverse a string in Java using a character array
    public static String reverse(String str)
    {
        // return if the string is null or empty
        if (str == null || str.equals("")) {
            return str;
        }
 
        // get string length
        int n = str.length();
 
        // create a character array of the same size as that of string
        char[] temp = new char[n];
 
        // fill character array backward with characters in the string
        for (int i = 0; i < n; i++) {
            temp[n - i - 1] = str.charAt(i);
        }
 
        // convert character array to string and return it
        return String.copyValueOf(temp);
    }
 
    public static void main(String[] args)
    {
        String str = "Reverse me!";
 
        // String is immutable
        str = reverse(str);
 
        System.out.println("The reversed string is " + str);
    }
}


Output:

The reversed string is !em esreveR
 


*/