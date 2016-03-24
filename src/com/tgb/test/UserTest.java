package com.tgb.test;


import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tgb.mapper.UserMapper;
import com.tgb.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/config/spring-common.xml")
public class UserTest {
	@Resource(name = "UserMapperImpl")
	private UserMapper mapper;

	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void tt(){
		User user = new User();
		mapper.insertUser(user);	
	}
	
	public void testAdd(){
		User user = new User();
		user.setColumn1(1);
		user.setColumn2(1);
		user.setColumn3(1);
		user.setColumnn(1);
		
		userMapper.insertUser(user);
		System.out.println("添加数据成功");
		
	}
	
	
//	public void testFindAll(){
//		List<User> findAllList = userMapper.findAll();
//		System.out.println(findAllList.size());
//	}
//	
//	
//	public void testFindById(){
//		User user = userMapper.findById(2);
//		System.out.println(user.getColumn1());
//		System.out.println(user.getColumn1());
//	}
//
//
//	
//	public void testUpdate(){
//		
//		User user = new User();
//		userMapper.update(user);
//	}
//	
//
//	public void testDelete(){
//		userMapper.delete(1);
//	}
}
