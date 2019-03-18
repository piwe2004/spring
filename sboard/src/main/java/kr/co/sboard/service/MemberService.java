package kr.co.sboard.service;

import org.springframework.stereotype.Controller;

import kr.co.sboard.vo.MemberVO;
import kr.co.sboard.vo.TermsVO;

@Controller
public interface MemberService {

	public MemberVO login(MemberVO vo);
	public void register(MemberVO vo);
	public TermsVO terms();
	
}
