package com.ncpl.assignmentweek1;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int A = scn.nextInt();
		int count = 0;
	for(int i=1;i<=A;i++) {
		if(A%i==0) {
			count++;
		}
		if(count>2) {
			break;
		}
		
	}
	if(count==2) {
		System.out.println("Num "+A+" is prime number");
	}
	else {
		System.out.println("Num "+A+" is not prime number");
	}
			
		
	}
}
		


