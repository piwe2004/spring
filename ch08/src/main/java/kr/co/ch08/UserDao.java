package kr.co.ch08;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	public void insertUser() {
		System.out.println("insert!!!");
	}
	
	public void selectUser() {
		System.out.println("select!!!");
	}
	
	public void updateUser() {
		System.out.println("update!!!");
	}
	
	public void deleteUser() {
		System.out.println("delete!!!");
	}
	
}
