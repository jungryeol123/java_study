package kbank;

public class BankMan {
	//Field
	Customer customer;
	String name;
	AccountPaperVo accountPaperVo;
	//Constructor
	
	
	
	//Method
	//출금 용지 작성 화면
	public void showAccountPaper() {
		
		System.out.println("성함 : ");
		
		customer.outMoney();
	}
	
	
	
	
	
	
}//class
