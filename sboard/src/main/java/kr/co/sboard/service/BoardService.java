package kr.co.sboard.service;

import org.springframework.stereotype.Controller;

@Controller
public interface BoardService {

	public void list();
	public void write();
	public void view();
	
}
