package kr.co.ch10.service;

import java.util.List;

import org.springframework.stereotype.Controller;

import kr.co.ch10.vo.UserVO;

@Controller
public interface UserService {
	
	public List<UserVO> userList();
	public void userRegist(UserVO vo);
	public void userView(UserVO vo);
	
	
}
