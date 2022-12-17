
interface ExtraLarge{
	String extra = "This is extra-large";
	public static void display() {
		
		  System.out.print(extra);
	}
}

class Large {
    public void Print() {
        System.out.println("This is large");
    }
}
 
class Medium extends Large {
    public void Print() {
    	  super.Print();  
        System.out.println("This is medium");
    }
}
class Small extends Medium {
    public void Print() {
        super.Print(); ; 
        System.out.println("This is small");
    }
  }

 
class W4PA3 implements ExtraLarge {
    public static void main(String[] args) {
        Small s = new Small();
        s.Print();
	 	  ExtraLarge.display();
    }
}

/*
The program in this assignment is attempted to print the following output: 

-----------------OUTPUT-------------------
This is large
This is medium
This is small
This is extra-large
-------------------------------------------------

However, the code is intentionally injected with some bugs. Debug the code to execute the program successfully.



Test Case 1	

input

output
This is large
This is medium
This is small
This is extra-large





*/