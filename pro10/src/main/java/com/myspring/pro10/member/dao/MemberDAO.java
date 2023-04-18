package com.myspring.pro10.member.dao;

import java.util.Map;
import org.springframework.dao.DataAccessException;

import com.myspring.pro10.member.vo.MemberVO;

public interface MemberDAO {

	//회원가입
	public void  memberJoin(MemberVO memberVO) throws DataAccessException;

}
