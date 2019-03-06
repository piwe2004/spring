package kr.co.ch06.advice;

import org.springframework.stereotype.Component;

@Component
public class AroundAdvice {
	
	public void around1() {
		System.out.println("È¾´Ü°ü½É - around1 ---");
	}

	public void around2() {
		System.out.println("È¾´Ü°ü½É - around2 ---");
	}
	
	public void around3() {
		System.out.println("È¾´Ü°ü½É - around3 ---");
	}
	
}
