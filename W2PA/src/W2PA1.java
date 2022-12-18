// class School
class School { 
		    // This is a method in class School
		    public void print() { 
				System.out.println("Hi! I class SCHOOL."); 
		    } 
		} 

// class Student
class Student { 
			// This is a method in class Student
		    public void print() { 
				System.out.println("Hi! I am class STUDENT"); 
		    } 
		}

public class W2PA1 {

	public static void main(String[] args) {
		
		// This is the class Student type object named a
		
		Student a = new Student();
		a.print();

		// class School type object named s
		
		School  s = new School();

		s.print();
		System.out.println();
		
	}
}
