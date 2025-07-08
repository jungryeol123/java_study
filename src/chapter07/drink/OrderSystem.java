package chapter07.drink;


import java.util.Scanner;
//☕ 아메리카노 - 2,800원
//🍵 바닐라 라떼 - 3,500원
//🥤 딸기 쉐이크 - 4,000원

//import commons.Menu;

public class OrderSystem {
	//Field --------------------------------------------------------------------------
	String[] names = {"☕ 아메리카노","🍵 바닐라 라떼","🥤 딸기 쉐이크"};
	Scanner scan = new Scanner(System.in);
	int[] price = {2800, 3500, 4000};
	Menu[] menuList = new Menu[names.length];
	String title;
	Order order;
	Payment payment;
	
	//Constructor --------------------------------------------------------------------
	public OrderSystem() {
		this("Mega");
//		init();
	}
	public OrderSystem(String title) {
		this.title = title;
		init();
	}
	
	
	
	
	//Method -------------------------------------------------------------------------

	public void init() {
		payment = new Payment();
		createMenuList();
		showMenu();
		selectMenu();
	}
	
	//메뉴 리스트 출력
	public void showMenu() {
		System.out.println("----------------------------------------------");
		System.out.println("              " +title+" Coffee Menu");
		System.out.println("----------------------------------------------");
		for(Menu menu : menuList) {
			System.out.print(menu.no + ". ");
			System.out.print(menu.name + "\t");
			System.out.print(String.format("%,d", menu.price) + "원\n");
		}
		System.out.println("----------------------------------------------");
	}
	
	//메뉴 리스트 생성
	public void createMenuList() {		
		for(int i = 0; i <names.length; i++) {
			Menu menu = new Menu((i+1),names[i],price[i]);
			menuList[i] = menu;
		}
	}
	//메뉴 선택
	public void selectMenu() {
		System.out.print("메뉴 선택(숫자)> ");
		if(scan.hasNextInt()) {
			int menu = scan.nextInt();
			if(1 <= menu && menu <=3) {
				placeOrder(menu);	//주문 진행 메소드
			} else {
				System.out.println("메뉴 준비중~");
				selectMenu();
			}
		} else {
			System.out.println("입력값이 올바르지 않습니다. 다시 선택해주세요.");
			scan.next();
			selectMenu();
		}
		
	}
	
	//주문
	public void placeOrder(int menu) {
		//번호에 맞는 메뉴를 메뉴리스트에서 검색한다. 검색한 메뉴를 Order 생성자에 매개변수로 입력한다.
		order = new Order(searchMenu(menu));
		if(order.orderMenu != null)order.getInfo();
		System.out.println("=> 주문완료!!");
		
		processPayment();
	}
	public void processPayment() {
		
		System.out.print("결제 금액(숫자)> ");
		if(scan.hasNextInt()) {
			payment.setAmount(scan.nextInt());
			System.out.println("=> 총 입금 금액 : "+ payment.getAmount());
			if(payment.getPayment(order.orderMenu.price)) {
				//결제완료
				System.out.println("=> 결제 완료!!"+ "잔돈: "+payment.getChange());
				showMenu();
				selectMenu();
			} else {
				//금액부족
				System.out.println("=> 결제 실패, 결제 금액 부족, 다시 입력!!");
				processPayment();
			}
			} else {
			System.out.println("입력값이 올바르지 않습니다. 다시 선택해주세요.");
			scan.next();
			processPayment();
		}
	}
	
	
	//선택한 번호의 메뉴 검색
	public Menu searchMenu(int menuNo) {
		Menu menu = null;
		
		for(Menu m:menuList) { //menuList[0] --> m --> Menu(아메리카노);
			if(m.no == menuNo) {
				menu = m;
				break;
			} 
		}
	
		return menu;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}//class
