package kr.co.ch08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 *  날짜 : 2019/03/07
 *  이름 : 김민규
 *  내용 : 스프링 JDBC 실습하기
 * 
 */

public class JDBCMain {

	public static void main(String[] args) throws Exception {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		UserService user = (UserService) ctx.getBean("userServiceImpl");
		
		// Insert
		user.insertUser();

		// Select
		user.selectUser();
			
		// Update
		user.updateUser();
			
		// Delete
		user.deleteUser();
		
	}

}
