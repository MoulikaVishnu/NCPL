package com.ncpl.assignmentweek1;

import java.util.Scanner;

public class FibonacciSequence {
	public static void Fsequesnce(int count) {      //non recursive function ; this is a function which has certain procedures to be followed. 
		int n1=1;
		int n2=1;
		System.out.print(n1+" "+n2);
		int n3=0;
		for(int i=1;i<count;i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);	
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int count = scn.nextInt();
		Fsequesnce(count);
	}

}
