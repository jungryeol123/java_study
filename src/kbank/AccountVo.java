package kbank;

public class AccountVo {
	private String name;
	private int accountNo;
	private int secretNo;
	private int price;
	
	public AccountVo() {}
	
	public AccountVo(String name,int accountNo,int secretNo,int price) {
		this.name = name;
		this.accountNo = accountNo;
		this.secretNo = secretNo;
		this.price = price;
	}
	
}
