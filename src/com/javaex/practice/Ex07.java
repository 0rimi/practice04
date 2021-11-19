package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			System.out.print("금액: ");
			int won = sc.nextInt();
			
			int[] wonarr = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
			
			for(int i=0; i<wonarr.length; i++) {
				int count = 0;
				if(wonarr[i]<=won) {
					count=won/wonarr[i];
					won=won-count*wonarr[i];
					System.out.println(wonarr[i]+"원:"+count+"개");
				}
			}
			
		
		sc.close();
		
	}

}
