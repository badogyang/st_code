package com.stx.exercise.p2;

import java.util.Scanner;

public class Five_YangXin {
	
	static int value;
	static Scanner in = new Scanner(System.in);
	
	static void MainWindow() {
		System.out.println("-------------");
		System.out.println("客户信息管理");
		System.out.println("-------------");
		System.out.println("1.注册");
		System.out.println("2.登录");
		System.out.println("3.退出");
		System.out.println("-------------");
		System.out.println("请选择(1~3):");
	}
	
	static void sign() {
		System.out.println("你已经注册成功，输入1返回主页菜单，输入其他则停留在当前界面继续输入");
		
		value = in.nextInt();
		
		while(value != 1) {
			System.out.println("输入1返回主菜单");
			
			value = in.nextInt();
		}
		
		MainWindow();
	}
	
	static void login() {
		System.out.println("登录成功，输入1返回主页菜单，输入其他则停留在当前界面继续输入");
		
		value = in.nextInt();
		
		while(value != 1) {
			System.out.println("输入1返回主菜单");
			
			value = in.nextInt();
		}
		
		MainWindow();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainWindow();
		
		value = in.nextInt();
		
		while(value != 0) {
			if(value == 1) {
				sign();
			} else if(value == 2) {
				login();
			} else if(value == 3) {
				System.out.println("退出系统成功，程序终止");
				break;
			}
			
			value = in.nextInt();
		}
	}

}
