package com.stx.exercise.p4;

public class Five_YangXin {

	//1
	public static int getTodalDay(int year, int mouth, int day) {
		int[] ping = {31,28,31,30,31,30,31,31,30,31,30,31};
		int[] run = {31,29,31,30,31,30,31,31,30,31,30,31};
		
		int ret = 0;
		
		if(year%400 == 0 || (year%4==0 && year%100!=0)) {
			for(int i = 0; i < mouth-1; i++ ) {
				ret += run[i];
			}
		}
		else {
			for(int i = 0; i < mouth-1; i++ ) {
				ret += ping[i];
			}
		}
		
		return ret + day;
	}
	
	//2
	public static long getSum(int a, int count) {
		long ret = 0;
		long s = 0;
		for(int i = 0; i < count; i++) {
			s = s*10+a;
			ret +=s;
		}
		
		return ret;
	}
	
	//3
	public static int[] getOrderCertionArray(int[] src) {
		
		int[] array = src;
		int[] ret = new int[src[src.length - 1]];
		
		for(int i = 0; i < array.length - 2; i++) {
			for(int j = i+1; j < array.length - 1; j++) {
				if(array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < array[array.length - 1]; i++) {
			ret[i] = array[i];
		}
		
		return ret;
	}
	
	//4
	public static int[] insertArrayElement(int[] sourceArray, int newElement) {
		int[] ret = new int[sourceArray.length + 1];
		
		for(int i = 0; i < ret.length; i++) {
			if(sourceArray[i] < newElement && sourceArray[i+1] < newElement) {
				ret[i] = sourceArray[i];
			} else if(sourceArray[i] < newElement && sourceArray[i+1] >= newElement){
				ret[i] = sourceArray[i];
				ret[++i] = newElement;
				while(++i < ret.length) {
					ret[i] = sourceArray[i-1];
					//i++;
				}
			} else if(sourceArray[i] >= newElement) {
				ret[i] = sourceArray[i];
			}
		}

		return ret;
	}
	
	//5
	public static int[] getODDArray(int[] sourceArray) {
		int[] array = new int[sourceArray.length];
		
		int length = 0;
		
		for(int i = 0; i<sourceArray.length; i++) {
			if(sourceArray[i]%2 != 0) {
				array[length++] = sourceArray[i];
			}
		}
		
		int[] ret = new int[length];
		for(int i = 0; i<ret.length; i++) {
			ret[i] = array[i];
		}
		
		//sort
		for(int i = 0; i < ret.length - 1; i++) {
			for(int j = i+1; j < ret.length; j++) {
				if(ret[i] > ret[j]) {
					int temp = ret[i];
					ret[i] = ret[j];
					ret[j] = temp;
				}
			}
		}
		
		return ret;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
		System.out.println(getTodalDay(2020,2,10));
		
		//2
		System.out.println(getSum(1,5));
	
		//3
		int[] src = {34,23,10,36,77,2};
		int[] print = getOrderCertionArray(src);
		
		for(int  i = 0; i < print.length; i++) {
			System.out.print(print[i] + " ");
		}
		System.out.println();
		
		//4
		int[] src4 = {3,5,7,9,10,15};
		int[] print4 = insertArrayElement(src4, 8);
		
		for(int  i = 0; i < print4.length; i++) {
			System.out.print(print4[i] + " ");
		}
		System.out.println();
		
		//5
		int[] src5 = {34,23,10,36,77,2};
		int[] print5 = getODDArray(src5);
		
		for(int  i = 0; i < print5.length; i++) {
			System.out.print(print5[i] + " ");
		}
		System.out.println();
	}

}