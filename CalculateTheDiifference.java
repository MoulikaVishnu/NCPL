package com.ncpl.assignmentweek1;

import java.util.Scanner;

public class CalculateTheDiifference {
	public static int calculatedifference(int n) {
		int sum = 0;
		
		int squares=0;
		int sumofn=0;
		
		
//		For Example if n is 10,you have to find 
//		(1^2+2^2+3^2+….9^2+10^2)- 
//		(1+2+3+4+5…+9+10)^2 

		
		for(int i=1;i<=n;i++) {
		  squares = squares+(i*i);
			sumofn=sumofn+i;
			
			
		}
		sumofn=(sumofn)*(sumofn);
		sum = squares-sumofn;
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int result = calculatedifference(n);
		System.out.println(result);
		

	}

}
