package com.ncpl.assignmentweek1;

import java.util.Scanner;

public class PrintingAllPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		
		for(int i=0;i<=N;i++) {
			int count = 0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
				if(count>2) {
					break;
				}
			}
			if(count==2) {
				System.out.println(i);
				
			
		}
		
			
			
		}

	}

}


