package chapter03;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = scan.next();
		
		System.out.print("나이를 입력하세요 : ");
		int age = scan.nextInt(); 
		
		System.out.print("과목을 입력하세요 : ");
		String subject = scan.next();
		
		
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("과목 : "+subject);

	}

}
