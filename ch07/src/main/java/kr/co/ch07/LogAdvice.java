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
	public void insertPointcut() {} // 내용이 없는 참조메서드
	
	@Pointcut("execution(* kr.co.ch07.BoardService.select(..))")
	public void selectPointcut() {} // 내용이 없는 참조메서드
	
	@Pointcut("execution(* kr.co.ch07.BoardService.update(..))")
	public void updatePointcut() {} // 내용이 없는 참조메서드

	@Pointcut("execution(* kr.co.ch07.BoardService.*(..))")
	public void allPointcut() {} // 내용이 없는 참조메서드
	
	
	@Before("insertPointcut()")
	public void beforeAdvice() {
		System.out.println("횡단관심 - beforeAdvice ---");
	}
	
	@After("insertPointcut()")
	public void afterAdvice() {
		System.out.println("횡단관심 - afterAdvice ---");
	}
	
	@After("selectPointcut()")
	public void afterReturnAdvice() {
		System.out.println("횡단관심 - afterReturnAdvice ---");
	}
	
	@After("allPointcut(insert)")
	public void afterThrowAdvice() {
		System.out.println("횡단관심 - afterThrowAdvice ---");
	}
	
	@Around("updatePointcut()")
	public void aroundAdvice(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("횡단관심 - aroundAdvice1 ---");
		pjp.proceed();
		System.out.println("횡단관심 - aroundAdvice2 ---");
	}
	
}
