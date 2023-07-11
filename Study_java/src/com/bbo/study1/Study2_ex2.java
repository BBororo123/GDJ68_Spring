package com.bbo.study1;

import java.util.Scanner;

public class Study2_ex2 {
	 
	public static void main(String [] args) {
		System.out.println("Start");
		Scanner sc = new Scanner(System.in);
		
		//입력	출력
		//1		1
		//2		2
		//3		3
		//4		10
		//5		11
		//6		12
		//7		13
		//8		20
		//9		21
		//10	22
		System.out.println("입력하세요 ");
		int input = sc.nextInt();
		int output = input/4*10+input%4;
		
		
		
		System.out.println("Input : "+input+", Output : "+output);
		
		
		
		
		System.out.println("Finish");
		
	}

}
