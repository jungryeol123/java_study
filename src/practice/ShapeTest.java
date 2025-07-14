package practice;

public class ShapeTest {

	public static void main(String[] args) {
		
		Circle redC = new Circle("red",10);
		Rectangle greenR = new Rectangle("green",4,5);
		Triangle blueT = new Triangle("blue",2,8);
		
		
		redC.shape();
		System.out.println(redC.getArea());
		
		greenR.shape();
		System.out.println(greenR.getArea());
		
		blueT.shape();
		System.out.println(blueT.getArea() );
		
		
	}

}
 