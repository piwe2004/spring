package kr.co.mins.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.mins.vo.NoticeVO;

@Repository
public class BoardDao {

	@Inject
	private SqlSessionTemplate mybatis;
	
	public List<NoticeVO> nt_list() {
		return mybatis.selectList("ns.mapper.sql_board.SELECT_NOTICE");
	}
	
	public int nt_write(NoticeVO vo) {
		mybatis.insert("ns.mapper.sql_board.INSERT_NOTICE", vo);
		return vo.getSeq();
	}
	
}
