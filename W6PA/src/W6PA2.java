
public class W6PA2 implements Runnable {	
		  
	    @Override  
	    public void run() {  
	        System.out.print(Thread.currentThread().getName()+" has ended.");  
	    }


public static void main(String[] args) {
	  
	   System.out.println("Welcome to Java Week 6 New Question.");  
	  
	  W6PA2 thread = new W6PA2();
	  Thread t1 = new Thread(thread);
	  t1.setName("Main Thread");  
	  t1.start(); 
	}
}

//Create main() method and appropriate statements in it
/*
Week 6 : Programming Assignment 2
Due on 2022-09-08, 23:59 IST
In the following program, a thread class Question62 is created using the Runnable interface Complete the main() to create a thread object of the class Question62 and run the thread. It should print the output as given below.

 

-----------------OUTPUT-------------------

Welcome to Java Week 6 New Question.

Main Thread has ended.

-------------------------------------------------

Input	Output
Test Case 1	
Welcome to Java Week 6 New Question.
Main Thread has ended.
*/