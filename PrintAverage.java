package com.ncpl.assignmentweek1;

import java.util.Scanner;

public class PrintAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		
		int sum = 0;
		for(int i=1;i<=N;i++) {
			int a = scn.nextInt();
			sum = sum+a;
		}
		int avg = sum/N;
		System.out.println(avg);*/
		
		
		//if the given number is  float or double we can do type casting or initialize the values as per the  user's wish ---data type then lets write a code 
		  Scanner scn = new Scanner(System.in);
		  int N = scn.nextInt();
		 float sum =0;
		 for(int i=1;i<=N;i++){
		 float a = scn.nextFloat();
		  sum = sum+a;
		  }
		  float avg = sum/N;
		  System.out.println(avg);
		 
		 
		 
		
				
		}

	}


