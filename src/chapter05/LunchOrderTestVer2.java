package chapter05;

import java.util.Scanner;
/*
 * (1) 예외사항 처리 : 메뉴 선택, 결제 금애 입력 시 정수형 타입이 아닌 경우 메시지 출력 후 재입력을 유도함.
 * (2) 입력값이 정확할 때까지 재입력으 유도하여 진행, flag 변수를 이용하여 반복
 * (3) 결제 금액이 부족한 경우 재입력을 통해 금액을 누적으로 계산하여 저장 후 결제
 */
public class LunchOrderTestVer2 {

	public static void main(String[] args) {
		// 메뉴판
		System.out.println("*******************************************");
		System.out.println("\t Welcome to Food Market!!!");
		System.out.println("*******************************************");
		System.out.println("\t 1. 햄버거(🍔):100원\t 2. 피자(🍕):200원");
		System.out.println("\t 3. 라멘(🍜):300원\t 4. 샐러드(🥗):400원");
		System.out.println("\t 9. 나가기");
		System.out.println("*******************************************");
		
//		int a = 2800;
//		String aa = String.format("%,d", new Object[] { Integer.valueOf(a)});
//		System.out.println(aa);
		Scanner scan = new Scanner(System.in);
		
		int menuNumber = -1;
		String menuName = "";
		int menuPrice = 0;
		boolean menuFlag = true;
		boolean payFlag = true;
		int charge = 0;
		int change = 0;
		
		//1. 메뉴를 선택하는 과정

		while (menuFlag) {
			System.out.println("메뉴 선택(\"숫자입력\")> ");
			
			if (scan.hasNextInt()) {
				menuNumber = scan.nextInt();
				
			switch (menuNumber) {					//switch
				case 1 :
					menuName = ("햄버거(🍔)");
					menuPrice = 100;
					break;
				case 2 :
					menuName = ("피자(🍕)");
					menuPrice = 200;
					break;
				case 3 :
					menuName = ("라멘(🍜)");
					menuPrice = 300;
					break;
				case 4 :
					menuName = ("샐러드(🥗)");
					menuPrice = 400;
					break;
				case 9 :
					System.out.println("-- 프로그램 종료 --");
					System.exit(0);
					break;
				default :
					System.out.println("존재하지 않는 메뉴입니다.");
		}//switch
				menuFlag = false;
			} else {
				System.out.println("올바르지 않는 입력값입니다. 다시 입력해주세요");
				scan.next();		//hasNexint()는 스캔작업자체를 하는게 아니라 스캔으로 저장된 것을 없애주는 작업
		}
		
		}//while
			
			
			
//			if (menuNumber == 1) {
//				System.out.println("선택한 메뉴는 햄버거(🍔) 입니다.");
//			}	else if (menuNumber ==2 ) {
//				System.out.println("선택한 메뉴는 피자(🍕) 입니다.");
//			}	else if (menuNumber == 3 ) {
//				System.out.println("선택한 메뉴는 라멘(🍜) 입니다.");
//			}	else if (menuNumber == 4) {
//				System.out.println("선택한 메뉴는 샐러드(🥗) 입니다.");
//			}	else if (menuNumber == 9) {
//				System.out.println("-- 프로그램 종료 --");
//				System.exit(0);
//			}	else {
//				System.out.println("선택하신 메뉴는 존재하지 않습니다.");
//			}
		 
		
		System.out.println("주문하신 메뉴는 "+menuName+",가격은 "+menuPrice+"원 입니다.");
		//2. 주문 메뉴 결제
		
		while (payFlag) {
			
			System.out.print("결제할 요금 입력(숫자) : ");
			
			if (scan.hasNextInt()) {
					charge += scan.nextInt();
					System.out.println("총 입력 금액 :"+charge);
					
					if (charge >= menuPrice) {
						change = charge - menuPrice;
						payFlag = false; 	//정상적인 결제가 진행된 후
						
					}	else {
						System.out.println("요금이 부족합니다. 다시 입력해주세요.");
						
					}
						
					
			}	else {
				System.out.println("올바르지 않는 입력값입니다.");
				scan.next();
			}
			
		
			
		}//while
		
		
		
		
		
		//3. 주문 내역 출력 : 주문한 메뉴는 ???이고 총 금액은 ???원 잔돈은 ???원 입니다.
		
		System.out.println("주문한 메뉴는 "+menuName+"이고 결제금액은 "+menuPrice+"원 잔돈은 "+change+"원 입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
