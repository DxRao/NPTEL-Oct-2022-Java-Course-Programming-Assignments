import java.util.*;

public class W12PA5 { 
    
	static int sum_odd_n(int n){ 
          
		if(n == 1)
              return 1;
        if (n <= 0) 
        	return 0;
        
        return (2 * n-1 + sum_odd_n(n-1)); //Call the method recursively.

		}// end of sum_odd_n method
	
   public static void main(String[] args) {  
      
	  Scanner in = new Scanner(System.in);
      
	  int count = in.nextInt();      
      int r = sum_odd_n(count);
      
      System.out.println(r);
      
    }  
}
