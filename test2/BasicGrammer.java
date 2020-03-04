package com.stx.basic;

public class BasicGrammer {

	public static void main(String[] args) {
		// 逻辑运算符
		int age = 10;
		boolean result = age++ > 10 && ++age < 12;
		System.out.println(age);
		
		// 
		int age1 = 10;
		boolean result1 = age1++ > 10 & ++age1 < 12;
		System.out.println(age1);
		
		

	}

}
