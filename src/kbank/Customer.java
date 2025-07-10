package kbank;

import java.util.Scanner;

public class Customer {
	//Field
	AccountPaperVo paper;
	String accountName;
 	int[] accountPaperList = {33331234,1234,1000000};
 	Scanner scan;
	
	//Constructor
	public Customer () {
		this("홍길동");
	}
	public Customer (String accountName) {
		this.accountName = accountName;
		scan = new Scanner(System.in);
	}
	
	
	//Method
	
	//출금 정보 저장
	public void outMoney() {
		//paper = 주소값
		AccountPaperVo name = new AccountPaperVo("홍길동");
		AccountPaperVo paper = new AccountPaperVo(33331234,1234,1000000);
		System.out.println("성함 : "+ name.getName());
		System.out.println("계좌번호 : "+paper.getAccountNo());
		System.out.println("비밀번호 : "+paper.getSecretNo());
		System.out.println("출금할 금액 : "+String.format("%,d", paper.getPrice())+"원");
		
	}
	
	
	
}
