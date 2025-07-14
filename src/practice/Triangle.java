package practice;

public class Triangle extends Shape{
//	String color;
	int width, height;
	static final int HIGH = 2;
	
	public Triangle(String color, int width, int height) {
		super(color);
		this.color = color;
		this.width = width;
		this.height = height;
	}
	
	
	public void shape() {
		System.out.println(color + "색 삼각형");
	}
	public double getArea() {
		return (width * height)/HIGH;
		
	}
}
