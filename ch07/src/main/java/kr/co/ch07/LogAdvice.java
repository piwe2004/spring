package kr.co.ch07;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAdvice {
	
	@Pointcut("execution(* kr.co.ch07.BoardService.insert(..))")
	public void insertPointcut() {} // ������ ���� �����޼���
	
	@Pointcut("execution(* kr.co.ch07.BoardService.select(..))")
	public void selectPointcut() {} // ������ ���� �����޼���
	
	@Pointcut("execution(* kr.co.ch07.BoardService.update(..))")
	public void updatePointcut() {} // ������ ���� �����޼���

	@Pointcut("execution(* kr.co.ch07.BoardService.*(..))")
	public void allPointcut() {} // ������ ���� �����޼���
	
	
	@Before("insertPointcut()")
	public void beforeAdvice() {
		System.out.println("Ⱦ�ܰ��� - beforeAdvice ---");
	}
	
	@After("insertPointcut()")
	public void afterAdvice() {
		System.out.println("Ⱦ�ܰ��� - afterAdvice ---");
	}
	
	@After("selectPointcut()")
	public void afterReturnAdvice() {
		System.out.println("Ⱦ�ܰ��� - afterReturnAdvice ---");
	}
	
	@After("allPointcut(insert)")
	public void afterThrowAdvice() {
		System.out.println("Ⱦ�ܰ��� - afterThrowAdvice ---");
	}
	
	@Around("updatePointcut()")
	public void aroundAdvice(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("Ⱦ�ܰ��� - aroundAdvice1 ---");
		pjp.proceed();
		System.out.println("Ⱦ�ܰ��� - aroundAdvice2 ---");
	}
	
}
