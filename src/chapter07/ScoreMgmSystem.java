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
//	Student student;
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
//	public void insert() {
//	boolean insertFlag = true;	
//		while (insertFlag) {
//			
//			for (int i = count; i < sList.length; i++) {
//			
//			System.out.println("등록");
//			student = new Student();
//			
//			System.out.print("학생명> ");
//			student.name = scan.next();
//			
//			System.out.print("국어> ");
//			student.kor = scan.nextInt();
//			
//			System.out.print("영어> ");
//			student.eng= scan.nextInt();
//			
//			System.out.print("수학> ");
//			student.math = scan.nextInt();
//			System.out.println("=> 등록완료");
//			
//			count++;
//			if (count != MAX_SIZE) {
//				System.out.println("다음 학생을 입력하세요.");
//			} else {
//				System.out.println("입력이 완료되었습니다.");
//				insertFlag = false;
//			}
//			}
//			
//			
//		} // while - insertFlag
//	} 
//	
//	
//	
//	
//	public void show() {
//		System.out.println("---------------------------------------------");
//		System.out.println("학생명\t국어\t영어\t수학\t총점\t평균");
//		System.out.println("---------------------------------------------");
//		System.out.print(student.name + "\t");
//		System.out.print(student.kor + "\t");
//		System.out.print(student.eng + "\t");
//		System.out.print(student.math + "\t");
//		System.out.print(student.getTot() + "\t");
//		System.out.print(student.getAvg() + "\n");
//		System.out.println("---------------------------------------------");
//		
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



package chapter07;

import java.util.Scanner;

// 학생 3명의 점수를 입력 받는다.
// 한 명 입력 후 계속 입력 여부를 메시지로 출력 후 입력 받는다.


public class ScoreMgmSystem {
 	
	//Field
	String admin;
	Scanner scan = new Scanner(System.in);
	
	final int MAX_SIZE = 3;
	Student[] sList = new Student[MAX_SIZE];
	int count = 0;
	
	//Constructor
	public ScoreMgmSystem(){}
		
	//Method
	public void insert() {
	boolean insertFlag = true;	
		while (insertFlag) {
			
			for (int i = count; i < sList.length; i++) {
			
			sList[i] = new Student();
			
			System.out.println("등록");
			
			System.out.print("학생명> ");
			sList[i].name = scan.next();
			
			System.out.print("국어> ");
			sList[i].kor = scan.nextInt();
			
			System.out.print("영어> ");
			sList[i].eng= scan.nextInt();
			
			System.out.print("수학> ");
			sList[i].math = scan.nextInt();
			System.out.println("=> 등록완료");
			
			count++;
			if (count != MAX_SIZE) {
				System.out.println("다음 학생을 입력하세요.");
			} else {
				System.out.println("입력이 완료되었습니다.");
				insertFlag = false;
			}
			}
			
			
		} // while - insertFlag
	} 
	
	
	
	
	public void show() {
		
		
		for (int i = 0; i < count; i++) {
		System.out.println("---------------------------------------------");
		System.out.println("학생명\t국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------------------");
		System.out.print(sList[i].name + "\t");
		System.out.print(sList[i].kor + "\t");
		System.out.print(sList[i].eng + "\t");
		System.out.print(sList[i].math + "\t");
		System.out.print(sList[i].getTot() + "\t");
		System.out.print(sList[i].getAvg() + "\n");
		System.out.println("---------------------------------------------");
		}
		
	}
	
	public void update() {
		System.out.println("수정");
	}
	public void remove() {
		System.out.println("삭제");
	}
	public void search() {
		System.out.println("검색");
	}
	
}