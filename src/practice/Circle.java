package practice;

public class Circle extends Shape implements ShapeInterface{
//	String color;
	int redius;
	static final double PI = 3.14;

	public Circle(String color,int redius) {
		super(color);
		this.color = color;
		this.redius = redius;
	}
	
	public void shape() {
		System.out.println(color + "색 원");
	}
	public double getArea() {
		return redius * redius * PI;
	}
}
