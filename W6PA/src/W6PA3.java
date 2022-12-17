	// Interface A is defined with an abstract method run()
	interface A {
		public abstract void run();
	}

	// Class B is defined which implements A and an empty implementation of run()
	class B implements A {
		public void run() {}
	}



//Create a class named MyThread and extend/implement the required class/interface

//Define a method in MyThread class to print the output
	
	
	class MyThread extends B {
		
		public void run() {
			
			System.out.print("NPTEL Java week-6 new Assignment Q3");			
		}		
	}
	
// Main class Question is defined
public class W6PA3 {
	public static void main(String[] args) {
		// An object of MyThread class is created
	MyThread t = new MyThread();
		// run() of class MyThread is called
 t.run();
	}
}


/*
Week 6 : Programming Assignment 3
Due on 2022-09-08, 23:59 IST
A part of the Java program is given, which can be completed in many ways, for example 
using the concept of thread, etc.  Follow the given code and complete the program so that 
your program prints the message "NPTEL Java week-6 new Assignment Q3". Your program should 
utilize the given interface/ class.
Invalid HTML tag: tag name o:p is not allowed.


Input		Output
Test Case 1	
			NPTEL Java week-6 new Assignment Q3
*/