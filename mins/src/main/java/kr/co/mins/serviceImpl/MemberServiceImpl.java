package kr.co.mins.serviceImpl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.mins.dao.MemberDao;
import kr.co.mins.service.MemberService;
import kr.co.mins.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {

	
	@Inject
	private MemberDao dao;
	
	@Override
	public MemberVO login(MemberVO vo) {
		return dao.login(vo);
	}
	
}
