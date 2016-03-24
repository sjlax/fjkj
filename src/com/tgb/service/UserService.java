package com.tgb.service;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.tgb.model.CusUser;
import com.tgb.model.User;


public interface UserService {
	void insertUser(User user);
	void insertCusUser(CusUser cusUser);
//	boolean update(User user);
//	boolean delete(int id);
//	User findById(int id);
//	List<User> findAll();
}
