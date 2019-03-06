package kr.co.ch04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVmain {

	public static void main(String[] args) {
		ApplicationContext ctv = new GenericXmlApplicationContext("spring-context.xml");
		TV stv = (SamsungTV) ctv.getBean("samsungTV");
		TV ltv = (LgTV) ctv.getBean("lgTV");
		
		stv.power();
		stv.chUp();
		stv.VolumeUp(); 
		stv.VolumeDown(); 
		stv.connect(); 
		stv.disconnect();
		 
		
		ltv.power();
		ltv.chUp();
		ltv.VolumeUp();
		ltv.VolumeDown();
		ltv.connect();
		ltv.disconnect();
		
	}

}
