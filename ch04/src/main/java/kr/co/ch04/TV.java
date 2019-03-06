package kr.co.ch04;
/*
 * 날짜 : 2019/03/05
 * 이름 : 김민규
 * 내용 : IOC 실습하기
 * 
 * 이노테이션 종류
 * @Component (@Comtroller, @Service, @Repository)
 *  - 스프링 컨테이너가 해당 이노테이션 클래스를 객체관리를 위한 이노테이션
 * @Autowired
 *  - 맴버변수 해당 타입에 맞는 객체를 주입 받는 이노테이션(스프링전용)
 * @Inject
 *  - 맴버변수 해당 타입에 맞는 객체를 주입 받는 이노테이션(서버전용)
 * @Resource(name="객체아이디")
 *  - 의존성(객체)주입되는 객체가 2개 이상일때 아이디를 지정해서 한정하는 이노테이션
 */
public interface TV {
	public void power();
	public void chUp();
	public void chDown();
	public void VolumeUp();
	public void VolumeDown();
	public void connect();
	public void disconnect();
}
