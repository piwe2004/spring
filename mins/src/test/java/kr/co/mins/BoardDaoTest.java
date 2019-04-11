package kr.co.mins;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.mins.dao.BoardDao;
import kr.co.mins.vo.BoardVO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring-test-context.xml"})
public class BoardDaoTest {

	@Inject
	private BoardDao dao;
	
	@Test
	public void writeTest() {		
		BoardVO vo = new BoardVO();
		
		vo.setTitle("제목 테스트입니다.");
		vo.setContent("내용");
		vo.setUserid("abcd1122");
		vo.setRegip("129.1.1.1");
		
		dao.writeResult(vo);
		
		System.out.println("write 테스트 완료!!!" + vo);
	}
	
	
	public void list() {
		dao.list(1, "notice");
	}
	

	
	
}
