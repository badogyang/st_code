package com.stx.basic;

public class HelloJava {

	public static void main(String[] args) {
		int age = 10;
		int newAge = age++;
		/* 1. age -> 表达式的值 --> newAge
		   2.  将age变量的值+1
		*/
		System.out.println(age);
		System.out.println(newAge);
		
		int neAge = ++age;
		/* 1. age变量的值+1
		   2. age -> 表达式的值 --> neAge
		*/
		System.out.println(age);
		System.out.println(neAge);
		
		byte a = 10;
		int b = a;
		// a = b;
		a = (byte)b;
		
		// 自动类型提升
		byte a1 = 10;
		byte b1 = 20;
		byte c1 = a1 + b1;
		
		byte a2 = 1;
		a2 = a2 + 1;
		a2 += 1;  // a2 = (byte)(a2 + 1)
	}

}