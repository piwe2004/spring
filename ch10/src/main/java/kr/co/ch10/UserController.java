package kr.co.ch10;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@RequestMapping("/userList")
	public String userList() {
		return "/userList";
	}
	
	@RequestMapping("/userRegister")
	public String userRegister() {
		return "/userRegister";
	}

	@RequestMapping("/userView")
	public String userView() {
		return "/userView";
	}
	
}
