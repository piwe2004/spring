package kr.co.mins.serviceImpl;

import java.io.File;
import java.util.List;
import java.util.UUID;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kr.co.mins.dao.BoardDao;
import kr.co.mins.service.BoardService;
import kr.co.mins.vo.FileVO;
import kr.co.mins.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{

	@Inject
	private BoardDao dao;
	
	@Override
	public List<BoardVO> list(int start, String cate) {
		return dao.list(start, cate);
	}
	
	@Override
	public int getTotalCount(String cate) {
		return dao.getTotalCount(cate);
	}

	@Override
	public int getPageEnd(int total) {
		
		int pageEnd = 0;
		
		if(total % 10 == 0) {
			pageEnd = total / 10;
		}else {
			pageEnd = (total / 10) + 1;
		}
		
		return pageEnd;
	}

	@Override
	public int getLimitStart(String pg) {

		int start = 0;
		
		if(pg == null) {
			start = 1;
		} else {
			start = Integer.parseInt(pg);
		}
		
		return (start - 1) * 10;
	}

	@Override
	public int getPageCountStart(int total, int limit) {

		return total - limit;
		
	}

	@Override
	public int[] getPageGroupStartEnd(String pg, int pageEnd) {

		int[] groupStartEnd = new int[2];
		int current = 0;
		if(pg == null) {
			current = 1;
		} else {
			current = Integer.parseInt(pg);
		}
		
		int currentPage = current;
		int currentPageGroup = (int)Math.ceil(currentPage/10.0);
		int groupStart = (currentPageGroup - 1) * 10 + 1;
		int groupEnd = currentPageGroup * 10;
		if(groupEnd > pageEnd) {
			groupEnd = pageEnd;
		}
		
		groupStartEnd[0] = groupStart;
		groupStartEnd[1] = groupEnd;
		
		return groupStartEnd;
		
		
	}

	@Override
	public int writeResult(BoardVO vo) {
		return dao.writeResult(vo);
	}
	
	@Override
	public int fileUpload(BoardVO vo, HttpServletRequest req, MultipartFile file, FileVO fvo) {
		// 업로드 처리 시작
		// 파일이 저장될 디렉토리 경로설정 

		
		int parent = vo.getSeq();
		String path = req.getSession().getServletContext().getRealPath("/");
		path += "resources/upload/";
		
		// 파일 업로드 처리
		if(!file.isEmpty()) {
			
			// 파일이 첨부되었을때
			String oldName = file.getOriginalFilename();
			String ext = oldName.substring(oldName.lastIndexOf("."));

			// 고유파일명 생성
			String newName = UUID.randomUUID().toString()+ext;
			
			try {
				file.transferTo(new File(path+newName));
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			fvo.setParent(parent);
			fvo.setOldName(oldName);
			fvo.setNewName(newName);
			dao.fileUpload(fvo);
			return 1;
			
		} else {
			return 0;
		}
		
		// 업로드 처리 끝

	}

	@Override
	public BoardVO view(int seq, String cate) {
		return dao.view(seq, cate);
	}
	
	@Override
	public int boardhit(int seq, String cate) {
		return dao.boardhit(seq, cate);
	}
	
	@Override
	public BoardVO preview(int seq, String cate) {
		return dao.preview(seq, cate);
	}
	
	@Override
	public BoardVO nextview(int seq, String cate) {
		return dao.nextview(seq, cate);
	}
	
	@Override
	public FileVO view_file(int seq, String cate) {
		return dao.view_file(seq, cate);
	}

	@Override
	public String modify() {
		// TODO Auto-generated method stub
		return null;
	}


}
