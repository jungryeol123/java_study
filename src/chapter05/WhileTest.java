package chapter05;

import java.util.Scanner;

/*
 * 반복문 : while(조건식) { 조건식이 true인 경우에만 실행;)
 * 		   종료되는 시점을 정확하게 알고 있는 경우 사용됨
 * }
 */
public class WhileTest {
	public static void main(String[] args) {
		//1~10까지 정수의 합계를 출력
		Scanner scan = new Scanner(System.in);
		
		int start = 0, end = 0,i = 1, sum = 0;
		System.out.println("숫자입력");
		start = scan.nextInt();
		System.out.println("숫자입력");
		end = scan.nextInt();
		
		while(start <= end) {
			sum += start;
			start++; //i += 10;
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
