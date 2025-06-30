package chapter06;

import java.util.Scanner;

/*
 * 기본형 데이터와 참조형 데이터의 저장구조를 정리
 */
public class ReferenceDataCheckTest {
	public static void main(String[]args) {
		//기본형
		int a = 10;
		int b = 10;
		String str1 = "홍길동은 자바천재";
		String str2 = "홍길동은 자바천재";
		String str3 = "홍길순은 자바천재";
		
		// call by value 형태로 값을 비교
		System.out.println("a == b : "+(a==b)); 
		System.out.println("str1 == str2 : "+(str1==str2)); 
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println();
		//참조형
		
		String strObject = new String("홍길동");
		String strObject2 = new String("홍길동");
		
		System.out.println(System.identityHashCode(strObject)); // 같은 홍길동처럼 보여도 다른 주소에서 참조하여 가져오는 홍길동이다
		System.out.println(System.identityHashCode(strObject2));
		System.out.println("strObject == strObject2 : "+(strObject==strObject2)); //stack 주소비교
		
		System.out.println("strObject.equals == strObject2.equals : "+(strObject.equals(strObject2))); //stack에 있는 주소로 갔을 때 담고있는 값의 비교 * 같은 홍길동이 들어있기 때문에 true
		
		strObject = str1;
		System.out.println(strObject);
		System.out.println(System.identityHashCode(strObject2));
		System.out.println();
		
		// Scanner 객체를 이용하여 문자열 입력
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열 입력> ");
		String sdata = scan.next();
		
		System.out.println(sdata);
		System.out.println("sdata == str1 : "+(sdata==str1));
		System.out.println("sdata.equals == str1 : "+(sdata.equals(str1)));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
