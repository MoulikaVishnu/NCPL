package com.ncpl.assignmentweek1;

import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("This program is for Traffic Lights");
		System.out.println("you have three options, please select one of the below lights");
		System.out.println("Green");
		System.out.println("Red");
		System.out.println("Yellow");
		String option = scn.next();
			switch(option) {
		case "Green": 
			System.out.println("Go");
			break;
		case "Red":
			System.out.println("Stop");
			break;
		case "Yellow":
		System.out.println("Ready");
		break;
	 default:
			System.out.println("No Valid Option Selected");
			break;
			
		
			
			
		
		
		
		
		
		}
		
		
		
		
		

	}

}
