package chapter06;

import java.util.Scanner;

/*
 * scoreTestVer3의 점수 저장을 2차원 배열 구조로 수정함
 */
public class ScoreTestVer4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		boolean menuFlag = true;
		
		System.out.println("-------------------------------------------");
		System.out.println("\t더조은 고등학교 1-1 성적관리 프로그램");
		System.out.println("-------------------------------------------");
		
		System.out.print("학생 수 입력> ");
		final int MAX_SIZE = scan.nextInt();
		
		String[] nameList = new String[MAX_SIZE];
		int[][] scoreList = new int[MAX_SIZE][];
		
		int count = 0; //등록된 학생수 저장
		
		
		while (menuFlag) {
			
			System.out.println("-------------------------------------------");
			System.out.println("\t더조은 고등학교 1-1 성적관리 프로그램");
			System.out.println("-------------------------------------------");
			System.out.println("1. 학생 등록");
			System.out.println("2. 학생 리스트 출력");
			System.out.println("3. 학생 성적 검색");
			System.out.println("9. 프로그램 종료");
			System.out.println("-------------------------------------------");
			
			System.out.print("메뉴 선택(숫자)> ");
			menu = scan.nextInt();
			
			if (menu == 1) { //학생 등록
				//Step2 : 데이터 입력 - 실행시 외부에서 입력
				
				for (int i = count; i < nameList.length; i++) {
					String[] subjectList = {"국어","영어","수학"};
					System.out.print("학생명> ");
					nameList[i] = scan.next();
					
					//학생의 점수를 입력하 배열을 생성함
					scoreList[i] = new int[5];
					int tot = 0;
					int avg = 0;
					
					for (int j = 0; j < subjectList.length;j++) {
						System.out.print(subjectList[j]+"> ");
						scoreList[i][j] = scan.nextInt();
						tot += scoreList[i][j];
						avg = tot/3;
					}
								
					scoreList[i][scoreList[i].length-2] = tot;				//총점
					scoreList[i][scoreList[i].length-1] = avg;				//평균
					
					count++;
					
					
					System.out.print("계속 입력하려면 아무키나 누르세요(종료:n)> ");
					if (scan.next().equals("n")) {
						i = nameList.length;	//break;
						System.out.println("=> 등록 완료!!");
					}
				}
				
			} else if (menu == 2) { //학생 리스트 출력
				//Step3 : 데이터 출력
			if (count != 0) {	//nameList[0] != null 도 가능하다
					System.out.println("-------------------------------------------------");
					System.out.println("학생명\t국어\t영어\t수학\t총점\t평균");
					System.out.println("-------------------------------------------------");
				
				for (int i = 0; i < count; i++) {
					//이름이 null이 아닌 경우에만 출력
					System.out.print(nameList[i]+"\t");
					for (int j = 0; j < scoreList[i].length; j++) {
						System.out.print(scoreList[i][j]+"\t");
					}
					System.out.println();
					
				}
				
			} else {
				System.out.println("=> 등록된 데이터가 없습니다. 등록을 진행해 주세요");
			}
					System.out.println("-------------------------------------------------");
				
			} else if (menu == 3) {	//학생 성적 검색
				if (count != 0) { //nameList[0] != null 도 가능하다
					//Step4 : 데이터 조회
					
					boolean searchFlag = true;
						while (searchFlag) {
							//조회하고 싶은 학생명 입력
							//nameList에서 입력한 학생명 검색 ---> 학생의 nameList 주소를 변수에 저장한다.
							System.out.println("학생명 검색> ");
							String searchName = scan.next();
							
							int searchIdx = -1;
							int countIdx = 0;
							
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
							System.out.println("학생명\t국어\t영어\t수학\t총점\t평균");
							System.out.println("-------------------------------------------------");		
							System.out.print(nameList[searchIdx]+"\t");
							
							for (int score : scoreList[searchIdx]) {
								System.out.print(score+"\t");
							}
							System.out.println("-------------------------------------------------");
						
						
							
							System.out.println("계속 입력하려면 아무키나 누르세요(종료:n)> ");
							if (scan.next().equals("n")) {
								searchFlag = false;	//break;
							} 
						} else {
							System.out.println("=> 검색한 학생이 존재하지 않음\n");
							System.out.println("계속 입력하려면 아무키나 누르세요(종료:n)> ");
							if (scan.next().equals("n")) {
								searchFlag = false;	//break;
							}
						}
						
						}//while -searchFlag
				} else {
					System.out.println("=> 등록된 데이터가 없습니다. 등록을 진행해 주세요");
				}
				
			} else if (menu == 9) { //프로그램 종료
				System.out.println("--프로그램 종료--");
				System.exit(0);
			} else {
				System.out.println("메뉴 준비중입니다.");
			}
			
//			System.out.print("계속 진행하려면 아무키나 누르세요(종료:n)> ");
//			if (scan.next().equals("n")) {
//				menuFlag = false;	//break;
//			}
			
		}//while 
		
		System.out.println("--프로그램 종료--");
		
		
		
		
		
		
		
	
	
	
	
	} //main

}//class
