// Program showing constructor overloading and calling default constructor 
// with no parameters thru this() keyword taking no parameters.

public class W2PA4 {

	public static void main(String[] args) {
		
		Answer a = new Answer(10, "MCQ");
	}
}		
class Answer{
			    
	Answer(){
		
	 System.out.println("You got nothing.");
	 
	}
			    
	Answer(int marks, String type){
		
		this();
		
		System.out.println("You got "+ marks +" for an "+ type);
		
			}
		}
