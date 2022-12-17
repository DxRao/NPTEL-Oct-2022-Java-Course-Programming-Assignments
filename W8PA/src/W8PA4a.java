import java.util.*;
public class W8PA4a {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
	  int n = inr.nextInt();
        // Add the necessary code in the below space
	  if (n % 2 != 0) {
		  
	  
	  int  i, j, space = 1;

        
        space = n - 1;
        for (j = 1; j <= n; j++) 
        {
            for (i = 1; i <= space; i++) 
            {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) 
            {
                System.out.print("*");                
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j <= n - 1; j++) 
        {
            for (i = 1; i <= space; i++) 
            {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * (n - j) - 1; i++) 
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        
        
	  }    
	  else {
    	System.out.println("Invalid line number");    	
    }
   }
}
    
