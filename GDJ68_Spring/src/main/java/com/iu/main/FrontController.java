package com.iu.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iu.main.di.Robot;


@Controller
public class FrontController {
	
	@Autowired
	private Robot robot;
	
	//home
	// / 주소 왔을 때 실행, index.jsp
	
	//BankBookController
	//MemberController, GET
	//주소 .do 삭제
	// /member/login
//	
//	@Autowired
//	public FrontController(Robot robot) {
//		// TODO Auto-generated method stub
//		this.robot=robot;
//	}
//	
//	public Robot getRobot() {
//		return robot;
//	}
//	
//	@Autowired
//	public void setRobot(Robot robot) {
//		this.robot = robot;
//	}

	@RequestMapping("/")
	public String home() {	
		robot.getHead().name();
		robot.getLeftarm().punch();
		return "index";
		
	}
}
