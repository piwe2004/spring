package kr.co.sboard.controller;

import java.io.File;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import kr.co.sboard.service.BoardService;
import kr.co.sboard.vo.BoardVO;
import kr.co.sboard.vo.FileVO;
import kr.co.sboard.vo.MemberVO;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService service;

	@RequestMapping("/list")
	public String list(Model model, String pg) {
		
		// Limit용 start 계산
		int start = service.getLimitStart(pg);
		
		
		// 페이지 계산
		int total = service.getTotalCount();
		int pageEnd = service.getPageEnd(total);
		
		// 글 카운트 계산
		int count = service.getPageCountStart(total, start);
		
		// 페이지 그룹 계산
		int[] groupStartEnd = service.getPageGroupStartEnd(pg, pageEnd);
		
		List<BoardVO> list = service.list(start);
		
		MemberVO mvo = new MemberVO();
		
		model.addAttribute("list", list);
		model.addAttribute("total", total);
		model.addAttribute("count", count);
		model.addAttribute("groupStartEnd", groupStartEnd);

		
		return "/list";
	}
	
	public String getTotalCount() {
			
		return "/getTotalCount";
			
	}


	@RequestMapping(value="/write", method=RequestMethod.GET)
	public String write() {
		return "/write";
	}
	
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String write(BoardVO vo, HttpServletRequest req, HttpSession sess, FileVO fvo) {
		
		MemberVO member = (MemberVO) sess.getAttribute("member");
		
		vo.setCate("notice");
		vo.setRegip(req.getRemoteAddr());
		vo.setUid(member.getUid());
		
		MultipartFile file = vo.getFname();
		
		int parent = service.write(vo);
		
		vo.setFile(service.fileUpload(vo, req, file, fvo));
		
		// 파일업로드 정보 테이블 저장
		
		//service.filewrite(parent);
		
		return "redirect:/list";
	}
	
	
	@RequestMapping("/view")
	public String view(int seq, Model model) {
		
		BoardVO vo = service.view(seq);
		
		model.addAttribute(vo);
		
		service.boardhit(seq);
				
		return "/view";
	}
	
	@RequestMapping("/modify")
	public String modify(int seq, Model model) {
		
		service.modify(seq);
		
		return "/view?seq=${seq}";
	}
}
