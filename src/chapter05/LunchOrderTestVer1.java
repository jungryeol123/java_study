package chapter05;

import java.util.Scanner;

public class LunchOrderTestVer1 {

	public static void main(String[] args) {
		// 메뉴판
		System.out.println("*******************************************");
		System.out.println("\t Welcome to Food Market!!!");
		System.out.println("*******************************************");
		System.out.println("\t 1. 햄버거(🍔):100원\t 2. 피자(🍕):200원");
		System.out.println("\t 3. 라멘(🍜):300원\t 4. 샐러드(🥗):400원");
		System.out.println("\t 9. 나가기");
		System.out.println("*******************************************");
		
		Scanner scan = new Scanner(System.in);
		
		int menuNumber = -1;
		String menuName = "";
		int menuPrice = 0;
		
		
		
		
		
		
		//1. 메뉴를 선택하는 과정

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
		} else {
				System.out.println("올바르지 않는 입력값입니다");
		}
		
		System.out.println("주문하신 메뉴는 "+menuName+",가격은 "+menuPrice+"원 입니다.");
		//2. 주문 메뉴 결제
		
		System.out.print("결제할 요금 입력(숫자) : ");
		int charge = 0;
		int change = 0;
		if (scan.hasNextInt()) {
				charge = scan.nextInt();
				if (charge >= menuPrice) {
					change = charge - menuPrice;
					
				}	else {
					System.out.println("요금이 부족합니다. 다시 입력해주세요");
				}
				
				
				
		}	else {
			System.out.println("올바르지 않는 입력값입니다.");
		}
		
		
		
		
		
		
		
		
		
		//3. 주문 내역 출력 : 주문한 메뉴는 ???이고 총 금액은 ???원 잔돈은 ???원 입니다.
		
		System.out.println("주문한 메뉴는 "+menuName+"이고 결제금액은 "+menuPrice+"원 잔돈은 "+change+"원 입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
