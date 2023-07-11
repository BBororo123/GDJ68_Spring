package com.bbo.study4.s5;

public final class FinalTest { //클래스 앞에 final이 붙으면 상속불가
	
	public static final int SIZE=50;
	
	public final int MAX_NUM; //상수-한번 입력한 값은 변경이 불가
		
//	{
//		this.num=20;
//	}
	
	public FinalTest() {
		this.MAX_NUM=20;
	}
	
	public final void finalMethod() { //오버라이딩 불가
		final int a=10; //상수-한번 입력한 값은 변경이 불가
		
	}

}
