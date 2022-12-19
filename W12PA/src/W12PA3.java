import java.util.*;

public class W12PA3{
 
	public static void main(String[] args){
      
		Scanner s1 = new Scanner(System.in);

   //Read your first name in string
	String fname = "";

    fname = s1.nextLine();
    
    //Read  your last name in string
	
	String lname =  "";

	lname = s1.nextLine();
   
     //Read  rollnumber in integer

	int  rnumber = s1.nextInt();
    
    //Read  1st subject mark in float

	float sub1 = s1.nextFloat();
    
    //Read  2nd subject mark in float

	float sub2 = s1.nextFloat();
	
    // find the avg mark in the subject

	float avg;
	avg = (sub1 + sub2) / 2;

    //Print the record in the format: name+" "+rollnumber+" "+avg_mark 
    
	System.out.print(fname + lname + " " + rnumber + " " + avg);
           

    }
}
