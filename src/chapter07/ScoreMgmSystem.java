package chapter07;

import java.util.Scanner;

// 학생 3명의 점수를 입력 받는다.
// 한 명 입력 후 계속 입력 여부를 메시지로 출력 후 입력 받는다.


public class ScoreMgmSystem {
 	
	//Field
	String admin;
	Student student;
	Scanner scan = new Scanner(System.in);
	Student[] sList = new Student[10];
	int count = 0;
	
	
	
	//Constructor
	public ScoreMgmSystem(){}
		
	//Method
	/*
	 * 메뉴 선택
	 */
	
	public void showMenu() {
		System.out.println("-------------------------------------------");
		System.out.println("\t더조은 고등학교 1-1 성적관리 프로그램");
		System.out.println("-------------------------------------------");
		System.out.println("1. 학생 등록");
		System.out.println("2. 학생 리스트 출력");
		System.out.println("3. 학생 성적 검색");
		System.out.println("4. 학생 성적 수정");
		System.out.println("5. 학생 성적 삭제");
		System.out.println("9. 프로그램 종료");
		System.out.println("-------------------------------------------");
		System.out.print("메뉴선택(숫자) > ");

//		int menu = scan.nextInt();
//		choiceMenu(menu);
		
		menuCheck(scan.nextInt());
		
	}
	
	//선택한 메뉴에 따라 기능별 메소드 호출
	public void menuCheck(int menu) {
		switch (menu) { 
		case 1 :
			insert(); 
			showMenu();
			break;
		case 2 :
			showList();
			showMenu();
			break;
		case 3 : 
			search();
			showMenu();
			break;
		case 4 :
			update();
			showMenu();
			break;
		case 5 :
			remove();
			showMenu();
			break;
		case 9 :
			System.out.println("프로그램종료");
			System.exit(0);
			break;
		default : 
			System.out.println("메뉴에 있는 번호를 입력해주세요");
			showMenu();
		
		} //switch
		
	} //choice - method
	
//	System.out.println("1. 학생 등록");
//	System.out.println("2. 학생 리스트 출력");
//	System.out.println("3. 학생 성적 검색");
//	System.out.println("4. 학생 성적 수정");
//	System.out.println("5. 학생 성적 삭제");
	
	
	
	
	public void insert() {
	
			System.out.println("학생 정보를 입력하세요");
			sList[count] = new Student();
			
			System.out.print("학생명> ");
			sList[count].name = scan.next();
			
			System.out.print("국어> ");
			sList[count].kor = scan.nextInt();
			
			System.out.print("영어> ");
			sList[count].eng= scan.nextInt();
			
			System.out.print("수학> ");
			sList[count].math = scan.nextInt();
			System.out.println("=> 등록완료");
			
			count++;
			
			System.out.print("계속 등록(아무키), 종료(n)?> ");
			if (scan.next().equals("n")) {
					showMenu();
			} else {
				insert();
			}
			
			
			} //insert Method
	
	public void showList() {
		
		if(count != 0) {
		System.out.println("---------------------------------------------");
		System.out.println("학생명\t국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------------------");
		
//		int i = 0;
		
		for(Student student : sList) {
			if(student != null) {
//			if(i < count) { 
			System.out.print(student.name + "\t");
			System.out.print(student.kor + "\t");
			System.out.print(student.eng + "\t");
			System.out.print(student.math + "\t");
			System.out.print(student.getTot() + "\t");
			System.out.print(student.getAvg() + "\n");
			} else {
				break;
			}
//			i++;
		}
		
		System.out.println("---------------------------------------------");
		
		} else {
			System.out.println("=> 등록된 데이터 없음, 등록부터 진행해주세요");
		}
	} //showList - Method
	/*
	 * 학생명을 검색하여 주소를 리턴하는 메소드
	 */
	public int searchIndex(String pname) {
		System.out.println(pname+"학생명 검색> ");
		
		String searchName = scan.next();
		int searchIdx = -1;
		for (int i = 0; i < count; i++) {
			
			Student student = sList[i];
	
			if(student.name.equals(searchName)) searchIdx = i;
		}
		return searchIdx;
		
	} //Method - searchIndex
	
	
	
	public void search() {
		
		if(count != 0) {
		System.out.println("=> 학생 정보 검색");
//		System.out.println("학생명 검색> ");
//		
//		String searchName = scan.next();
		int searchIdx = searchIndex("[검색]");
//		for (int i = 0; i < count; i++) {
//			
//			Student student = sList[i];
//	
//			if(student.name.equals(searchName)) searchIdx = i;
//		}
		if (searchIdx != -1) {
			System.out.println("\t\t검색결과");
			System.out.println("-------------------------------------------------");
			System.out.println("학생명\t국어\t영어\t수학\t총점\t평균");
			System.out.println("-------------------------------------------------");		
			System.out.print(sList[searchIdx].name+"\t");
			System.out.print(sList[searchIdx].kor+"\t");
			System.out.print(sList[searchIdx].eng+"\t");
			System.out.print(sList[searchIdx].math+"\t");
			System.out.print(sList[searchIdx].getTot() +"\t");
			System.out.print(sList[searchIdx].getAvg() +"\t");
			System.out.println("-------------------------------------------------");

			System.out.println("계속 입력하려면 아무키나 누르세요(종료:n)> ");
			
		
			if (scan.next().equals("n")) {
				System.out.println("계속 입력하려면 아무키나 누르세요(종료:n)> ");
				showMenu();
				}	else {
					search();
			} 
			}else {
				System.out.println("=> 등록된 데이터 없음, 등록부터 진행해주세요");
				showMenu();
				
			}
		}
		
	} //search - Method
	
	public void update() {
		
//		String modifiedName = scan.next();
		int modiIdx = searchIndex("[수정]");
		
//		for (int i = 0; i < count; i++) {
//			if (sList[i].equals(modifiedName)) modiIdx = i;
//		}
		 if (modiIdx != -1){
			 
			String oldName = sList[modiIdx].name; //새로 생성된 객체에 학생명 복사용
			sList[modiIdx] = new Student();
			
			String[] subjectList = {"국어", "영어", "수학"};
			
			sList[modiIdx].name = oldName;
			
			System.out.print("국어> ");
			sList[modiIdx].kor = scan.nextInt();
			
			System.out.print("영어> ");
			sList[modiIdx].eng= scan.nextInt();
			
			System.out.print("수학> ");
			sList[modiIdx].math = scan.nextInt();
						
			
			
			System.out.println("=> 수정 완료!!");
			System.out.println("\t\t수정결과");
			System.out.println("-------------------------------------------------");
			System.out.println("학생명\t국어\t영어\t수학\t총점\t평균");
			System.out.println("-------------------------------------------------");		
			System.out.print(sList[modiIdx].name+"\t");
			System.out.print(sList[modiIdx].kor+"\t");
			System.out.print(sList[modiIdx].eng+"\t");
			System.out.print(sList[modiIdx].math+"\t");
			System.out.print(sList[modiIdx].getTot() +"\t");
			System.out.print(sList[modiIdx].getAvg() +"\t");
			System.out.println("-------------------------------------------------");
			System.out.println("계속 수정하려면 아무키나 누르세요(종료:n)> ");
			if (scan.next().equals("n")) {
				showMenu();
			 
			} else {
				update();				
			}
			
		} else {
			System.out.println("수정할 학생이 없습니다. 다시 진행해주세요");
			update();
		}
		
		
		
		
		
		
	} // update - Method
	
	public void remove() {
		if(count != 0) {
		
//		System.out.println("[삭제]학생명> ");
//		String deleteName = scan.next();
		int deleteIdx = searchIndex("[삭제]");
//		for(int i = 0; i < count; i++) {
//			if(sList[i].name.equals(deleteName)) deleteIdx = i;
//		}
		
		if(deleteIdx != -1) {
			for (int i = deleteIdx; i < count-1; i++) { //홍길동(0) 이순신(1) 김유신(2) -> 이순신(0) 김유신(1) 김유신(2)
				sList[i] = sList[i+1];
			}
			sList[count-1] = null;
			count--;
			System.out.println("=> 삭제 완료!!");
			System.out.print("계속 삭제하려면 아무키나 누르세요(종료:n)> ");
			if (scan.next().equals("n")) {
				showMenu();
			}  else {
				remove();
			}
		} else {
			System.out.println("삭제할 데이터가 존재X,다시 입력해주세요");
		}
		} else {
			System.out.println("=> 등록된 데이터 없음, 등록부터 진행해주세요");
		}
		
		
		
		
		
	} // remove - Method
	
}


// 자습
//package chapter07;
//
//import java.util.Scanner;
//
//// 학생 3명의 점수를 입력 받는다.
//// 한 명 입력 후 계속 입력 여부를 메시지로 출력 후 입력 받는다.
//
//
//public class ScoreMgmSystem {
// 	
//	//Field
//	String admin;
//	Scanner scan = new Scanner(System.in);
//	
//	final int MAX_SIZE = 3;
//	Student[] sList = new Student[MAX_SIZE];
//	int count = 0;
//	
//	//Constructor
//	public ScoreMgmSystem(){}
//		
//	//Method
//	
//	public void menuSelect() {
//		System.out.println("-------------------------------------------");
//		System.out.println("\t더조은 고등학교 1-1 성적관리 프로그램");
//		System.out.println("-------------------------------------------");
//		System.out.println("1. 학생 등록");
//		System.out.println("2. 학생 리스트 출력");
//		System.out.println("3. 학생 성적 검색");
//		System.out.println("4. 학생 성적 수정");
//		System.out.println("5. 학생 성적 삭제");
//		System.out.println("9. 프로그램 종료");
//		System.out.println("-------------------------------------------");
//	}
//	
//	
//	
//	public void insert() {
////	boolean insertFlag = true;	
////		while (insertFlag) {
//			
//			for (int i = count; i < sList.length; i++) {
//			
//			sList[i] = new Student();
//			
//			System.out.println("등록");
//			
//			System.out.print("학생명> ");
//			sList[i].name = scan.next();
//			
//			System.out.print("국어> ");
//			sList[i].kor = scan.nextInt();
//			
//			System.out.print("영어> ");
//			sList[i].eng= scan.nextInt();
//			
//			System.out.print("수학> ");
//			sList[i].math = scan.nextInt();
//			System.out.println("=> 등록완료");
//			
//			count++;
//			if (count != MAX_SIZE) {
//				System.out.println("다음 학생을 입력하세요.");
//			} else {
//				System.out.println("입력이 완료되었습니다.");
////				insertFlag = false;
//			}
//			}
//			
//			
//		} // while - insertFlag
////	} 
//	
//	
//	
//	
//	public void show() {
//		
//		
//		for (int i = 0; i < count; i++) {
//		System.out.println("---------------------------------------------");
//		System.out.println("학생명\t국어\t영어\t수학\t총점\t평균");
//		System.out.println("---------------------------------------------");
//		System.out.print(sList[i].name + "\t");
//		System.out.print(sList[i].kor + "\t");
//		System.out.print(sList[i].eng + "\t");
//		System.out.print(sList[i].math + "\t");
//		System.out.print(sList[i].getTot() + "\t");
//		System.out.print(sList[i].getAvg() + "\n");
//		System.out.println("---------------------------------------------");
//		}
//		
//	}
//	
//	public void update() {
//		System.out.println("수정");
//	}
//	public void remove() {
//		System.out.println("삭제");
//	}
//	public void search() {
//		System.out.println("검색");
//	}
//	
//}