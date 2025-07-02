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

public class LunchOrderTestVer3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		boolean menuFlag = true;
		//주문 음식 리스트
		String[] menuList = {"햄버거(🍔)","피자빵(🍕)","칼국수(🍜)","샐러드(🥗)"};
		int[] priceList = {100,200,300,400};
		
		//주문 리스트 선언 및 생성
		System.out.print("주문 리스트 크기> ");
		final int MAX_SIZE = scan.nextInt();
		String[] orderMenuList = new String[MAX_SIZE];
		int[] orderPriceList = new int[MAX_SIZE];
		int count = 0;
		
		//결제 리스트 선언 및 생성
		//메뉴명, 결제금액, 입금금액, 잔액
		String[] paymentMenuList = new String[MAX_SIZE];
		int[] totalAmountList = new int[MAX_SIZE];
		int[] paidAmountList = new int[MAX_SIZE];
		int[] changeList = new int[MAX_SIZE];
		int paymentCount = 0;
		
		
		
		while (menuFlag) {
			System.out.println("*******************************************");
			System.out.println("\t Welcome to Food Market!!!");
			System.out.println("*******************************************");
			System.out.println("\t 1. 음식 주문");
			System.out.println("\t 2. 주문 내역");
			System.out.println("\t 3. 음식 결제");
			System.out.println("\t 4. 결제 내역");
			System.out.println("\t 9. 프로그램 종료");
			System.out.println("*******************************************");
			System.out.print("메뉴> ");
			int menu = scan.nextInt();
			
			switch (menu) {
				case 1 : //음식 주문
//					System.out.println("=> 주문!!");
					boolean orderFlag = true;
					
					while (orderFlag) {
						System.out.println("*******************************************");
						System.out.println("\t 1. 햄버거(🍔):100원\t 2. 피자빵(🍕):200원");
						System.out.println("\t 3. 칼국수(🍜):300원\t 4. 샐러드(🥗):400원");
						System.out.println("*******************************************");
						System.out.print("주문 메뉴(숫자로)> ");
						
						if (scan.hasNextInt()) {
						int	menuNo = scan.nextInt();

						if(1 <= menuNo && menuNo <= 4) {
							orderMenuList[count] = menuList[menuNo-1];
							orderPriceList[count] = priceList[menuNo-1];
							
							count++;
							System.out.println("=> " + menuList[menuNo-1] + "주문 완료");
							
						} else {
							System.out.println("존재하지 않는 메뉴입니다.");
						}
						
						
//						switch (menuNo) {					//주문 메뉴 선택
//							
//							
//							case 1 :
//								orderMenuList[count] = menuList[menuNo-1];
//								orderPriceList[count] = priceList[menuNo-1];
//								break;
//							case 2 :
//								orderMenuList[count] = menuList[menuNo-1];
//								orderPriceList[count] = priceList[menuNo-1];
//								break;
//							case 3 :
//								orderMenuList[count] = menuList[menuNo-1];
//								orderPriceList[count] = priceList[menuNo-1];
//								break;
//							case 4 :
//								orderMenuList[count] = menuList[menuNo-1];
//								orderPriceList[count] = priceList[menuNo-1];
//								break;
//							
//							default :
//								System.out.println("존재하지 않는 메뉴입니다.");
//					}//switch
//							count++;
//							
//							System.out.println("=> " + menuList[menuNo-1] + "주문 완료");
							
							//주문 갯수 체크 (주문 리스트 저장 공간 O) - ex) count : 3, orderMenuList.length : 3
							if(count == MAX_SIZE) {
								System.out.println("=> 주문은 최대 " + MAX_SIZE + "개까지 가능");
								orderFlag = false;
								
							} else {
								System.out.println("계속 주문하려면 아무키나 누르세요(종료:n)");
								if(scan.next().equals("n")) {
									orderFlag = false;
								}
							}
//							System.out.println("주문하신 메뉴는 "+menuName+",가격은 "+menuPrice+"원 입니다.");
							
						} else {
							System.out.println("올바르지 않는 입력값입니다. 다시 입력해주세요");
							scan.next();		//hasNexint()는 스캔작업자체를 하는게 아니라 스캔으로 저장된 것을 없애주는 작업
					}
					
					}//while - menuNo
					
					break;
				case 2 : //음식 주문 리스트
					if(count != 0) {
					System.out.println("=> 주문 리스트!!");
					System.out.println("*******************************************");
					System.out.println("음식 주문 리스트!!");
					System.out.println("번호\t메뉴명\t\t가격");
					System.out.println("*******************************************");
					
					for (int i = 0; i < count; i++) {
						System.out.print((i+1) + "\t");
						System.out.print(orderMenuList[i] + "\t");
						System.out.print(orderPriceList[i] + "\n");
					}
					System.out.println("*******************************************");
					} else {
						System.out.println("=> 주문 내역 없음!!");
					}
					break;
				case 3 : //주문한 음식 결제
					boolean paymentFlag = true;
					int charge = 0;
					int change = 0;
					int totalPayment = 0;
					
					for (int i = 0; i < count; i++) {
						totalPayment += orderPriceList[i];
					}
					while (paymentFlag) { //결제 요금 부족시 반복 실행
						//결제 예정 금액 출력 : orderPriceList
						
						
						System.out.println("=> 결제 예정 금액 : " + totalPayment);
						System.out.print("결제할 요금 입력(숫자) : ");
						
						if (scan.hasNextInt()) {
								charge += scan.nextInt();
								System.out.println("총 입력 금액 :"+charge);
								
								if (charge >= totalPayment) {
									//결제 완료
									change = charge - totalPayment;
									paymentFlag = false; 	//정상적인 결제가 진행된 후
									
								}	else {
									System.out.println("요금이 부족합니다. 다시 입력해주세요.");
									
								}
									
								
						}	else {
							System.out.println("올바르지 않는 입력값입니다.");
							scan.next();
						}
						
					
						
					} // while - paymentFlag
					
					paymentMenuList[paymentCount] = orderMenuList[0]+"등..";
					totalAmountList[paymentCount] = totalPayment;
					paidAmountList[paymentCount] = charge;
					changeList[paymentCount] = change;
					
					
					System.out.println("=> 결제 완료");
					//orderMenuList, orderPriceList초기화
					
					
					// 결제 내역 리스트
					System.out.println("*******************************************");
					System.out.println("음식 결제 내역");
					System.out.println("메뉴명\t결제금액\t입금액\t잔액");
					System.out.println("*******************************************");
					
					System.out.print(orderMenuList[0]+"등..\t\t");
					System.out.print(totalPayment+"\t");
					System.out.println(change+"원");
					System.out.println("*******************************************");
//					System.out.print(paymentMenuList[paymentCount]+"등..\t\t");
//					System.out.print(totalAmountList[paymentCount]+"\t");
//					System.out.println(paidAmountList[paymentCount]+"원");
//					System.out.println(changeList[paymentCount]+"원");
//					System.out.println("*******************************************");

					for (int i = 0; i < count; i++) {
						orderMenuList[i] = null;
						orderPriceList[i] = 0;
					}
					
					
//					orderMenuList = new String[MAX_SIZE];
//					orderPriceList = new int[MAX_SIZE];
					
					count = 0; //order
					paymentCount++;
					
					break;
				case 4 :
					System.out.println("*******************************************");
					System.out.println("결제 내역");
					System.out.println("    메뉴명\t\t결제금액\t입금액\t잔액");
					System.out.println("*******************************************");
					for (int i = 0; i < paymentCount; i++) {
						
						System.out.print((i+1)+" ");
						System.out.print(paymentMenuList[i]+"\t");
						System.out.print(totalAmountList[i]+"\t");
						System.out.print(paidAmountList[i]+"원\t");
						System.out.print(changeList[i]+"원\n");
						
					}
					System.out.println("*******************************************");
					break;
				case 9 :
					System.out.println("--프로그램 종료--");
				   	System.exit(0);
				   	break;
				default :
					System.out.println("=> 메뉴 준비중!!");
			} //switch - menu
			
			
			
			
			
			
			
			
			
			
			
			
			
		} //menuFlag
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main
}//class
