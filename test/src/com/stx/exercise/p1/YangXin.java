package com.stx.exercise.p1;

import java.util.Scanner;

public class YangXin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double kg,m;
		
		Scanner in = new Scanner(System.in);
		
		kg = in.nextDouble();
		m = in.nextDouble();
		
		in.close();
		
		double bmi = kg/(m*m);
		
		if(bmi < 18.5) {
			System.out.println("轻体重");
		} else if( bmi>=18.5 && bmi<24) {
			System.out.println("标准体重");
		} else if(bmi>=24 && bmi<28) {
			System.out.println("超重");
		} else if(bmi >=28) {
			System.out.println("肥胖");
		}
	}

}
