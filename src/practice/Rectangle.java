package practice;

public class Rectangle extends Shape{
//	String color;
	int width;
	int height;
	
	
	public Rectangle(String color, int width, int height) {
		super(color);
		this.color = color;
		this.width = width;
		this.height = height;
	}
	
	
	
	public void shape() {
		System.out.println(color + "색 사각형");
	}
	
	public double getArea() {
		return width * height;
	}
}
