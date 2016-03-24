package com.tgb.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tgb.mapper.UserMapper;
import com.tgb.model.CusUser;
import com.tgb.model.User;
import com.tgb.service.UserService;



@Service
@Transactional  //姝ゅ涓嶅啀杩涜鍒涘缓SqlSession鍜屾彁浜や簨鍔★紝閮藉凡浜ょ敱spring鍘荤鐞嗕簡銆�
public class UserServiceImpl implements UserService {
	
	@Resource(name="UserMapperImpl")		
	public UserMapper mapper;

	public void insertUser(User user) {
		
		 mapper.insertUser(user);
	}

	@Override
	public void insertCusUser(CusUser cusUser) {
		 mapper.insertCusUser(cusUser);
		
	}

//	public List<User> findAll() {
//		List<User> findAllList = mapper.findAll();
//		return findAllList;
//	}
//
//	public User findById(int id) {
//
//		User user = mapper.findById(id);
//		
//		return user;
//	}
//
//	public void save(User user) {
//
//		mapper.save(user);
//	}
//
//	public boolean update(User user) {
//
//		return mapper.update(user);
//	}
	
	

}
