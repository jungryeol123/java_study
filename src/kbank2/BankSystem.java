package kbank2;

public class BankSystem {
	AccountVo[] accountList;
	String name;
	
	
	
	public BankSystem(String name) {
		this.name = name;
		accountList = createAccountList();	//은행 고객 리스트 accountList 생성
		
	}
	
	/**
	 * 은행 직원이 관리하는 고객 리스트 생성
	 * @return
	 */
	public AccountVo[] createAccountList() {
		String[] names = {"홍길동","이순신","김유신"};
		String[] numbers = {"kb-1234","kb-9876","kb-3456"};
		String[] password = {"1234","9876","3456"};
		int[] balance = {500,1000,700};
 		AccountVo[] list = new AccountVo[names.length];
		
 		for(int i = 0; i < names.length; i++) {
 			AccountVo account = new AccountVo();
 			account.setName(names[i]);
 			account.setAccountNumber(numbers[i]);
 			account.setPassword(password[i]);
 			account.setBalance(balance[i]);
 			
 			list[i] = account;
 		}
 		return list;
	}
	public void confirmBalance(AccountPaperVo accountPaper) {
		
	}
	
	
	/**
	 * 계정 검색
	 */
	public int searchAccount(AccountPaperVo accountPaper) {
		int resultIdx = -1;
		for(int i = 0; i < accountList.length; i++) {
			AccountVo account = accountList[i];
			if( account.getAccountNumber().equals(accountPaper.getAccountNumber()) && account.getPassword().equals(accountPaper.getPassword())) {
			resultIdx = i;
			System.out.println(resultIdx);
			break;
			}
		}
		if(resultIdx != -1) {
			System.out.println("==================================================");
				
				System.out.print(accountList[resultIdx].getName() +"\t");
				System.out.print(accountList[resultIdx].getAccountNumber()+"\t ");
				System.out.print(accountList[resultIdx].getPassword()+"\t");
				System.out.print(accountList[resultIdx].getBalance()+"\n");
			
			System.out.println("==================================================");
		} else {
			System.out.println("[BankSyetem] 일치하는 고객정보가 없습니다.");
		}
		
		return resultIdx;
	}
	
	
	
	/**
	 * 은행직원이 관리하는 고객 리스트 출력
	 */
	public void showAccountList() {
		System.out.println("==================================================");
		System.out.println("\t\t" +name+ " 고객 리스트");
		System.out.println("==================================================");
		for(int i = 0; i < accountList.length; i++) {
			AccountVo account = accountList[i];
			System.out.print((i+1)+".\t");
			System.out.print(account.getName() +"\t");
			System.out.print(account.getAccountNumber()+"\t ");
			System.out.print(account.getPassword()+"\t");
			System.out.print(account.getBalance()+"\n");
		}
		System.out.println("==================================================");
	}
	
	
}
