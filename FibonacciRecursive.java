package com.ncpl.assignmentweek1;

public class FibonacciRecursive {
	static int a=1,b=1,c;
	public static void Fsequence(int n) {
	
        if (n > 0) { // f series is always >0
            c = a + b;
            a = b;
            b = c;
            System.out.println(" "+c);
            Fsequence(n-1);
        }
       
	}
		public static void main(String[] args) {      //method called in itself is recursion. //in recursion when to stop is important. for that we need a base case.
		// TODO Auto-generated method stub  // series 0 1 1 2 3 5 8 .................n-1  n-2
		            int n = 10;   
		           System.out.println(a+" "+b);
		           Fsequence(n-2);
		            
		
	}
		

}
