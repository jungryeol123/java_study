package kbank;

public class AccountPaperVo {
	private String name;
	private int accountNo;
	private int secretNo;
	private int price;
	
	
	//생성자
	public AccountPaperVo() {}
	
	public AccountPaperVo(String name) {
		this.name = name;
	}
	
	public AccountPaperVo(int accountNo,int secretNo,int price) {
		this.accountNo = accountNo;
		this.secretNo = secretNo;
		this.price = price;
	}

	
	
	
	
	
	//getter/setter 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public int getSecretNo() {
		return secretNo;
	}

	public void setSecretNo(int secretNo) {
		this.secretNo = secretNo;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
	
	
}//class
