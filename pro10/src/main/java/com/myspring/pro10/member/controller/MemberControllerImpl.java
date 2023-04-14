package com.myspring.pro10.member.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myspring.pro10.member.service.MemberService;
import com.myspring.pro10.member.vo.MemberVO;

@Controller
@RequestMapping(value = "/member")
public class MemberControllerImpl {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberControllerImpl.class);
	
	@Autowired
	private MemberService memberService;
	
	@Autowired
	private MemberVO memberVO;
	
	//회원가입 페이지 이동
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public void joinGET() {
		
		logger.info("회원가입 페이지 진입");
				
	}
	
	//로그인 페이지 이동
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public void loginGET() {
		
		logger.info("로그인 페이지 진입");
		
	}
	
	//회원가입
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String joinPOST(MemberVO memberVO) throws Exception{
		
		logger.info("join 진입");
		
		// 회원가입 서비스 실행
		memberService.memberJoin(memberVO);
		
		logger.info("join Service 성공");
		
		return "redirect:/main";
		
	}
}
