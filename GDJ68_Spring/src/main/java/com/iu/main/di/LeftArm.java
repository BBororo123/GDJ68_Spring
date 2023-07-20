package com.iu.main.di;

import org.springframework.stereotype.Component;

@Component //leftArm = new LeftArm(); 클래스명의 첫글자를 소문자로 바꾼것이 이름
public class LeftArm implements Arm {
	
	@Override
	public void punch() {
		System.out.println("왼쪽 펀치");
	}

}
