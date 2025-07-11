package kbank2;


public class KBBankTest {

	public static void main(String[] args) {
		
		BankSystem kbsystem = new BankSystem("KB은행");
		kbsystem.showAccountList(); //은행시스템 화인
		//입출금용지 비치됨
		AccountPaperVo accountPaper = AccountPaperVo.getInstance(); //싱글톤
		
		BankMan staffPark = new BankMan("박보검",kbsystem); //은행직원 생성시 고객리스트 정보 가짐
		
//		staffPark.getKbsystem.showAccountList();  //은행직원 -> 고객 정보 리스트 출력
	
		Customer hong = new Customer("홍길동","Kb-1234",null,0);
		boolean validateFlag = true;
		hong.setAccountPaper(accountPaper);
		
		//은행직원이 고객의 용지를 받는다.
		staffPark.setAccountPaper(hong.getAccountPaper());
		staffPark.validataCheck();			//고객에게 전달받은 출금용지에 빈값이 있는지 체크
//		hong.answer(staffPark.checkResult);
//		AccountPaperVo.showInfo();
		while (validateFlag) {
			if (staffPark.validataCheck(hong.answer(staffPark.checkResult))) {
				validateFlag = false;
			}
		}
		staffPark.processWithdrawal();
		
		//ATM(은행시스템)을 이용하여 잔액을 확인
//		kbsystem.confirmBalance(hong.getAccountPaper());
		
	}
}
