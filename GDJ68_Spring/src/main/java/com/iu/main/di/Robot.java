package com.iu.main.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //new Robot()
public class Robot {
	
	private String name;
	
	@Autowired
	private Head head;
	
	@Autowired
	private Arm leftArm;
	
	@Autowired
	@Qualifier("arm2")
	private Arm arm;
	
	
	

	public Arm getLeftarm() {
		return leftArm;
	}

	public void setLeftarm(Arm leftarm) {
		this.leftArm = leftarm;
	}

	public Head getHead() {
		return head;
	}

	public void setHead(Head head) {
		this.head = head;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

}
