package chapter04;

import java.util.Scanner;

//(조건식)? 결과1 : 결과2 ;
public class OpTest {

	public static void main(String[] args) {
		//지역변수를 선언하는 경우에는 반드시 초기화를 진행한다.
		int age = 0;
		int height = 0;
		boolean parent = false;
		boolean heart = false;
		// 6세이상 탑승 120 넘어야함 단 보호자 동반 120넘으면 가능 심장관련 XX
		
		Scanner info = new Scanner(System.in);
		System.out.println("*************************************************\n\t놀이기구 탑승전 유의사항 및 체크\n*************************************************");
		System.out.println("<정보를 입력해주세요>\n\n*유무 기입은 1과 0으로 입력하세요\n");
		System.out.print("나이 : ");
		age = info.nextInt();
		System.out.print("키 : ");
		height = info.nextInt();
		System.out.print("보호자 동반 : ");
		parent = (info.nextInt() == 1)? true : false;
		System.out.print("심질환 유무 : ");
		heart = (info.nextInt() == 1)? true : false;
		
		String board = ((((age >= 6) && (height >= 120)) || ((age < 6) &&(height >= 120) && (parent == true))) && (heart == false))? "*탑승 가능*" : "*탑승 불가*";
		
		
		System.out.println("\n" + board);
		

	}

}
