package com.ncpl.assignmentweek1;

import java.util.Scanner;

public class SumOfFirstN {
	public static int calculatesum(int n ) {
		int sum =0;
		for(int i=1;i<=n;i++) {
		if((i%3==0) || (i%5==0)) {
			sum = sum+i;
		}
			
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
int n = scn.nextInt();
int result = calculatesum(n);
System.out.println(result);

	}

}
