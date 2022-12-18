// Program with passing 'this' keyword as a parameter to a method.
public class W2PA2{ 
 
	public static void main(String[] args) { 		
	
		W2PA2 q = new W2PA2();
		
		// studentMethod() in turn calls the print() method thru this parameter (single parameter print() method even
		// if there are more than one print() method with different number of parameters as in method overloading.
		
		q.studentMethod();
 }
	
	// print() method is defined in class Question
		
		void print(W2PA2 object){
		System.out.print("Well Done!");
		
		}
	
		void studentMethod(){	
		
			print(this);
		}		
}	