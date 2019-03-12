package kr.co.sboard.service;

import org.springframework.stereotype.Controller;

import kr.co.sboard.vo.TermsVO;

@Controller
public interface MemberService {

	public void login();
	public void register();
	public TermsVO terms();
	
}
