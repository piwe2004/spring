package kr.co.ch06;
/*
 *  ��¥ : 2019/03/06
 * 	�̸� : ��α�
 * 	���� : Advice �������� �ǽ��ϱ� 
 * 
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.ch06.service.BoardService;

public class AOPMain {
	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		BoardService bs = (BoardService) ctx.getBean("boardService");
		
		System.out.println("==================================");
		bs.insert();
		System.out.println("----------------------------------");
		
		System.out.println("==================================");
		bs.select();
		System.out.println("----------------------------------");
		
		System.out.println("==================================");
		bs.update();
		System.out.println("----------------------------------");
		
		System.out.println("==================================");
		bs.delete();
		System.out.println("----------------------------------");
		
	}
}
