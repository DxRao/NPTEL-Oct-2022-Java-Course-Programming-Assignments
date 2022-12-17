import java.util.Scanner;

public class W1PA5 {
    
	public static void main(String[] args) {
	 
		 Scanner input = new Scanner(System.in);
         double mark_avg;
         int result;
         int i;
         int s;
         
         //define size of array         
         s = input.nextInt();
         
         //The array is defined "arr" and inserted marks into it.
         
         int[] arr = new int[s];   
         
         for(i=0;i<arr.length;i++)
         {
        	 arr[i]=input.nextInt();
         }
         
         int high_score = arr[0];
         double total_marks = arr[0];
         
         for(i=1; i < arr.length; i++)
         {
        	 if(arr[i] > high_score){
    		 
        		 high_score = arr[i];
        	 }    	  
        	 	total_marks = total_marks + arr[i];
         }
         
         result = high_score;
         mark_avg = total_marks / (arr.length);
         
         System.out.println(result);
         System.out.print(mark_avg);
    	  
    }
}
