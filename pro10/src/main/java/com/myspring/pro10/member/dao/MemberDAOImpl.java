package com.myspring.pro10.member.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.myspring.pro10.member.vo.MemberVO;

@Repository("memberDAO")
public class MemberDAOImpl implements MemberDAO {
	@Autowired
	private SqlSession sqlSession;
		
	@Override
	public void  memberJoin(MemberVO memberVO) throws DataAccessException {
		sqlSession.insert("mapper.member.memberJoin",memberVO);
	}

}
