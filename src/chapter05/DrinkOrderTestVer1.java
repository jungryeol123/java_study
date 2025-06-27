package chapter05;

import java.util.Scanner;

public class DrinkOrderTestVer1 {
	public static void main(String[] args) {
		// 지역 변수 선언
		Scanner scan = new Scanner(System.in);
		int menuNo = 0;
		String menuName = "";
		int menuPrice = 0;
		String showPrice = "";
		boolean menuFlag = true;
		boolean payFlag = true;
		int charge = 0;
		int change = 0;

		//step 1. 메뉴판 출력
		System.out.println("  ===== 메뉴판 =====\n\n1. ☕ 아메리카노 - 2,800원\n2. 🍵 바닐라라떼 - 3,500원\n3. 🥤 딸기쉐이크 - 4,000원");
		
		
		//step 2. 메뉴 주문 기능
		
		while (menuFlag) {
			System.out.print("주문할 메뉴 번호 입력> ");
			if(scan.hasNextInt()) {
				//선택 메뉴번호를 체크하여 메뉴명, 메뉴가격을 별도의 변수에 저장
				menuNo = scan.nextInt();
				menuFlag = false;
				
				switch (menuNo) {
					case 1 :
						menuName = "☕ 아메리카노";
						menuPrice = 2800;
						break;
					case 2 :
						menuName = "🍵 바닐라라떼";
						menuPrice = 3500;
						break;
					case 3 :
						menuName = "🥤 딸기쉐이크";
						menuPrice = 4000;
						break;
					default :
						System.out.println("준비중 입니다. 메뉴를 다시 선택해주세요.");
						menuFlag = true;
						
				} //switch
				//출력용 메뉴 가격 저장
				showPrice = String.format("%,d", new Object[] { Integer.valueOf(menuPrice)});
				
			}	else {
				System.out.println("올바르지 않은 값입니다. 다시 입력해주세요");
				scan.next();
			}
		}//while
		System.out.println("주문 메뉴 => "+ menuName + ", 결제 예정 금액 : "+ showPrice+"원");
		
		//step 3 : 메뉴 결제 기능
		
		System.out.print("결제하실 금액을 입력하세요 : ");
		
		while (payFlag) {
		
			if (scan.hasNextInt()) {
				
				charge = scan.nextInt();
				if (charge >= menuPrice) {
					change = charge - menuPrice;
					System.out.println("총 입금금액 : "+ charge +	"\n=> 결제 완료! 잔돈 : " + change );
					payFlag = false;
				} else {
					System.out.println("총 입금금액 : "+ charge +"\n=> 금액이 부족합니다. 다시 입력해주세요");
				}
				
			} else {
				System.out.println("올바르지 않은 값입니다. 다시 입력해주세요");
			}
			
		}//while
		
		System.out.println("\n\n-이용해주셔서 감사합니다-");
		
		
		
		
		
		
		
		
	}
}
