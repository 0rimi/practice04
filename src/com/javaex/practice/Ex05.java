package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int[] accdata = new int[5];
		int num;
		double sum = 0;

		for (int i = 0; i < accdata.length; i++) {
			num = sc.nextInt();
			accdata[i] = num;
		}

		for (int i = 0; i < accdata.length; i++) {
			sum = sum + accdata[i];
		}

		System.out.println("평균은 " + sum / accdata.length + " 입니다.");
		
		
		
		
//		double sum=0;
//		for(int i=0; i<5; i++) {
//			double num = sc.nextDouble();
//			sum=sum+num;
//		}
//		
//		System.out.println("평균은 "+sum/5.0+" 입니다.");
		
		
		sc.close();
		
	}

}
