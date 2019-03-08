package kr.co.ch09;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@RequestMapping(value="/user/form")
	public String from() {
		return "/user/form";
	}
	
	@RequestMapping(value="/user/regist")
	public String regist(Model model, UserVO vo) {
		
		// 뷰로 데이터 전달
		model.addAttribute(vo);
		
		
		return "/user/regist";
	}
}
