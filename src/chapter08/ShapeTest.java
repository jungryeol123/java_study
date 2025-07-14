package chapter08;

public class ShapeTest {
	public static void main(String[]args) {
		
		Circle c1 = new Circle("빨강색",10);
		Circle c2 = new Circle("파란색",20);
		Rectangle r1 = new Rectangle("노란색",5,5);
		Rectangle r2 = new Rectangle("초록색",3,4);
		Triangle t1 = new Triangle("주황색",5,2);
		
		c1.draw();
		System.out.println(c1.getArea());
		
		c2.draw();
		System.out.println(c2.getArea());
		
		r1.draw();
		System.out.println(r1.getArea());
		
		r2.draw();
		System.out.println(r2.getArea());
		
		t1.draw();
		System.out.println(t1.getArea());
		
		
	} //main
}//class
