package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
			int[] Ran = new int[6];
						
			for(int i=0; i<Ran.length; i++) {
				Ran[i] = (int)(Math.random()*(45-1+1)+1);
				//숫자범위 Mate식*(최댓값-최솟값+1)+최솟값
				if (i==0) {
					System.out.print(Ran[i]+"\t");
					continue;
				}
				for(int j=0; j<i&&i>=1; j++) {
					if(Ran[i]==Ran[j]) {
						Ran[i] = (int)(Math.random()*(45-1+1)+1);
					}					
				}
				System.out.print(Ran[i]+"\t");
			}
			 
			
		
		sc.close();
		
	}

}
