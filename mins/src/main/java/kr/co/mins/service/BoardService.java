package kr.co.mins.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import kr.co.mins.vo.FileVO;
import kr.co.mins.vo.BoardVO;

public interface BoardService {

	public List<BoardVO> list(int start, String cate);
	public int getTotalCount(String cate);
	public int getPageEnd(int total);
	public int getLimitStart(String pg);
	public int getPageCountStart(int total, int limit);
	public int[] getPageGroupStartEnd(String pg, int pageEnd);
	
	public int writeResult(BoardVO vo);
	public int fileUpload(BoardVO vo, HttpServletRequest req, MultipartFile file, FileVO fvo);
	public BoardVO view(int seq, String cate);
	public int boardhit(int seq, String cate);
	public FileVO view_file(int seq, String cate);
	public BoardVO preview(int seq, String cate);
	public BoardVO nextview(int seq, String cate);
	public String modify();
	
}
