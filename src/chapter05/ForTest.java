package chapter05;

import java.util.Scanner;

/*
 * 반복문 : for(초기값 선언; 조건식; 증감연산식) {
 * 				실행문(조건문이 true인 경우);
 * 					(조건식이 false가 되면 for 블록 종료
 * 					초기값으로 선언된 변수는 for 블록 안에서만 사용된다.
 * }
 * 
 *   
 */
public class ForTest {

	public static void main(String[] args) {
		//1~10까지 정수의 합계를 출력
		//시작과 종료값은 실행 시 외부에서 입력을 통해 진행
		
	Scanner scan = new Scanner(System.in);
	
	int start = 0, end = 0, sum = 0;
	
	System.out.println("시작값> ");
	start = scan.nextInt();
	
	
	System.out.println("종료값> ");
	end = scan.nextInt();
	
		for (int i = start; i <= end; i++) {		//1이상의 값을 누적합으로 작성 i += 값
			//변수 설정을 for 문 안에 하면 반복될 때마다 항상 초기화가 되기 때문에 for문 밖에 설정해야함
			System.out.print("i = " + i + ", " );
			sum += i;
			System.out.println(sum);
		}
		System.out.println("for문종료");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
