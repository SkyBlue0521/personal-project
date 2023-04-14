package com.myspring.pro10.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myspring.pro10.mapper.MemberMapper;
import com.myspring.pro10.member.dao.MemberDAO;
import com.myspring.pro10.member.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDAO memberDAO;
	
	@Override
	public void memberJoin(MemberVO memberVO) throws Exception {
		memberDAO.memberJoin(memberVO);
	}
	
}
