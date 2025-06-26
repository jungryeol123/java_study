package chapter05;

import java.util.Scanner;

public class IfOvrelabTest {

	public static void main(String[] args) {
		Scanner score = new Scanner(System.in);
		
		int math = 0, eng = 0;
		
		System.out.println("점수를 입력하세요"+"\n");
		System.out.println("수학 점수 : ");
		math = score.nextInt();
		System.out.println("영어 점수 : ");
		eng = score.nextInt();
		
		if (math >= 60) {
			if (eng >= 60) {
				System.out.println("통과");
			}
		} else {
				System.out.println("탈락");
			
		}
	}
	/*
	 * 2. 논리연산자 &&
	 * if(math >= 60 && eng >= 60){
	 * 		System.out.println("합격");
	 * 	} else {
	 * 		System.out.println("불합격");
	 * }
	 */
	
}
