package kr.co.ch08;

import java.util.List;

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
		
		UserVO vo = new UserVO();
		vo.setUid("p102");
		vo.setName("������");
		vo.setHp("010-4385-1768");
		vo.setAddr("�λ�");
		vo.setPos("�븮");
		vo.setDep(102);
		
		// Insert
		//user.insertUser(vo);

		// Select
		List<UserVO> list =  user.selectUserList();
		System.out.println("----- Select User List -----");
		for (UserVO u : list) {
			System.out.println("================================");
			System.out.println("uid : " + u.getUid());
			System.out.println("uid : " + u.getName());
			System.out.println("uid : " + u.getHp());
			System.out.println("uid : " + u.getAddr());
			System.out.println("uid : " + u.getPos());
			System.out.println("uid : " + u.getDep());
			System.out.println("--------------------------------");
		}
		
		UserVO userOne = user.selectUserOne("p102");
		System.out.println("----- Select User ONE -----");
		System.out.println("uid : " + userOne.getUid());
		System.out.println("uid : " + userOne.getName());
		System.out.println("uid : " + userOne.getHp());
		System.out.println("uid : " + userOne.getAddr());
		System.out.println("uid : " + userOne.getPos());
		System.out.println("uid : " + userOne.getDep());
		System.out.println("--------------------------------");
			
		// Update
		user.updateUser();
			
		// Delete
		user.deleteUser();
		
	}

}
