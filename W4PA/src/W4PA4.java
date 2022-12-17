interface First{ 
    // default method 
    default void show(){ 
        System.out.println("Default method implementation of First interface."); 
    } 
} 
  
interface Second{ 
    // Default method 
    default void show(){ 
        System.out.println("Default method implementation of Second interface."); 
    } 
} 
  
// Implementation class code 
class W4PA4 implements First, Second{ 
    // Overriding default show method 
    public void show(){ 	
    	
    	First.super.show();
    	Second.super.show();
    } 
    	  	
    	
     public static void main(String args[]){ 
        W4PA4 q = new W4PA4(); 
        q.show(); 
    }
}


/*
 
 Complete the code segment to call the default method in the interface First and Second.
 
 // Call show() of First interface.
// Call show() of Second interface.
 
 Test Case 1
 
 	input
 	
 	output
Default method implementation of First interface.
Default method implementation of Second interface.
  
 */
