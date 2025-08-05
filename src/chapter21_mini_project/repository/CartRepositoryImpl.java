package chapter21_mini_project.repository;

import java.util.ArrayList;
import java.util.List;

import chapter21_mini_project.model.CartVo;
import db.DBConn;

public class CartRepositoryImpl extends DBConn 
				implements BookMarketRepositoryInterface<CartVo>{
	
	public int insert(CartVo cartItem) {
		return 0;
	}
	public String findId() {
		return null;
	}
	public List<CartVo> findAll(){
		return new ArrayList<CartVo>();
	}
	public CartVo find(String cid) {
		return new CartVo();
	}
	public int update(CartVo cartItem) {
		return 0;
	}
	public int remove(String id) {
		return 0;
	}
	public int removeAll() {
		return 0;
	}
}	