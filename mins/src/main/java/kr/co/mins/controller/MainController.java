package kr.co.mins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping(value= {"", "/", "/index"})
	public String index() {
		return "/index";
	};
	
	@RequestMapping(value="/main")
	public String main() {
		return "/main";
	};
	
	@RequestMapping(value="/about")
	public String about() {
		return "/about";
	};
	
	
}
