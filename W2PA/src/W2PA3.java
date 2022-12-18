// Program showing 2 methods of print() as in method overloading concept 
//with different number of and/or no parameter(s) of same method name.

public class W2PA3 {

	public static void main(String[] args) {
		
		
		// This is the class named Printer
		class Printer { 
		    // This are the methods in class Printer
		    public void print() { 
				System.out.println("Hi! I class SCHOOL."); 
		    } 
		    public void print(String s) { 
				System.out.println(s); 
		    } 
		} 
		
		String a = "Hi! I am class STUDENT";		
		Printer p = new Printer();		
		p.print(a);	
		p.print();

	}
}