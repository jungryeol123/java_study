package chapter06;

import java.util.Scanner;

/*
 * 더조은 고등학교 1학년 1반 학생들의 성적관리 프로그램
 * - 학생은 홍길동, 이순신, 김유신, 강감찬, 홍길순
 * - 과목은 국어, 영어, 수학 3과목의 점수를 입력
 * - 입력받은 과목의 총점과 평균을 구함
 * - 학생명, 과목별 점수, 총점과 평균을 구함
 * - 학샐명, 과목별 점수, 총점 , 평균은 각각 1차원 배열로 생성하여 관리
 * - 출력을 위해서 각 배열의 주소를 통일시킨다
 * 
 * 프로그래밍 방식 : 구조적(Structured) 방식, 객체지향적(Object Oriented) 방식
 */
public class ScoreTestVer2 {

	public static void main(String[] args) {
		System.out.println("-------------------------------------------");
		System.out.println("\t더조은 고등학교 1-1 성적관리 프로그램");
		System.out.println("-------------------------------------------");
		
		//Step1 : 배열, 변수 선언
		
		Scanner scan = new Scanner(System.in);
		String[] nameList = new String[5];
		int[] korList = new int[5];
		int[] engList = new int[5];
		int[] mathList = new int[5];
		int[] totList = new int[5];
		int[] avgList = new int[5];
		
		//Step2 : 데이터 입력 - 실행시 외부에서 입력
		
		for (int i = 0; i < nameList.length; i++) {
			System.out.println("학생명> ");
			nameList[i] = scan.next();
			
			
			System.out.println("국어> ");
			korList[i] = scan.nextInt();
			
			System.out.println("영어> ");
			engList[i] = scan.nextInt();
			
			System.out.println("수학> ");
			mathList[i] = scan.nextInt();
						
			totList[i] = korList[i] + engList[i] + mathList[i]; //총점
			avgList[i] = totList[i]/3;							//평균
			
			
			
			
			System.out.println("계속 입력하려면 아무키나 누르세요(종료:n)> ");
			if (scan.next().equals("n")) {
				i = nameList.length;	//break;
			}
			
		
		}
		
		//Step3 : 데이터 출력
		
			System.out.println("-------------------------------------------------");
			System.out.println("학생명\t국어\t영어\t수학\t총점\t평균");
			System.out.println("-------------------------------------------------");
		
		for (int i = 0; i < nameList.length; i++) {
			//이름이 null이 아닌 경우에만 출력
			if(nameList[i] != null) {
			System.out.print(nameList[i]+"\t");
			System.out.print(korList[i]+"\t");
			System.out.print(engList[i]+"\t");
			System.out.print(mathList[i]+"\t");
			System.out.print(totList[i]+"\t");
			System.out.print(avgList[i]+"\n");
			}
			
		}
			System.out.println("-------------------------------------------------");
		
		//Step4 : 데이터 조회
			
		boolean searchFlag = true;
			while (searchFlag) {
				//조회하고 싶은 학생명 입력
				//nameList에서 입력한 학생명 검색 ---> 학생의 nameList 주소를 변수에 저장한다.
				System.out.println("학생명 검색> ");
				String searchName = scan.next();
				
				int searchIdx = -1;
				int count = 0;
				
			for(String name : nameList) {
				if (name != null) {
					if (name.equals(searchName)) searchIdx = count;
						count++;
					}
				}
				System.out.println("-------------------------------------------------");
				System.out.println("검색결과 주소 : "+searchIdx);
				System.out.println("-------------------------------------------------");
				
			
			//Step5 : 데이터 조회 결과 출력
				
				
				System.out.println("\t\t검색결과");
				System.out.println("-------------------------------------------------");
				System.out.println("학생명\t국어\t영어\t수학\t총점\t평균");
				System.out.println("-------------------------------------------------");
				
				System.out.print(nameList[searchIdx]+"\t");
				System.out.print(korList[searchIdx]+"\t");
				System.out.print(engList[searchIdx]+"\t");
				System.out.print(mathList[searchIdx]+"\t");
				System.out.print(totList[searchIdx]+"\t");
				System.out.print(avgList[searchIdx]+"\n");
				System.out.println("-------------------------------------------------");
				
				
				
				System.out.println("계속 입력하려면 아무키나 누르세요(종료:n)> ");
				if (scan.next().equals("n")) {
					searchFlag = false;	//break;
				}
			
			}//while - searchFlag : Step4, Step5 반복
				System.out.println("--프로그램 종료--");
		
		//과제 : 등록하고 싶은 인원 수를 입력 받기
		
		

	} //main

}// class
