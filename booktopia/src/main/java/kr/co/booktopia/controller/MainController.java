package kr.co.booktopia.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class MainController {
	
	@RequestMapping(value= {"", "/", "/index"})
	public String index() {
		return "/index";
	}	

}
