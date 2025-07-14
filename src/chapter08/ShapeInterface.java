package chapter08;

/**
 * 추상 메소드들을 모아 놓은 그룹 
 */

public interface ShapeInterface {
	// 어차피 모두 추상 메소드라 abstract 적을 필요없음
	public void draw();
	public double getArea(); 
}
