package chapter21_mini_project.service;

import chapter21_mini_project.app.BookMarketSystem;
import chapter21_mini_project.model.BookVo;
import chapter21_mini_project.model.CartVo;
import chapter21_mini_project.model.MemberVo;
import chapter21_mini_project.repository.BookMarketRepositoryInterface;
import chapter21_mini_project.repository.BookRepositoryImpl;
import chapter21_mini_project.repository.CartRepositoryImpl;
import chapter21_mini_project.repository.MemberRepositoryImpl;

public class BookMarketServiceImpl implements BookMarketService{
	BookMarketSystem bms;
	BookMarketRepositoryInterface<MemberVo> memberRepository;
	BookMarketRepositoryInterface<CartVo> cartRepository;
	BookMarketRepositoryInterface<BookVo> booksRepository;
	String mid;
	
	public BookMarketServiceImpl(BookMarketSystem bms) {
		this.bms = bms;
		memberRepository = new MemberRepositoryImpl();
		cartRepository = new CartRepositoryImpl();
		booksRepository = new BookRepositoryImpl();
	}
	
	@Override
	public void menuMemberAdd() {
		MemberVo member = new MemberVo();
		System.out.print("회원명>");
		member.setName(bms.scan.next());
		
		System.out.print("주소>");
		bms.scan.nextLine();  //nextLine() : 띄어쓰기 필요한 문장 입력시, \n을 포함
		member.setAddress(bms.scan.nextLine()); 
		
		System.out.print("연락처>");
		member.setPhone(bms.scan.nextLine());
		
		memberRepository.insert(member);
		this.mid = memberRepository.findId();  //방금전 회원등록한 회원의 mid 가져오기!!
	}
	
	@Override
	public void menuMemberInfo() {
		MemberVo member = memberRepository.find(mid);
		if(member != null) {
			System.out.println("---------------------------------------------------------------------");
				System.out.print(member.getMid() +"\t");
				System.out.print(member.getName() +"\t");
				System.out.print(member.getAddress() +"\t");
				System.out.print(member.getPhone() +"\t\t");
				System.out.print(member.getMdate() +"\n");				
			System.out.println("---------------------------------------------------------------------");
		} else {
			System.out.println("🚫 등록된 회원이 존재하지 않습니다.");
		}
		bms.selectMenu();
	}
	
	@Override
	public void menuCartList() {
		
		bms.selectMenu();
	}
	
	@Override
	public void menuCartClear() {
		bms.selectMenu();
	}
	
	@Override
	public void menuCartAddItem() {
		bms.selectMenu();
	}
	
	@Override
	public void menuCartRemoveItem() {
		bms.selectMenu();
	}
	
	@Override
	public void menuCartBill() {
		bms.selectMenu();
	}
	
	@Override
	public void exit() {
		System.out.println("-- 북마켓을 종료합니다 --");
		memberRepository.close();
		cartRepository.close();
		booksRepository.close();
		System.exit(0);
	}
}