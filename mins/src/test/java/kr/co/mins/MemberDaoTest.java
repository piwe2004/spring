package kr.co.mins;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.mins.dao.MemberDao;
import kr.co.mins.vo.MemberVO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-test-context.xml"})
public class MemberDaoTest {
	
	@Inject
	private MemberDao dao;
	
	@Test
	public void loginTest() {
		MemberVO vo = new MemberVO();
		vo.setUserid("pwie2004");
		vo.setPass("als.30629");
		
		MemberVO user = dao.login(vo);
		System.out.println("테스트결과 : " + user);
	}
	
}
