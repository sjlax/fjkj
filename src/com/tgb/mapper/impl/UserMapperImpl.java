package com.tgb.mapper.impl;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources; 
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Component;

import com.tgb.mapper.UserMapper;
import com.tgb.model.CusUser;
import com.tgb.model.User;
@Component("UserMapperImpl")
public class UserMapperImpl implements UserMapper{

	private  String resource = "/mybatis.xml";  
	public void insertUser(User user) {
		System.out.println("24654657");
		Reader reader = null;
		try {
				reader = Resources.getResourceAsReader(resource);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(reader);  
        SqlSession session = ssf.openSession();  
       
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        session.insert("UserDaoMapping.insertUser", user);  
        session.commit();  
        session.close();  
		
	}

	@Override
	public int selectTotalRecord() {
		
		return 0;
	}

	@Override
	public void insertCusUser(CusUser cusUser) {
		System.out.println("24654657");
		Reader reader = null;
		try {
				reader = Resources.getResourceAsReader(resource);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(reader);  
        SqlSession session = ssf.openSession();  
       
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 System.out.println("打印新都标书号："+cusUser.getBsid());
		 System.out.println("打印客户名:"+cusUser.getName());
        session.insert("UserDaoMapping.insertCusUser", cusUser);  
        session.commit();  
        session.close();  				
	}
}
