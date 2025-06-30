package chapter06;

import java.util.Scanner;

/*
 * 학생 한명의 국어, 영어, 수학 점수를 입력받아 출력하는 로직
 */
public class ScoreTestVer1 {

	public static void main(String[] args) {
		//
		Scanner scan = new Scanner(System.in);
		String name = null;
		double[] sList = new double[5];
		String[] sname = {"국어", "영어", "수학"};
		double total = 0.0;
		double avg = 0.0;
		
		
		System.out.println("학생명> ");
		name = scan.next();
		
		
		
		for (int i = 0; i < sList.length; i++) {
			if (i < sList.length-2) {
			System.out.println(sname[i]+"점수> ");
			sList[i] = scan.nextInt();
			total += sList[i]; 
			} else {
				sList[sList.length-2] = total;
				sList[sList.length-1] = avg = total/sname.length;
				i = sList.length; //break;
			}
		}
		
		System.out.println("학생명\t국어\t영어\t수학\t총점\t평균\t");
		System.out.print(name + "\t");
		for (double score : sList) {
			System.out.print(score+"\t");
		}
		
		
		
		
		
		

	}

}
