package kr.co.ch02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 날짜 : 2019/03/04
 * 이름 : 김민규
 * 내용 : Ioc 실습하기
 * 
 * */
public class IocTest {
	public static void main(String[] args) {
		// Ioc 적용안햇을 때
		LgTV ltv = new LgTV();
		ltv.power();
		ltv.chUp();
		ltv.chDown();
		
		// 다형성을 적용한 결합도 낮추기
		TV stv = new SamsungTV();
		stv.power();
		stv.chUp();
		stv.chDown();
		
		// Ioc를 적용한 격체주입
		ApplicationContext ctx = new GenericXmlApplicationContext("Spring-context.xml");
		SamsungTV getStv = (SamsungTV) ctx.getBean("stv");
		LgTV getLtv = (LgTV) ctx.getBean("ltv");
		
		getStv.power();
		getStv.chUp();
		getStv.chDown();
		
		getLtv.power();
		getLtv.chUp();
		getLtv.chDown();
		
	}
}
