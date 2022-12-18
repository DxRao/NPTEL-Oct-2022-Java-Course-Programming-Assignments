//	Complete the code segment to define a class Point with parameter x, y, and method distance()
//	for calculating distance between two points.
//	Note: Pass objects of type class Point as argument in distance() method. 

import java.util.Scanner;

	class Point{
	double x, y;
	double dis;
	public Point() {};
	public void distance(Point obj1, Point obj2) {		
		
		double x1, x2, y1, y2;
		
	    x1 = obj1.x; x2=obj2.x;  y1=obj1.y; y2=obj2.y;
	    
	    dis = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	    
            System.out.println("distance between"+"("+x1+","+y1+"),"+"("+x2+","+y2+"): " + dis);		
	}
	
}

public class W3PA2 extends Point{
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	 
		Point p1=new Point();
		p1.x=sc.nextDouble();
		p1.y=sc.nextDouble();
		Point p2=new Point();
		p2.x=sc.nextDouble();
		p2.y=sc.nextDouble(); 
		W3PA2 c1=new W3PA2();
		c1.distance(p1,p2);
	
  }

}