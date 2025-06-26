package chapter04;
/*
 * 삼항연산자 : (조건식) ? 결과1 : 결과2 ;
 */

import java.util.Scanner;

public class OpTernaryTest {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);	//class 쓸때 오류 뜨면 먼저 import 확인, 되어있으면 철자 확인
		System.out.print("점수입력 : ");
		
		int score = input.nextInt();
		
		//score가 60점 이상이면 "합격", 미만이면 "불합격"임. 해당 결과를 result 변수에 대입함
		
		String result = (score >= 60)? "합격" : "불합격" ;
		System.out.println("result : "+ result);
		
		
	}
}
