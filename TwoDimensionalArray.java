package com.ncpl.assignmentweek1;


import java.util.*;

public class TwoDimensionalArray {
	
	public static int[][] printmatrix(int N,int M){
		Scanner scn = new Scanner(System.in);
		int arr[][] = new int [N][M];
		
		for(int i=0;i<N;i++) {
		for(int j=0;j<M;j++) {
				arr[i][j]=scn.nextInt();	
				}
			
		}
		return arr;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("please type input");
		int N = scn.nextInt();
		System.out.println("please type input");
		int M = scn.nextInt();
		int arraymatrix[][] = printmatrix(N,M);
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				System.out.print(arraymatrix[i][j]+" ");

				
			}
			System.out.println(" ");
		}
        }
        
	}
/*Scanner scn = new Scanner(System.in);
int N = scn.nextInt();
int M = scn.nextInt();
int mat[][] = new int [N][M];
for(int i=0;i<N;i++){
    for(int j =0;j<M;j++){
        mat[i][j] = scn.nextInt();
    }
}


for(int i=0;i<N;i++){
    for(int j =0;j<M;j++){
        System.out.print(mat[i][j]+" ");
    }
    System.out.println();*/


