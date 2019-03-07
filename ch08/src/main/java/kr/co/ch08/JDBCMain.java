package kr.co.ch08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 *  ��¥ : 2019/03/07
 *  �̸� : ��α�
 *  ���� : ������ JDBC �ǽ��ϱ�
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
