package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		
		int[] intA = {3,6,9};
		
		int[] intB;
		intB = intA;
		intB[0] = 20;
		intB[2] = 10;
		
		//intA와 intB가 같은 주소값을 가지고 있으므로
		//intB와 intA는 20, 6, 10 의 값을 출력할 것으로 예상
		
		for(int i=0; i<intA.length; i++) {
			System.out.println(intA[i]);
		}
		
	}

}
