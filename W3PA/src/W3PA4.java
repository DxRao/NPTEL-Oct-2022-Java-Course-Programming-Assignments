// Program calling a static method Vs Non-static method

import java.util.Scanner;

class QuestionScope {
	
	int sum(int a, int b){ //non-static method
		    
		return a + b;
    }
	static int multiply(int a, int b){ //static method
		   
		return a * b;
    }
}
public class W3PA4 {
	
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		
        int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		QuestionScope obj = new QuestionScope();
		
		int x = obj.sum(n1,n2);		
		int y = QuestionScope.multiply(n1, n2);		
		
		System.out.println(x);
		System.out.print(y);		
	}
}

