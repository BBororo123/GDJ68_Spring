package com.bbo.study4.s5;

public class S5Main {

	public static void main(String[] args) {
//		static
//		StaticTest st = new StaticTest();
//		st.instanceNum=50;
//		클래스명.클래스변수명
//		StaticTest.staticNum=20;
//		클래스명.메서드명();
//		StaticTest.staticMethod();
		
		MyCar.company="AUDI";
		
		MyCar myCar = new MyCar();
		myCar.brand = "A7";
		
		System.out.println(MyCar.company);
		System.out.println(MyCar.brand);
		
		
	}

}
