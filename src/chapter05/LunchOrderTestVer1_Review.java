package chapter05;

import java.util.Scanner;

public class LunchOrderTestVer1_Review {

	public static void main(String[] args) {
		// 메뉴판
		System.out.println("*******************************************");
		System.out.println("\t Welcome to Food Market!!!");
		System.out.println("*******************************************");
		System.out.println("\t 1. 햄버거(🍔):100원\t 2. 피자(🍕):200원");
		System.out.println("\t 3. 라멘(🍜):300원\t 4. 샐러드(🥗):400원");
		System.out.println("\t 9. 나가기");
		System.out.println("*******************************************");
		
		// 1. 상품 메뉴 고르기, 2. 상품 메뉴 결제, 3. 결제 내역 보기
		
		int menuNo = 0;				//메뉴 숫자
		String menuName = "";		//메뉴 이름
		int menuPrice = 0;			//메뉴 가격
		int charge = 0;				//결제 할 때 지불한 돈
		int change = 0;				//거스름 돈
		
		Scanner scan = new Scanner(System.in);
		
		//1. 상품 메뉴 고르기
		System.out.print("메뉴를 골라주세요(숫자입력) : ");
		
		if (scan.hasNextInt()) {
			
			menuNo = scan.nextInt();
			
			switch (menuNo) {
				case 1 :
					menuName = "햄버거(🍔)";
					menuPrice = 100;
					break;
				case 2 :
					menuName = "피자(🍕)";
					menuPrice = 200;
					break;
				case 3 :
					menuName = "라멘(🍜)";
					menuPrice = 300;
					break;
				case 4 :
					menuName = "샐러드(🥗)";
					menuPrice = 400;
					break;
				default :
					System.out.println("메뉴가 존재하지 않습니다.");
			}
		//2. 상품 메뉴 결제
		System.out.print("지불하실 금액을 입력해주세요 : ");
		
		
			
			charge = scan.nextInt();
			
			if (charge >= menuPrice) {
				
				change = charge - menuPrice;
				
			} else {
				System.out.println("결제 요금이 부족합니다.");
			}
		}	else {
			System.out.println("올바른 입력값이 아닙니다.");
		}
		
		System.out.println("주문하신 메뉴는 "+menuName+"이고, 가격은 "+menuPrice+"원 이고,거스름 돈은 "+change+" 입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
