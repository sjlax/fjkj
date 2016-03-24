package com.tgb.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tgb.model.CusUser;
import com.tgb.model.User;
import com.tgb.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	Logger log = Logger.getLogger(UserController.class);
	/**
	 * 鑾峰彇鎵�湁鐢ㄦ埛鍒楄〃
	 * @param request
	 * @return
	 */
	@RequestMapping("/getAllUser")
	public String getAllUser(HttpServletRequest request){
		
		//List<User> findAll = userService.findAll();
		
		//request.setAttribute("userList", findAll);
		return "/addCus";
	}
//	
//	/**
//	 * 璺宠浆鍒版坊鍔犵敤鎴风晫闈�
//	 * @param request
//	 * @return
//	 */
//	@RequestMapping("/toAddUser")
//	public String toAddUser(HttpServletRequest request){
//		
//		return "/addUser";
//	}
	/**
	 * 娣诲姞鐢ㄦ埛骞堕噸瀹氬悜
	 * @param user
	 * @param request
	 * @return
	 */
	@RequestMapping("/addUser")
	public String addUser(User user,HttpServletRequest request){
//		user.setColumn1(3838);
//		user.setColumn2(3838);
//		user.setColumn3(3838);
//		user.setColumnn(3838);
		
		userService.insertUser(user);
		System.out.println("插入成功了么");
		//user = (User) request.getAttributeNames();
		System.out.println(user.getColumn1());
		//return "redirect:/user/getAllUser";
		return "addUser";
		
	}
	
	@RequestMapping("/addCusUser")
	public String addCusUser(CusUser cusUser,HttpServletRequest request){
//		cusUser.setBuid((Integer) request.getAttribute("bshid"));
//		cusUser.setName((String) request.getAttribute("cusname"));
//		cusUser.setId((Integer) request.getAttribute("cusid"));
//		cusUser.setPassword((Integer) request.getAttribute("password"));
		
		userService.insertCusUser(cusUser);
		
//		System.out.println("id="+cusUser.getId()+"bsid="+cusUser.getBsid()
//				+"name="+cusUser.getName()+"password="+cusUser.getPassword());
//		System.out.println("========");
		//return "redirect:/user/getAllUser";
		//return "addCus";
		log.info("******========*********");
		log.error("&&&&&&&&&");
		return "redirect:/user/addUser";
		
	}
	/**
	 *缂栬緫鐢ㄦ埛
	 * @param user
	 * @param request
	 * @return
	 */
//	@RequestMapping("/updateUser")
//	public String updateUser(User user,HttpServletRequest request){
//		
//		
//		if(userService.update(user)){
//			user = userService.findById(user.getColumn1());
//			request.setAttribute("user", user);
//			return "redirect:/user/getAllUser";
//		}else{
//			return "/error";
//		}
//	}
//	/**
//	 * 鏍规嵁id鏌ヨ鍗曚釜鐢ㄦ埛
//	 * @param id
//	 * @param request
//	 * @return
//	 */
//	@RequestMapping("/getUser")
//	public String getUser(int id,HttpServletRequest request){
//		
//		request.setAttribute("user", userService.findById(id));
//		return "/editUser";
//	}
	/**
	 * 鍒犻櫎鐢ㄦ埛
	 * @param id
	 * @param request
	 * @param response
	 */
//	@RequestMapping("/delUser")
//	public void delUser(int id,HttpServletRequest request,HttpServletResponse response){
//		String result = "{\"result\":\"error\"}";
//		
//		if(userService.delete(id)){
//			result = "{\"result\":\"success\"}";
//		}
//		
//		response.setContentType("application/json");
//		
//		try {
//			PrintWriter out = response.getWriter();
//			out.write(result);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//	}
}
