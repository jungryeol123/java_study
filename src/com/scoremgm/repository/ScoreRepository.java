package com.scoremgm.repository;

import java.util.List;

import com.scoremgm.model.Member;

public interface ScoreRepository {
	
	Member find(String no);
	boolean insert(Member member);
	int getCount();
	List<Member> findAll();
	void update(Member member);
	void remove(String no);
	
	
	
	
	
	
	
	
	
}//class
