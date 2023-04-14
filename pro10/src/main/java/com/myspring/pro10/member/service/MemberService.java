package com.myspring.pro10.member.service;

import com.myspring.pro10.member.vo.MemberVO;

public interface MemberService {
	
	//회원가입
	public void memberJoin(MemberVO memberVO) throws Exception;

}
