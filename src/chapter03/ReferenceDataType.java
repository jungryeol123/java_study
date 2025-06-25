package chapter03;

import java.lang.String;								//lang은 자주 쓰이기 때문에 import를 안해도 된다.
import java.lang.System;
import java.util.Scanner;

public class ReferenceDataType {

	public static void main(String[] args) {
		
		//참조 데이터 타입 정의 : 배열, 클래스, 인터페이스 ..
		String name1 = new String("홍길동");
		
		Scanner scan = new Scanner(System.in);
		
		//***중요 	String 클래스는 기본형으로도 사용이 가능함
		String name2 = "홍길동";
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name1 == name2);
		System.out.println(scan);
	}

}
