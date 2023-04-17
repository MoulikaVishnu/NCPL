package com.ncpl.assignmentweek1;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		short b = 15;
		long c = 100L;
		float d = 21.1f;
		double e = 33.33;
		
		//int add = a+b;
		//long add = a+b;
		//System.out.println(add);
		
		//int x = e; //int to double is possible but not vice versa. doing explicit type casting 
		int x = (int)e;
		System.out.println(x);
	
		//int y = d;//float to int not possible , do explicit type casting.
		int y = (int)d;
		System.out.println(y);
		
		double k = d;//float to double possible , implicit type casting is happening here
		System.out.println(k);
		
		double m = a; //int to double possible , implicit type casting
		System.out.println(m);
		
		//long i = e;//double to long not possible, explicit type casting 
		long i = (long)e;
		System.out.println(i);
		
		//int sam = c; // long to int not possible ; do explicit type casting --possible lossy conversion
		int sam = (int)c;
		System.out.println(sam);
		
		//int sai = d+e; // d is float and e is double ; addition of double and float is double. 
		//converting double to int is not possible . do explicit type casting.
		int sai = (int)(d+e);
		System.out.println(sai);
		
		// long vishnu = a+e; // int and double addition is double and double cannot be stored in long. explicit type cast 
		
		long vishnu = (long)(a+e);
		System.out.println(vishnu);
		
		
		
		// smaller range + bigger range = bigger range 
		// int + int = int 
		//int +long = long
		//int +double = double 
		//int + float = float 
		
		
		
		
		
		
		
		
		
		

	}

}





//Idea : 1.creating a variable with respective data types.
// 2. printing them to see how execution is happening. 
//3. doing some operations like addition, subtraction, multiplication and division