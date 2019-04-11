package kr.co.mins.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.mins.vo.FileVO;
import kr.co.mins.vo.BoardVO;

@Repository
public class BoardDao {

	@Inject
	private SqlSessionTemplate mybatis;
	
	public List<BoardVO> list(int start, String cate) {
		
		Map map = new HashMap<>();
		map.put("cate", cate);
		map.put("start", start);
		return mybatis.selectList("ns.mapper.sql_board.SELECT_NOTICE", map);
	}
	
	public void fileUpload(FileVO fvo) {
		mybatis.insert("ns.mapper.sql_board.FILE_UPLOAD", fvo);
	}
	
	public int getTotalCount( String cate) {
		return mybatis.selectOne("ns.mapper.sql_board.SELECT_LIST_COUNT", cate);
	}
	
	public int writeResult(BoardVO vo) {
		mybatis.insert("ns.mapper.sql_board.INSERT_NOTICE", vo);
		return vo.getSeq();
	}
	
	public BoardVO view (int seq, String cate) {
		Map map = new HashMap<>();
		map.put("cate", cate);
		map.put("seq", seq);
		return mybatis.selectOne("ns.mapper.sql_board.SELECT_VIEW", map);
	}
	
	public int boardhit(int seq, String cate) {
		Map map = new HashMap<>();
		map.put("cate", cate);
		map.put("seq", seq);
		return mybatis.update("ns.mapper.sql_board.BOARD_HIT", map);
	}
	
	public BoardVO preview(int seq, String cate) {
		Map map = new HashMap<>();
		map.put("cate", cate);
		map.put("seq", seq);
		return mybatis.selectOne("ns.mapper.sql_board.PRE_VIEW", map);
	}
	public BoardVO nextview(int seq, String cate) {
		Map map = new HashMap<>();
		map.put("cate", cate);
		map.put("seq", seq);
		return mybatis.selectOne("ns.mapper.sql_board.NEXT_VIEW", map);
	}
	public FileVO view_file(int seq, String cate) {
		Map map = new HashMap<>();
		map.put("cate", cate);
		map.put("seq", seq);
		return mybatis.selectOne("ns.mapper.sql_board.VIEW_FILE", map);
	}
}
