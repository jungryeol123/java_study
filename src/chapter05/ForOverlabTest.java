package chapter05;

import java.util.Scanner;

public class ForOverlabTest {
	public static void main(String[] args) {
		//2단~5단 출력
		Scanner scan = new Scanner(System.in);
		
		
		int start = 0, end = 0;
		boolean flag = true;
		
		
		System.out.println("프로그램종료 : start, end 모두 0 입력");
		
		
		while(flag) {
		
		System.out.print("start : ");
		start = scan.nextInt();
		System.out.print("end : ");
		end = scan.nextInt();
		
		//실행여부 체크
		if (start != 0 && end != 0) {
			
		//while 블록을 빠져 나간 후 종료
		for (int i = 1; i <= 9; i++) {

			for (int j = start ; j <= end; j++) {
				System.out.print(j+" * "+i+" = "+(j*i)+"\t");
			}
			System.out.println("\n");
		}
		System.out.println("프로그램종료 : start, end 모두 0 입력");
		
		}	else {
			flag = false;
			}
		} //while
		
		System.out.println("-프로그램종료-");
		System.exit(0);
		
		
		
		
		
		
		
		
	}
}
