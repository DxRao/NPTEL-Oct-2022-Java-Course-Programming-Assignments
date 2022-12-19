class Parent {
    
	public static void testClassMethod() {
        System.out.println("The static method.");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method.");
    }
}
public class W12PA4 extends Parent { //Child class
   
	public static void testClassMethod() { }

	public static void main(String[] args) {
  
		W12PA4 ch = new W12PA4(); // Creating child class type object
        
     // Call the instance method in the Parent class 
  
		ch.testInstanceMethod();
		
     // Call the static method in the Parent class
  
		Parent.testClassMethod();
  
  }
}
