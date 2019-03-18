package kr.co.sboard.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.sboard.vo.BoardVO;
import kr.co.sboard.vo.FileVO;

@Repository
public class BoardDao {
	
	@Inject
	private SqlSessionTemplate mybatis;
	
	public List<BoardVO> list(int start) {
		return mybatis.selectList("ns.mapper.sql_board.SELECT_LIST", start);
	}
	
	public int getTotalCount() {
		return mybatis.selectOne("ns.mapper.sql_board.SELECT_LIST_COUNT");
	}
	
	public int write(BoardVO vo) {
		mybatis.insert("ns.mapper.sql_board.INSERT_BOARD", vo);
		return vo.getSeq();
	}
		
	public void fileUpload(FileVO fvo) {
		mybatis.insert("ns.mapper.sql_board.FILE_UPLOAD", fvo);
	}
	
	public BoardVO view(int seq) {
		return mybatis.selectOne("ns.mapper.sql_board.SELECT_VIEW", seq);
	}
	
	public int boardhit(int seq) {
		return mybatis.update("ns.mapper.sql_board.BOARD_HIT", seq);
	}
	
	public int modify(int seq) {
		return mybatis.update("ns.mapper.sql_board.UPDATE_BOARD", seq);
		
	}
	
	public void delete() {}

}
