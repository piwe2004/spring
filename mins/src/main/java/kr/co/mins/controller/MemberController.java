package kr.co.mins.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.mins.service.MemberService;
import kr.co.mins.vo.MemberVO;

@Controller
public class MemberController {

	@Inject
	private MemberService service;
	
	@RequestMapping(value="/member/login", method=RequestMethod.GET)
	public String login() {
		return "/member/login";
	}
	
	@RequestMapping(value="/member/login", method=RequestMethod.POST)
	public String login(HttpSession sess, MemberVO vo, HttpServletRequest req) {
		
		
		HttpSession loginSession = req.getSession();
		String checklog = (String) loginSession.getAttribute("member");
		
		MemberVO member = service.login(vo);
		
		if(member != null) {
			//세션저장
			sess.setAttribute("member", member);
			
			return "redirect:/notice/list";
			
		} else {
			
			return "redirect:/member/login?result=fail";
		}
		
		
	}
	
	@RequestMapping("/member/logout")
	public String logout(HttpSession sess) {
		
		
			sess.invalidate();
			
			return "redirect:/member/login";
		
	}
	
}
