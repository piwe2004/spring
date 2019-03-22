package kr.co.mins.serviceImpl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.mins.dao.BoardDao;
import kr.co.mins.service.BoardService;
import kr.co.mins.vo.NoticeVO;

@Service
public class BoardServiceImpl implements BoardService{

	@Inject
	private BoardDao dao;
	
	@Override
	public String portfolio() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NoticeVO> nt_list(int start) {
		return dao.nt_list(start);
	}
	
	@Override
	public int getTotalCount() {
		return dao.getTotalCount();
	}

	@Override
	public int getPageEnd(int total) {
		int pageEnd = 0;
		if(total %)
	}

	@Override
	public int getLimitStart(String pg) {
		return 0;
	}

	@Override
	public int getPageCountStart(int total, int limit) {
		return 0;
	}

	@Override
	public int[] getPageGroupStartEnd(String pg, int pageEnd) {
		return null;
	}

	@Override
	public int nt_write(NoticeVO vo) {
		return dao.nt_write(vo);
	}

	@Override
	public String view() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String modify() {
		// TODO Auto-generated method stub
		return null;
	}

}
