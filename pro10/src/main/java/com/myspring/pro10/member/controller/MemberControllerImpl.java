package com.myspring.pro10.member.controller;

import java.net.http.HttpHeaders;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.myspring.pro10.member.service.MemberService;
import com.myspring.pro10.member.vo.MemberVO;

@Controller("memberController")
@RequestMapping(value = "/member")
public class MemberControllerImpl implements MemberController {

    private static final Logger logger = LoggerFactory.getLogger(MemberControllerImpl.class);

    @Autowired
    private MemberService memberService;

    @Autowired
    private MemberVO memberVO;
    
    //회원가입 페이지 이동
    @RequestMapping(value="/join", method = RequestMethod.GET)
    public void loginGET() {
    	
    	logger.info("회원가입 페이지 진입");
    	
    }
    
    //회원가입
  	@RequestMapping(value="/join", method = RequestMethod.POST)
  	public String joinPOST(MemberVO memberVO) throws Exception {
  		
  		logger.info("join 진입");
  		
  		// 회원가입 서비스 실행
  		memberService.memberJoin(memberVO);
  		
  		logger.info("join Service 성공");
  		
  		return "redirect:/main";
  		
  	}
    
    //로그인 페이지 이동
    @RequestMapping(value="/login", method = RequestMethod.GET)
    public void joinGET() {
    	
    	logger.info("로그인 페이지 진입");
    	
    }
    
}