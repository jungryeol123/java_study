package chapter13;

import java.util.HashMap;
import java.util.Map;

/**
 * Map 인터페이스
 */
public class MapTest {

	public static void main(String[] args) {
		Map<Integer, String> subjects = new HashMap<Integer, String>();
		
		//1. 데이터 저장 : C(Create)
		subjects.put(1,"자바");
		subjects.put(2,"mysql");
		subjects.put(3,"html");
		
		//2. 데이터 출력 : R(Read)
//		subjects.forEach(System.out::println);  - 클래스 참조 형식의 람다코드는 사용X --key value값 두개가 나와야함
		subjects.forEach((key,value) -> System.out.println(key + " , " + value));
		System.out.println();
		
		//3. 데이터 수정 : U(Update)
		subjects.replace(2, "Oracle");
		subjects.forEach((key,value) -> System.out.println(key + " , " + value));
		
//		if(subjects.containsKey(2)) subjects.put(2,"Oracle");
//		subjects.forEach((key,value) -> System.out.println(key + " , " + value));

		//4. 데이터 삭제 : D(Delete)
		//oracle 삭제
		
		subjects.remove(2);
		System.out.println();
		subjects.forEach((key,value) -> System.out.println(key + " , " + value));

		subjects.clear(); //전체 삭제

		System.out.println();
		subjects.forEach((key,value) -> System.out.println(key + " , " + value));
		
		subjects.put(3, "oracle");
		System.out.println();
		subjects.forEach((key,value) -> System.out.println(key + " , " + value));
		
		
		
		
		

	}//main

}//class
