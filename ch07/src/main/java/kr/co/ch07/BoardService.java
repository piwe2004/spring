package kr.co.ch07;

import org.springframework.stereotype.Component;

@Component
public class BoardService {
	
	public void insert() throws Exception {
		System.out.println("�ٽ� ���� insert ---");
	}

	public void select() throws Exception {
		System.out.println("�ٽ� ���� select ---");
	}
	
	public void update() throws Exception {
		System.out.println("�ٽ� ���� update ---");
	}
	
	public void delete() throws Exception {
		System.out.println("�ٽ� ���� delete ---");
		
		String str = null;
		str.toString();
	}
}
