package chapter08;

public class Circle extends Shape implements ShapeInterface{
//	String color;
	double ban;
	public static final double PI = 3.14;
	
	public Circle() {
		this("빨강색",10.0);
	}
	public Circle(String color,double ban) {
		super(color);
//		this.color = color;
		this.ban = ban;
		
	}
	
	@Override
	public void draw() {
		System.out.println(color + "원을 그린다");
		
	}
	@Override
	public double getArea() {
		double result = 0;
		result = ((ban * ban)*PI);
		return result;
		
	}
	
	
}
