package kr.co.mins;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.mins.dao.BoardDao;
import kr.co.mins.vo.NoticeVO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring-test-context.xml"})
public class BoardDaoTest {

	@Inject
	private BoardDao dao;
	
	@Test
	public void writeTest() {		
		NoticeVO vo = new NoticeVO();
		
		vo.setTitle("제목 테스트입니다.");
		vo.setContent("내용");
		vo.setUserid("abcd1122");
		vo.setRegip("129.1.1.1");
		
		int seq = dao.nt_write(vo);
		
		System.out.println("write 테스트 완료!!!" + seq);
	}
	

	
	
}
