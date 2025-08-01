package com.bookmgm.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.bookmgm.model.Book;
import db.DBConn;
import db.GenericRepositoryInterface;

public class AladinBookRepository extends DBConn implements GenericRepositoryInterface<Book> {
	
	
	List<Book> library = new ArrayList<Book>();
	public AladinBookRepository() {
		System.out.println("**알라딘 도서관 생성 완료");
	}
	
	@Override
	public int insert(Book book) {
		int rows = 0;
		if(book != null) {
			String sql = """ 
					insert into book_aladin(title, author, price, bdate)
									values( ? , ? , ? , now())
					""";
			try {
				getPreparedStatement(sql);
				pstmt.setString(1, book.getTitle());
				pstmt.setString(2, book.getAuthor());
				pstmt.setInt(3, book.getPrice());
				rows = pstmt.executeUpdate();
				
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return rows;
	}
	@Override
	public List<Book> findAll() {
		List<Book> library = new ArrayList<Book>();
		String sql = """ 
				select bid, title, author, price, bdate
				from book_aladin
				""";
		try {
			getPreparedStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Book book = new Book();
				book.setBid(rs.getString(1));
				book.setTitle(rs.getString(2));
				book.setAuthor(rs.getString(3));
				book.setPrice(rs.getInt(4));
				book.setBdate(rs.getString(5));
				library.add(book);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return library; 
			
		}
	@Override
	public Book find(String bid) {
		Book book = new Book();
		String sql = """ 
				select bid, title, author,price, bdate
				from book_aladin
				where bid = ?
				""";
		try {
			getPreparedStatement(sql);
			pstmt.setString(1,bid);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				book = new Book();
				book.setBid(rs.getString(1));
				book.setTitle(rs.getString(2));
				book.setAuthor(rs.getString(3));
				book.setPrice(rs.getInt(4));
				book.setBdate(rs.getString(5));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return book;
	}
	
	@Override
	public int update(Book book) {
		int rows = 0;
		String sql = """ 
				update book_aladin
				set title = ? , author = ?, price = ?
				where bid = ?
				""";
		try {
			getPreparedStatement(sql);
			
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2,book.getAuthor());
			pstmt.setInt(3, book.getPrice());
			pstmt.setString(4,book.getBid());
			rows = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rows;
	}
	@Override
	public int remove(String bid) {
		int rows = 0;
		String sql = """ 
				delete from book_aladin
				where bid = ?
				""";
		try {
			getPreparedStatement(sql);
			pstmt.setString(1, bid);
			rows = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return rows;
	}
	
	@Override
	public int getCount() {
		int rows = 0;
		String sql = """
				select count(*) from book_aladin
				""";
		
		try {
			getPreparedStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) rows = rs.getInt(1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return rows;
	}
	
}
