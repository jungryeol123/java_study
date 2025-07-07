package chapter07;

import java.util.Scanner;

public class OrderSystem {
	//Field
	
	Scanner scan = new Scanner(System.in);
	String[] menuNames = {"☕ 아메리카노","🍵 바닐라 라떼","🥤 딸기 쉐이크"};
	int[] menuPrice = {2800,3500,4000};

	Menu menuList[] = new Menu[3];
	
	int orderCount = 0;
	int amount = 0;
	int change = 0;
	
	
	//Constructor
	
	
	
	
	//Method
	//메뉴 저장
	public void createMenu() {
		for (int i = 0; i < menuNames.length;i++) {
			Menu menu = new Menu();
			menu.name = menuNames[i];
			menu.price = menuPrice[i];
			menu.no = i+1;
			
			menuList[i] = menu;
		}
		
		
		
	} //Method - createMenu
	public void showDrinkMenu() {
		System.out.println("  ===== 메뉴판 =====\n\n1. ☕ 아메리카노 - 2,800원\n2. 🍵 바닐라라떼 - 3,500원\n3. 🥤 딸기쉐이크 - 4,000원");
		
		
		
	}
	
	
	
	
	public void showMainMenu() {
		
		System.out.println("======================");
		System.out.println("1. 메뉴 선택");
		System.out.println("2. 메뉴 결제");
		System.out.println("9. 프로그램 종료");
		
		createMenu();
		selectMainMenu();
	} //Method - showMenu
	
	
	public void selectMainMenu() {
		System.out.print("메인메뉴(숫자)> ");
		
		if (scan.hasNextInt()) {
			menuCheck(scan.nextInt());
		} else {
			System.out.println("=> 입력된 값이 바르지 않음. 다시 입력!!");
			scan.next();
			showMainMenu();
		}
	} //Method - selectMainMenu
	
	
	
	
	
	
	public void menuCheck(int mainMenu) {
		switch (mainMenu) {
		case 1 :  //메뉴 출력
			showDrinkMenu();
			break;
		case 2 :  //주문 기능
//			orderMenu();
			
			break;
		case 3 :  //결제 기능
//			paymentMenu();
			
			break;
		case 4 :  //프로그램 종료
			System.out.println("--이용해주셔서 감사합니다--");
			System.exit(0);
			break;
		
		
		
		
		}
		
		
	}
	
	
	
	
	
	
	
	
}//class
