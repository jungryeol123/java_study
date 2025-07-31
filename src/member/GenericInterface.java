package member;

import java.util.List;

public interface GenericInterface<T> {
	public List<T> search(String name); //MemberVo member = (MemberVo)obj;
	
	public T search(int id);
	
	public int insert(T entity);
	
	public int update(T entity);
	
	public int delete(int id);
	
	public List<T> listAll();
	
}
