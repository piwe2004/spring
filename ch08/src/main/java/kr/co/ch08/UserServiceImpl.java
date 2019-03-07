package kr.co.ch08;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Inject
	private UserDao dao;
	
	@Override
	public void insertUser() throws Exception{
		dao.insertUser();
	}
	
	@Override
	public void selectUser() throws Exception{
		dao.selectUser();
	}
	
	@Override
	public void updateUser() throws Exception{
		dao.updateUser();
	}
	
	@Override
	public void deleteUser() throws Exception{
		dao.deleteUser();
	}
	
}
