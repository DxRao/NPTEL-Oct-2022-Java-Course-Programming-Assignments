import java.io.*;
import java.util.*;

public class W7PA4 {  
    public static void main(String[] args) { 
	  int c=0;
         try{
            InputStreamReader r = new InputStreamReader(System.in);  
            BufferedReader br = new BufferedReader(r);  
            String s1 = br.readLine();
          //Write your code here to count the number of vowels in the string "s1"            
            for(int i =0; i < s1.length(); i++) {
            	
            	char ch = s1.charAt(i);
                if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == 'A'|| ch == 'E' ||ch == 'I' ||ch == 'O'||ch == 'U') {
                   c ++;
                }
            }
                System.out.println(c); 
            } 
            catch (Exception e){
            	System.out.println(e);
            	}	   
       }
 } 
         
    


/*Week 7 : Programming Assignment 4
Due on 2022-09-15, 23:59 IST
The following program reads a string from the keyboard and is stored in the String variable "s1". 
You have to complete the program so that it should should print the number of vowels in s1 . 
If your input data doesn't have any vowel it will print "0".
 * 
 
 
 Input			Output
Test Case 1	
ram
				1
Test Case 2	
aaA
				3
Test Case 3	
10
				0

 
 
 */
