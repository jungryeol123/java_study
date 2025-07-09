package vending_machine_ver1_1;

import commons.Menu;

public class VendingMachine {
	//Field
	String[] nameList = {"☕ 밀크커피","☕ 아메리카노","🍋 유자차","🥛 우유"};
 	int[] priceList = {300,400,300,200};
	Menu[] menuList;
 	Menu[] orderMenuList;
 	int orderCount;
 	
 	String title;
 	User user;
 	int totalCoin;
 	
 	
	//Constructor
	public VendingMachine(User user) {
		this("MEGA",user);
	}
	
	public VendingMachine(String title, User user) {
		this.title = title;
		this.user = user;
		createMenuList();
		showMenuList();
		checkInsertCoin();
	}

	
	
	//Method
	
	//메뉴 리스트 생성
	public void createMenuList() {
		menuList = new Menu[nameList.length];
		for(int i = 0; i < nameList.length; i++) {
			int no = i+1;
			String name = nameList[i];
			int price = priceList[i];
			
			Menu menu = new Menu(no,name,price);
			menuList[i] = menu;
		}
	}
	//전체 메뉴 출력
	public void showMenuList() {
		System.out.println("------------------------------------------------------");
		System.out.println("\t\t"+ title+ "Coffee Machine");
		System.out.println("------------------------------------------------------");
		for(Menu menu:menuList) {
			System.out.print(menu.getNo()+". ");
			System.out.print(menu.getName()+"\t");
			System.out.print(menu.getPrice()+"원\n");
		}
		System.out.println("------------------------------------------------------");
	}
	
	//메뉴 출력
	
	
	//입력되는 동전 체크
	public void checkInsertCoin() {
		System.out.println("동전 투입(100원짜리 or 500원짜리> ");
		int coin = user.insertCoin();
		if(coin == 100 || coin == 500) {
			totalCoin += coin;
			System.out.println("총 투입한 금액 : "+ totalCoin + "원");
			if(totalCoin < 200) {
				System.out.println("금액이 부족합니다. 돈 더 내놔");
				checkInsertCoin();
			} else {
				System.out.print("동전투입종료:(n),동전추가투입(아무키)> ");
				if (user.scan.next().equals("n")) {
					showMenuList();
				} else {
					checkInsertCoin();
				}
			}
		} else {
			System.out.println("100원짜리 또는 500원짜리 동전을 투입해주세요");
			checkInsertCoin();
		}
		
	}
	
	//주문 가능한 메뉴 리스트 생성
	public void orderMenuList() {
		
	}

	
	//주문
	
	
	//결제
	
	
	//결제 종료 후 객체 초기화
	
	
	//종료
	
	
	
	//총 투입금액에 맞춘 메뉴 출력
	
	


	
	
} //class
