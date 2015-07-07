package com.stock.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stock.dao.UserDAO;
import com.stock.model.User;
import com.stock.service.UserService;




public class UserTest {

private UserService userService;
	
	@Before
	public void before(){     
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
				,"classpath:conf/spring-mybatis.xml"});
		org.apache.log4j.BasicConfigurator.configure();
		userService = (UserService) context.getBean("userServiceImpl");
	}
	
	@Test
	public void addUser(){
//		User user = new User();
//		user.setNickname("wkguo");
//		user.setState(2);
		List<User> users = userService.queryAllUser();
		for(User u : users) {
			System.out.println(u);
		}
	}
}
