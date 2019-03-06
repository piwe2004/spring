package kr.co.ch02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * ��¥ : 2019/03/04
 * �̸� : ��α�
 * ���� : Ioc �ǽ��ϱ�
 * 
 * */
public class IocTest {
	public static void main(String[] args) {
		// Ioc ��������� ��
		LgTV ltv = new LgTV();
		ltv.power();
		ltv.chUp();
		ltv.chDown();
		
		// �������� ������ ���յ� ���߱�
		TV stv = new SamsungTV();
		stv.power();
		stv.chUp();
		stv.chDown();
		
		// Ioc�� ������ ��ü����
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
