package kr.co.booktopia.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class BoardController {
	
	@RequestMapping("/board/list")
	public String list() {
		return "/board/list";
	}
	
	@RequestMapping("/board/modify")
	public String modify() {
		return "/board/modify";
	}
	
	@RequestMapping("/board/view")
	public String view() {
		return "/board/view";
	}
	
	@RequestMapping("/board/write")
	public String wriete() {
		return "/board/wriete";
	}
}
