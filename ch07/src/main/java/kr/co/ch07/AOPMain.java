package kr.co.ch07;

/*
 * 날짜 : 2019/03/07
 * 이름 : 김민규
 * 내용 : 어노테이션 기반 AOP 실습하기 
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AOPMain {
	public static void main(String[] args) throws Exception{
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		BoardService bs = (BoardService) ctx.getBean("boardService");
		
		
		System.out.println("============================");
		bs.insert();
		System.out.println("----------------------------");
		
		System.out.println("============================");
		bs.select();
		System.out.println("----------------------------");
		
		System.out.println("============================");
		bs.update();
		System.out.println("----------------------------");
		
		System.out.println("============================");
		bs.delete();
		System.out.println("----------------------------");
	}
}
