package com.iu.main;

import org.springframework.web.bind.annotation.RequestMapping;

public class FrontController {
	
	//home
	// / 주소 왔을 때 실행, index.jsp
	
	//BankBookController
	//MemberController, GET
	//주소 .do 삭제
	// /member/login
	
	@RequestMapping("/")
	public String home() throws Exception{
		System.out.println("index.do");
		
		return "index";
		
	}
}
