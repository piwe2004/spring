package kr.co.mins.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.multipart.MultipartFile;

import kr.co.mins.service.BoardService;
import kr.co.mins.vo.FileVO;
import kr.co.mins.vo.MemberVO;
import kr.co.mins.vo.NoticeVO;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	@RequestMapping("/pf/portfolio")
	public String portfolio() {
		return "/pf/portfolio";
	};
	
	@RequestMapping("/notice/list")
	public String nt_list(Model model, String pg) {
		
		int start = service.getLimitStart(pg);
		
		int total = service.getTotalCount();
		int pageEnd = service.getPageEnd(total);
		
		int count = service.getPageCountStart(total, start);
		
		int[] groupStartEnd = service.getPageGroupStartEnd(pg, pageEnd);
		
		List<NoticeVO> list = service.nt_list(start);
		
		model.addAttribute("list", list);
		model.addAttribute("total", total);
		model.addAttribute("count", count);
		model.addAttribute("groupStartEnd", groupStartEnd);
		
		return "/notice/list";
	};
	
	@RequestMapping(value="/notice/write", method=RequestMethod.GET)
	public String nt_write() {
		return "/notice/write";
	};
	
	@RequestMapping(value="/notice/write", method=RequestMethod.POST)
	public String nt_write(NoticeVO vo, HttpServletRequest req, HttpSession sess) {
		
		MemberVO member = (MemberVO) sess.getAttribute("member");
		
		vo.setRegip(req.getRemoteAddr());
		vo.setUserid(member.getUserid());
		vo.setUsernick(member.getUsernick());
		
		//MultipartFile file = vo.getFname();
		
		service.nt_write(vo);
		
		return "/notice/write";
	};
	
	@RequestMapping("/notice/view")
	public String view() {
		return "/notice/view";
	};
	
	@RequestMapping("/notice/modify")
	public String modify() {
		return "/notice/modify";
	};
	
	
}
