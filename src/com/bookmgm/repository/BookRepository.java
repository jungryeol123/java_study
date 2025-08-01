package com.bookmgm.repository;

import java.util.List;
import com.bookmgm.model.Book;

public interface BookRepository {
	boolean insert(Book book);
	List<Book> findAll();
	Book find(String bid);
	void update(Book book);
	void remove(String id);
	void remove(Book book);
	int getCount();
}
