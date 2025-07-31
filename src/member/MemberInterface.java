package member;

import java.util.List;

public interface MemberInterface {
	public List<MemberVo> search(String name);
	
	public MemberVo search(int memberID);
	
	public int insert(MemberVo memberVo);
	
	public int update(MemberVo memberVo);
	
	public int delete(int memberId);
	
	public List<MemberVo> listAll();
	
}
