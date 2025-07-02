package chapter06;

import java.util.Scanner;

/*	
 * 음식 주문/결제 프로그램(콘솔)
 * - 음식을 주문(1),결제(2), 프로그램 종료(9)하는 메뉴로 구성된다.
 * - 프로그램 종료를 제외하고 나머지 메뉴는 반복 선택 가능하다.
 * - 메뉴 선택 시 체크하는 기능은 switch~case를 이용하여 구현한다.
 * 
 * << 추가 사항 >>
 * (1) 예외사항 처리 : 메뉴 선택, 결제 금애 입력 시 정수형 타입이 아닌 경우 메시지 출력 후 재입력을 유도함.
 * (2) 입력값이 정확할 때까지 재입력으 유도하여 진행, flag 변수를 이용하여 반복
 * (3) 결제 금액이 부족한 경우 재입력을 통해 금액을 누적으로 계산하여 저장 후 결제
 */

public class SelfTestLunch1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// 필요한 변수 - 메뉴명(배열) , 가격(배열)
		
		System.out.println("주문할 메뉴 수> ");
		final int MAX_SIZE = scan.nextInt(); //주문할 메뉴 수를 상수 값으로 받아서 고정 시켜놓는다.
		
		String[] menuList = {"햄버거","샐러드","피자빵","칼국수"};
		int[] menuPrice = {100,200,300,400};
		
		boolean menuFlag = true; //메뉴를 한번은 반드시 보여줘야 하기 때문에 처음 값을 true로 값을 받아 실행한다. 이후 while에서 빠져나오려면 menuFlag = false; 를 사용하여 빠져나오기
		int count = 0; //카운터 변수 - 주문받은 횟수 카운팅
		while (menuFlag) {
		
		System.out.println("------------------------------------------------------");
		System.out.println("메뉴판");
		System.out.println("1. 햄버거\t2. 샐러드\t3. 피자빵\t4. 칼국수");
		System.out.println("------------------------------------------------------");
		System.out.println("키오스크 이용");
		System.out.println("1. 주문");
		System.out.println("2. 주문 내역");
		System.out.println("3. 결재");
		System.out.println("4. 결재 내역");
		System.out.println("9. 프로그램 종료");
		System.out.println("------------------------------------------------------");
		
		System.out.println("이용할 메뉴 번호> ");
		int menuNo = scan.nextInt();		
		
		
		if (menuNo == 1) { //주문
			
			
			
		} else if (menuNo == 2) {
			
		} else if (menuNo == 3) {
			
		} else if (menuNo == 4) {
			
		} else if (menuNo == 9) {
			
		} else {
			System.out.println("메뉴에 있는 번호를 입력해주세요");
		}
			
			
			
			
			
			
			
			
			
			
			
			
			
		} //while - menuFlag 
		
		
		
	
		
	}//main
}//class
