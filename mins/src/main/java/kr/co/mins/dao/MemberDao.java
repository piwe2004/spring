package kr.co.mins.dao;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.mins.vo.MemberVO;

@Repository
public class MemberDao {
	
	@Inject
	private SqlSessionTemplate mybatis;
	
	public MemberVO login(MemberVO vo) {
		
		return mybatis.selectOne("ns.mapper.sql_member.SELECT_MEMBER", vo);
		
	}

}
