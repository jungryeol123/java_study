package chapter06;

import java.util.Scanner;

/*
 * 학생 한명의 국어, 영어, 수학 점수를 입력받아 출력하는 로직
 */
public class ScoreTestVer1_1 {

	public static void main(String[] args) {
		//
		Scanner scan = new Scanner(System.in);
		String[] name = new String[4];
		double[] sList = new double[5];
		String[] sname = {"국어", "영어", "수학"};
		double total = 0.0;
		double avg = 0.0;
		
		
		for (int i = 0; i < name.length; i++) {
			System.out.println("학생명 :");
			name[i] = scan.next();
		}//for
		
		for (int j = 0; j < sList.length; j++) {
			if(j < sList.length-2) {
			System.out.println("점수> ");
			sList[j] = scan.nextInt();
			total += sList[j];
			
			
			} else {
				sList[sList.length-2] = total;
				sList[sList.length-1] = avg = total/sname.length;
				j = sList.length;
				
				
			} //else
		
		
		}//for
		
		System.out.println("학생명\t국어\t영어\t수학\t총점\t평균");
		
		for (String stuname : name) {
			System.out.println(stuname+"\t");
			for (double score : sList) {
				System.out.print(score+"\t");
			}
		}
		
		
		
		
		

	}//method

}//class
