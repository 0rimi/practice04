package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		
		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		for(int i=0; i<intArray.length; i++) { //intArray[3]값이 없으므로 <로 해주어야함
			result = result + intArray[i];     //그렇게 되면 예상 결과 22
		}
		System.out.println(result);

	}

}
