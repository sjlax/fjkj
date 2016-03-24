package com.tgb.mapper;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.tgb.model.CusUser;
import com.tgb.model.User;
public interface UserMapper {

//	void save(User user);
//	boolean update(User user);
//	boolean delete(int id);
//	User findById(int id);
//	List<User> findAll();
	

	public void insertUser(User user);
	public int selectTotalRecord();
	public void insertCusUser(CusUser cusUser);
}
