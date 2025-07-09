package vending_machine_ver1_1;

import java.util.Scanner;

public class User {
	//이름, 입력을 위한 스캐너 객체
	String name;
	Scanner scan;
	
	//Constructor
	
	public User() {
		this("홍길동");
	}
	public User(String name) {
		scan = new Scanner(System.in);
		this.name = name;
		}
	
	public String getName() {return name;}
	public Scanner getScan() {return scan;}
	
	
	//Method
	
	//동전 입력 메소드
	public int insertCoin() {
		int resultCoin = 0;
		System.out.print("["+name + "] 동전 투입> ");
		if(scan.hasNextInt()) {
			int coin = scan.nextInt();
			resultCoin = coin; 
		} else {
			System.out.println("100원 or 500원만 입력해주세요");
			scan.next();
			insertCoin();
		}
		return resultCoin;
	}
	
	
	
	//메뉴 선택 메소드 
	public int selectCoin() {
		int menu = 0;
		System.out.print("["+name+"] 메뉴선택> ");
		if(scan.hasNextInt()) {
			menu = scan.nextInt();
		} else {
			System.out.println("잘못 입력하셨습니다.다시 입력해주세요");
			scan.next();
			selectCoin();
		}
		return menu;
	}
	
	
	
	
	
	
	
} //class
