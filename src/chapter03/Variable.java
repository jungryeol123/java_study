package chapter03;

import java.lang.String;									//lang에 있는 클래스는 import로 가져올 필요X

public class Variable {
		public static void main(String[] args) {
//			기본 자료형 변수 정의
			int age = 10;
			double aged = 10.0;
			boolean flag = true;     						//true(1), false(2)
			char name1 = '홍';
			char name2 = '길';
			char name3 = '동';
			
//			참조 자료형 변수 정의								**String 클래스는 기본형과 참조형으로 모두 사용 가능하다.
			String sname1 = "짱구";							//기본형 String (Stack에 저장)
			String sname2 = new String("도라에몽");			//참조형 String (Heap에 저장)
			
//			출력
			System.out.println(age);
			System.out.println(aged);
			System.out.println(flag); 
			System.out.print(name1);
			System.out.print(name2);
			System.out.println(name3);
			System.out.println(sname1);
			System.out.println(sname2);
		}
}
