package kr.co.sboard.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import kr.co.sboard.vo.BoardVO;
import kr.co.sboard.vo.FileVO;

public interface BoardService {

	public List<BoardVO> list(int start);
	public int getTotalCount();
	public int getPageEnd(int total);
	public int getLimitStart(String pg);
	public int getPageCountStart(int total, int limit);
	public int[] getPageGroupStartEnd(String pg, int pageEnd);
	
	public int write(BoardVO vo);
	public int fileUpload(BoardVO vo, HttpServletRequest req, MultipartFile file, FileVO fvo);
	public void fileDownload();
	
	public BoardVO view(int seq);
	public int boardhit(int seq);
	public int modify(int seq);
	public void delete();
	
	
	
}
