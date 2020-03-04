package com.stx.exercise.p3;

import java.util.Scanner;

public class Five_YangXin {
	
	static void sort(double[] value) {
		for(int i = 0; i < value.length; i++)
			for(int j = i + 1; j < value.length; j++) {
				if(value[i] < value[j]) {
					double temp = value[i];
					value[i] = value[j];
					value[j] = temp;
				}
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("请设定评委数量 : ");
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		double[] value = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("第" + (i+1) + "位评委打分 : ");
			value[i] = in.nextDouble();
		}
		
		sort(value);
		
		double sum = 0;
		
		for(int i = 1; i < n-1; i++) {
			sum += value[i];
		}
				
		System.out.print("选手平均分为 : " + (sum/(n-2)));
		
		in.close();
	}

}
