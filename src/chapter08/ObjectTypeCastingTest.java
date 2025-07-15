package chapter08;

public class ObjectTypeCastingTest {

	public static void main(String[] args) {
		Circle yellowC = new Circle("노랑",1);
		Rectangle blueR = new Rectangle("파랑",1,2);
//		Shape은 Circle의 부모클래스이기 때문에 오류가 나지 않는다.
		Shape s = new Circle("초록색",2); //자동형변환
		Circle cs = (Circle)s;			//강제(명시적)형변환
//		Rectangle t = new Circle("초록색",2);
//		Rectangle r = (Rectangle)s; - Circle 클래스로 만들었기때문에 오류 따라서 생성할때 만든 자식의 클래스만 형변환 가능.
				
		Shape s2 = new Shape("빨강");
//		Circle cs2 = (Circle)s2;  - 강제형변환 X 
		
		//인터페이스를 통해 자식의 모습으로 객체를 구현하는 것을 권장함!!
		ShapeInterface si = new Circle("코랄",1);
		si.draw();  //자식인 Circle의 draw() 호출됨
		System.out.println(si.getArea());
		Circle cs3 = (Circle)si;
		cs3.draw();
		System.out.println(cs3.getArea());
		
		//상속받은 인터페이스를 통한 객체 생성 : 인터페이스 기반 설계
		//사각형, 삼각형
		ShapeInterface rSi = new Rectangle("주황",3,4);
		ShapeInterface tSi = new Triangle("검정",2,5);
	//  (추상메소드)    ----다형성----   (상속받아 오버라이딩)
		rSi.draw();
		tSi.draw();
		System.out.println(rSi.getArea());
		System.out.println(tSi.getArea());
		
		yellowC.draw();
		blueR.draw();
//		s.draw();    - Shape 클래스는 draw() 메소드를 정의하지 않음
		System.out.println(s.color);
		System.out.println(cs.color);
		System.out.println(cs.ban);
	}

}
