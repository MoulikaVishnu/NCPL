package com.oops.moulika;

class External{
	int x=10;
	static int y = 20;
	
	static class Internal{
		public void show() {
			//System.out.println(x+" "+y); // here its a static class. static class can only access static variables
			System.out.println(y);
		
		}     
		
		
		//since x is not static we get error. 
		
		
		// create object for external in main
	}
}

public class LocalStaticClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
External.Internal obj = new External.Internal();  // object of static inner class directly without creating an object of outer class
obj.show();

	}

}


