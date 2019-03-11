package kr.co.ch10.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.co.ch10.vo.UserVO;

@Repository
public class UserDao {

	@Inject
	private JdbcTemplate jdbc;
	
	@Inject
	private SqlSessionTemplate mybatis;

	private Object userView;
	
	public List<UserVO> userList() {
		
		//return jdbc.query(SQL.SELECT_USER_LIST,  new UserRowMapper());
		
		return mybatis.selectList("ns_mapper_sql.SELECT_USER_LIST");
		
		
	}

	public void userRegist(UserVO vo)  {

		// Spring jsbc 방식
		//Object[] param = {vo.getUid(), vo.getName(), vo.getHp(), vo.getAddr(), vo.getPos(), vo.getDep()};
		//jdbc.update(SQL.INSERT_USER, param);
		
		// Mybatis 방식
		 mybatis.insert("ns_mapper_sql.INSERT_USER", vo);
		
	}

	public UserVO userView(UserVO vo)  {
		return mybatis.selectOne("ns_mapper_sql.SELECT_USER", vo);
	}

}
