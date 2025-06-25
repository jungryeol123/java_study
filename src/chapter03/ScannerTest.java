package chapter03;

import java.util.Scanner;		//Scanner 클래스를 쓰기 위한 기초 작업

public class ScannerTest {

	public static void main(String[] args) {
		//Scanner 변수명 = new Scanner(System.in)
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		//이름을 입력하는 것이기 때문에 문자열로 받아와야해서 String으로 변수를 정한뒤 그 변수에 scan.next(); 입력한 값을 넣어준다.
		String name = scan.next();
		
		System.out.print("나이를 입력하세요 : ");
		//위와는 다르게 age는 나이이므로 정수형인 int를 받아야하기 때문에 변수명.nextInt();를 사용하여 정수값을 받아준다.
		int age = scan.nextInt(); 
		
		System.out.print("과목을 입력하세요 : ");
		String subject = scan.next();
		
		
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("과목 : "+subject);

	}

}
