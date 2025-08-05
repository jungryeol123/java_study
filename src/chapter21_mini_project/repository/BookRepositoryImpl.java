package chapter21_mini_project.repository;

import java.util.ArrayList;
import java.util.List;

import chapter21_mini_project.model.BookVo;
import db.DBConn;

public class BookRepositoryImpl extends DBConn 
				implements BookMarketRepositoryInterface<BookVo>{
	public int insert(BookVo cartItem) {
		return 0;
	}
	public String findId() {
		return null;
	}
	public List<BookVo> findAll(){
		return new ArrayList<BookVo>();
	}
	public BookVo find(String bid) {
		BookVo book = null;
		return book;
	}
	public int update(BookVo book) {
		return 0;
	}
	public int remove(String id) {
		return 0;
	}
	public int removeAll() {
		return 0;
	}
}