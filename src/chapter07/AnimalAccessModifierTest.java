package chapter07;

import commons.Animal;
import java.util.Calendar;

public class AnimalAccessModifierTest {

	public static void main(String[] args) {
		//Calendar 객체 
//		Calendar c  = new Calendar(); - 상속관계가 없으므로 객체 생성 불가!!
		Calendar c = Calendar.getInstance();	//생성된 객체의 인스턴스주소를 가져옴, Singleton(싱글톤)
		System.out.println(c.getTime());
		
		
		AnimalAccessModifier.sname = "스택틱";
		AnimalAccessModifier.sage= 10;
		AnimalAccessModifier.getInfo3() ;
		
		
		
		AnimalAccessModifier amm = new AnimalAccessModifier("호순이",5);
		
		
		
		amm.sname = "스택틱2";
		amm.sage = 12;
		amm.getInfo2();
		
		Animal comDog = new Animal();
		
		//final 변수 테스트
//		amm.fname = "홍길순";      final 키워드 변수는 외부에서 값을 변경X
//		amm.fage = 2;
		
		//상수 호출
		int start = AnimalAccessModifier.START;
		int con = AnimalAccessModifier.CONTINUE;
		int end = AnimalAccessModifier.END;
		
		
		
		comDog.setName("예삐");
		comDog.setAge(10);
		
//		comDog.name = "예삐";
//		comDog.age = 3; -패키지가 다르므로 접근 불가 : default(package)
		
		amm.name = "심바";
		amm.age = 5;
		
//		amm.pname = "호순이";  클래스가 다르므로 접근 불가 : private
//		amm.page = 4;
		
		System.out.println("name = "+amm.name);
		System.out.println("age = "+amm.age);
		
		System.out.println("name = "+amm.getPname());
		System.out.println("age = "+amm.getPage());
		
		System.out.println("name = "+comDog.getName());
		System.out.println("age = "+comDog.getAge());
		
		
	}

}
