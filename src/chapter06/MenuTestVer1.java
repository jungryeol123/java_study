package chapter06;

import java.util.Scanner;

/*
 * 더조은 레스토랑 메뉴 등록/출력/검색 프로그램
 * - 메뉴는 피자, 햄버거, 라멘, 샐러드
 * - 메뉴명, 이모지, 가격을 저장
 * - 메뉴명, 이모지, 가격은 각각 1차원 배열로 생성하여 관리
 * - 메뉴 관리를 위해서 각 배열의 주소를 통일시킨다
 */
public class MenuTestVer1 {

	public static void main(String[] args) {
		//변수 or 객체 선언
		Scanner scan = new Scanner(System.in);
		
		System.out.print("메뉴 갯수> ");
		final int MAX_SIZE = scan.nextInt();
		
		String[] nameList = new String[MAX_SIZE];
		String[] emojiList = new String[MAX_SIZE];
		int[] priceList = new int[MAX_SIZE];
		int menuCount = 0;
		
		//메뉴 등록/출력/검색/종료
		boolean menuFlag = true;
		int menu = 0;
		while(menuFlag) {
			System.out.println("-------------------------------------------");
			System.out.println("\t더조은 레스토랑 메뉴 관리 프로그램");
			System.out.println("-------------------------------------------");
			System.out.println("1. 메뉴 등록");
			System.out.println("2. 메뉴 리스트 출력");
			System.out.println("3. 메뉴 검색");
			System.out.println("9. 프로그램 종료");
			System.out.println("-------------------------------------------");
			System.out.print("메뉴번호>> ");
			menu = scan.nextInt();
			
			//메뉴 체크
			//저장공간의 크기 만큼 반복 수행, 메뉴 하나 등록 완료 시 카운트 변수 1증가
			//저장공간의 크기가 부족하면 메세지 출력 후 종료
			if (menu == 1) {
				System.out.println("등록");
				
				for (int i = menuCount; i < MAX_SIZE; i++) {    //입력된 정보가 최근 하나만 나올때 대부분 이곳 오류
					System.out.print("메뉴명> ");
					nameList[i] = scan.next();
					
					System.out.print("이모지> ");
					emojiList[i] = scan.next();
					
					System.out.print("가격> ");
					priceList[i] = scan.nextInt();
					menuCount++;
					
					if (menuCount == MAX_SIZE) {
						System.out.println("=> 저장공간 부족, 등록 종료!!");
					} else {
						System.out.print("계속 입력하려면 아무키나 누르세요(종료:n)> ");
						if (scan.next().equals("n")) {
							i = MAX_SIZE;	//break;
							System.out.println("=> 등록 완료!!");
						}
					}
				}
				
			} else if (menu == 2 ) {
				System.out.println("출력");
				if (menuCount != 0) {	//nameList[0] != null 도 가능하다
					System.out.println("-------------------------------------------------");
					System.out.println("메뉴명\t이모지\t가격");
					System.out.println("-------------------------------------------------");
				
				for (int i = 0; i < nameList.length; i++) {
					//이름이 null이 아닌 경우에만 출력
					if(nameList[i] != null) {
					System.out.print(nameList[i]+"\t");
					System.out.print(emojiList[i]+"\t");
					System.out.print(priceList[i]+"\n");
					}
				}
			} else {
				System.out.println("=> 등록된 데이터가 없습니다. 등록을 진행해 주세요");
			}
					System.out.println("-------------------------------------------------");
			} else if (menu == 3 ) {
				System.out.println("검색");
				if (menuCount != 0) { //nameList[0] != null 도 가능하다
					//Step4 : 데이터 조회
					
					boolean searchFlag = true;
						while (searchFlag) {
							//조회하고 싶은 학생명 입력
							//nameList에서 입력한 학생명 검색 ---> 학생의 nameList 주소를 변수에 저장한다.
							System.out.println("메뉴명 검색> ");
							String searchName = scan.next();
							
							int searchIdx = -1;
							int countIdx = 0;
//						for (int i = 9; i< menuCount; i++){
//						  		if(searchName.equals(nameList[i]) { 
//									searchIdx = i;s
//								}
//						  }
//						   System.out.print("searchIdx : " + searchIdx); 
						for(String name : nameList) {
							if (name != null) {
								if (name.equals(searchName)) searchIdx = countIdx;
									countIdx++;
								} 
							}
						
						if (searchIdx != -1) {
							System.out.println("-------------------------------------------------");
							System.out.println("검색결과 주소 : "+searchIdx);
							System.out.println("-------------------------------------------------");
							
						
						//Step5 : 데이터 조회 결과 출력
							
							
							System.out.println("\t\t검색결과");
							System.out.println("-------------------------------------------------");
							System.out.println("메뉴명\t이모지\t가격");
							System.out.println("-------------------------------------------------");
							
							System.out.print(nameList[searchIdx]+"\t");
							System.out.print(emojiList[searchIdx]+"\t");
							System.out.print(priceList[searchIdx]+"\n");
							System.out.println("-------------------------------------------------");
						
						
							
							System.out.print("계속 입력하려면 아무키나 누르세요(종료:n)> ");
							if (scan.next().equals("n")) {
								searchFlag = false;	//break;
								System.out.println("=>검색 종료");
							} 
						} else {
							System.out.println("=> 검색한 메뉴가 존재하지 않음");
						}
						
						}//while -searchFlag
				} else {
					System.out.println("=> 등록된 데이터가 없습니다. 등록을 진행해 주세요");
				}
				
				
				
			} else if (menu == 9 ) {
				System.out.println("--프로그램 종료--");
				System.exit(0);
			} else {
				System.out.println("=>메뉴 준비중");
			}
			
		}//while
		

		System.out.println("--프로그램 종료--");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}//class
