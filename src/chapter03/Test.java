package chapter03;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.print("메모할 내용을 적으세요 : ");
		
		Scanner scan;
		scan = new Scanner(System.in);
		
		String memo = scan.next();
		
		System.out.print("메모 내용 : "+memo);
	}
}
