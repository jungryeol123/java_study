package chapter11;

import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("num1> ");
		int num1 = scan.nextInt();
		
		System.out.println("num2> ");
		int num2 = scan.nextInt();
		
		try {
			int result = num1/num2;
			System.out.println("result = " + result);
			
			int[] numbers = {1,2,3};
			System.out.println(numbers[0]);
//			System.out.println(numbers[5]);
		
		} catch(Exception msg1) {
			System.out.println("예외 발생!!");
			msg1.printStackTrace();
		} finally {
			scan.close();
			System.out.println("--프로그램 종료--");
		}
		
		
		
		
	}//main

}//class
