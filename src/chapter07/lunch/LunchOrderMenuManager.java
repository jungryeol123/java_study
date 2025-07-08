package chapter07.lunch;

public class LunchOrderMenuManager {
	//Field-----------------------------------------------
//	String[] lunchMenuNames;
//	int[] lunchMenuPrice;
	LunchOrderSystemOOP system;
	
	//Constructor-----------------------------------------
	
	public LunchOrderMenuManager() {}
	public LunchOrderMenuManager(LunchOrderSystemOOP system) {
		this.system = system; //없으면 nullPointAccrpttion 오류
	}
		
	
	//Method----------------------------------------------
	
		// LunchMenu 생성(주문할 메뉴명, 가격 호출)
		public void createLunchMenu() {
			for (int i = 0; i < system.lunchMenuNames.length; i++) {
				LunchMenu menu = new LunchMenu(); 						//new가 for문 밖에 있으면 마지막 데이터 값이 4번 나온다. 객체를 4개를 만들지 않으면
				menu.no = i+1;
				menu.name = system.lunchMenuNames[i];							//menu는 하나의 객체의 주소값을 갖기 때문에 마지막 값인 샐러드가 4번 나오게 된다.
				menu.price = system.lunchMenuPrice[i];
				
				system.lunchMenuList[i] = menu;
			}
		}//Method - createLunchMenu
		
		public void showLunchMenu() {
			
			System.out.println("*******************************************");
			for (LunchMenu menu : system.lunchMenuList) {
				System.out.print(menu.no + ". ");
				System.out.print(menu.name+ "\t");
				System.out.println(menu.price+ "\n");
			}
			System.out.println("*******************************************");
			selectLunchMenu();
		} //Method - showLunchMenu
		
		//런치메뉴 선택
		public void selectLunchMenu() {
			System.out.print("주문메뉴(숫자)> ");
			
			if (system.scan.hasNextInt()) {
				lunchMenuCheck(system.scan.nextInt());
			} else {
				System.out.println("=> 입력된 값이 바르지 않음. 다시 입력!!");
				system.scan.next();
				selectLunchMenu();
			}
		}
		//런치메뉴 체크
		public void	lunchMenuCheck(int lunchMenu) {
			//LunchMenu : 1~4 값이면 => 주문가능, 다른번호 : 메뉴 준비중
			if(1 <= lunchMenu && lunchMenu <=4) {
				//주문진행
				system.order(lunchMenu);
				
			} else {
				System.out.println("=> 런치 메뉴 준비중~");
				showLunchMenu();
			}
			
		}
		/*
		 * 메인메뉴 출력
		 */
		
		public void showMainMenu() {
			
			System.out.println("*******************************************");
			System.out.println("\t Welcome to ["+system.title+"] Food Market!!!");
			System.out.println("*******************************************");
			System.out.println("\t 1. 음식 주문");
			System.out.println("\t 2. 주문 내역");
			System.out.println("\t 3. 음식 결제");
			System.out.println("\t 4. 결제 내역");
			System.out.println("\t 9. 프로그램 종료");
			System.out.println("*******************************************");
			
			//createLunchMenu();
			selectMainMenu();
			
			
				
		} //Method - showMainMenu
		
		//메인메뉴 선택
		public void selectMainMenu() {
			System.out.print("메인메뉴(숫자)> ");
			
			if (system.scan.hasNextInt()) {
				mainMenuCheck(system.scan.nextInt());
			} else {
				System.out.println("=> 입력된 값이 바르지 않음. 다시 입력!!");
				system.scan.next();
				selectMainMenu();
			}
		} //Method - inputMainMenu
		
		
		
		
		//메인메뉴 체크
		public void mainMenuCheck(int mainMenu) {
			switch (mainMenu) {
			case 1 : showLunchMenu();
					 
					 
				break;
			case 2 : system.orderList();
				
				break;
			case 3 : system.payment();
				
				break;
			case 4 : system.paymentList();
				
				break;
			case 9 : 
				System.out.println("=> 음식 주문 시스템을 종료!!");
				System.exit(0);
				
				break;
			default :
				System.out.println("=> 메뉴 준비중");
				showMainMenu();
			
			}
			
		}	
	

	//Method
	
}
