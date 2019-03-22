package kr.co.mins.service;

import java.util.List;

import kr.co.mins.vo.NoticeVO;

public interface BoardService {

	public String portfolio();
	
	public List<NoticeVO> nt_list(int start);
	public int getTotalCount();
	public int getPageEnd(int total);
	public int getLimitStart(String pg);
	public int getPageCountStart(int total, int limit);
	public int[] getPageGroupStartEnd(String pg, int pageEnd);
	
	public int nt_write(NoticeVO vo);
	public String view();
	public String modify();
	
}
