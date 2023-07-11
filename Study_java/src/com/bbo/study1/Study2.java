package com.bbo.study1;

public class Study2 {
	
	public static void main (String [] args) {
		
		/*여러줄 주석
		  1
		  2
		  3
		  */
		
		/**
		 * 문서작성시 주석*/
		
		
		
		
		
		System.out.println("시작");
		int num1 = 20;
		int num2 = 50;
		int num3 = num1 % num2;
		
		String name = "1";
		String result = name +1; 
		
		int count = 8;
		
		count = count+1;
		count++; //count = count+1;랑 같은식(선행)
		++count; //count = count+1;랑 같은식(후행)
		
		int r = count++;
		
		count=count+1;
		count+=1;
		count=count*5;
		count*=5;
		count=count%3;
		count%=3;
		
		System.out.println("Count : "+count);
		System.out.println("R : "+r);
		System.out.println(result);
		System.out.println("종료");
	}

}
