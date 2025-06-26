package chapter05;

import java.util.Scanner;

public class IfOvrelabTest2 {

	public static void main(String[] args) {
		Scanner score = new Scanner(System.in);
		
		boolean math_pass = false, eng_pass = false;
		
		System.out.println("점수를 입력하세요"+"\n");
		System.out.println("수학 점수 : ");
		math_pass = (score.nextInt() >= 60)? true : false;
		System.out.println("영어 점수 : ");
		eng_pass = (score.nextInt() >= 60)? true : false;
		
		if (math_pass == true) {
			if (eng_pass == true) System.out.println("통과");
		}
		else System.out.println("탈락");
			
		
	
	
	 // 2. 논리연산자 &&
	  if(math_pass  && eng_pass ){
	  		System.out.println("합격");
	  	} else {
	  		System.out.println("불합격");
	  	}
	  
	}
}
