package chapter08;

public class Triangle extends Shape implements ShapeInterface{
	String color;
	int width;
	int height;
	
	public Triangle() {
		this("주황색",10,10);
	}
	public Triangle(String color,int width,int height) {
		super(color);
		this.color = color;
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void draw() {
		System.out.println(color + "삼각형을 그린다.");
	}
	@Override
	public double getArea() {
		
		return (width * height)/2;
	}
	
}
