public class W6PA1 extends Thread {

	
	public void run() {
		
		System.out.println("Thread is Running.");	
	
	}


	public static void main(String args[])  {  

		// Creating object of thread class
		W6PA1 thread = new W6PA1();  

                // Start the thread
		thread.start();
	}	
}

/*
Week 6 : Programming Assignment 1
Due on 2022-09-08, 23:59 IST
Complete the code segment to print the following using the concept of extending the Thread class in Java:

-----------------OUTPUT-------------------

Thread is Running.

-------------------------------------------------


Input		Output
Test Case 1	
			Thread is Running.
* 
* 
* 
* 
* 
* 
* 
* 
* 
* 
* 
* 
* 
* 
* 
* 
* 
* 
*/
