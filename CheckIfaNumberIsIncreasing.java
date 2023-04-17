package com.ncpl.assignmentweek1;

import java.util.Scanner;

public class CheckIfaNumberIsIncreasing {
	public static boolean checknumber(int number) {
		while(number>0) {
			int digit = number%10;
			number = number/10;
			if(digit>number%10) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
		
			
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	A number is said to be an increasing number if no digit is exceeded by the digit to its left. 
	//	For Example : 134468 is an increasing number 
		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();
		boolean result = checknumber(number);
		System.out.println(result);


	}

}
