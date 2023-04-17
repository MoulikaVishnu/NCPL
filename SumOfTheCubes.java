package com.ncpl.assignmentweek1;

import java.util.Scanner;

public class SumOfTheCubes {
	public static int sum(int A) {
		int cube=0;
		while(A>0) {
		
		int d = A%10;
		
		 cube = (d*d*d)+cube;
		 A=A/10;
		}
		
		return cube;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int A = scn.nextInt();
		int value = sum(A);
		System.out.println(value);

	}

}
