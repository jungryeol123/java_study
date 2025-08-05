package chapter21_mini_project.repository;

import java.util.List;
import com.scoremgm.model.MemberVo;

public interface BookMarketRepositoryInterface<T> {
	int insert(T entity);
	String findId();
	List<T> findAll();
	T find(String id);
	int update(T entity);
	int remove(String id);
	int removeAll();
	void close();
}