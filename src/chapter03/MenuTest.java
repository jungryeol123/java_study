package chapter03;

import java.util.Scanner;

public class MenuTest {
	public static void main(String[] args) {
		
		System.out.println("***************************************************\n\n\t\tWelcome to Shopping Mall\n\t\tWelcome to Food Market\n***************************************************");
		System.out.println("\n\t1.상품보기\t2.상품구입\n\t3.영수증보기\t4.종료\n***************************************************");
		
		System.out.print("메뉴를 선택해주세요(숫자) > ");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		//선택 메뉴 체크 확인
		System.out.println("선택한 메뉴 : "+num);
	}
}
