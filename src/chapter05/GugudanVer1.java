package chapter05;

import java.util.Scanner;

public class GugudanVer1 {

	public static void main(String[] args) {
		// 구구단 2단 출력
	Scanner scan = new Scanner(System.in);
		
	int num1 = 0;	//단
	int num2 = 0;	
	
	
	System.out.println("출력하실 구구단을 입력하세요");
	
	while (true) {
		System.out.println("단 입력(종료:0)");
		num1 = scan.nextInt();
		
		if (num1 != 0) {
			//단의 변수값이 0이 아닌 경우 : 구구단 출력
			System.out.println("---"+ num1 + "단" + "---");
			for (int i =1; i <= 9; i++) {
			System.out.println(num1 + " * "+ i + " = "+ (num1*i));		
			}
			
		}	else {
			//프로그램 종료1
			System.out.println("-프로그램종료-");
			System.exit(0);
		}
			
	
	}//while

	
	
	
	
	
	
	
	
	
	}

}
