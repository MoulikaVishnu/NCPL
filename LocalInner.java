package com.oops.moulika;

abstract class My{
	
	abstract public void show(); 
	
}
class Out{
	public void display() {
		My obj = new My() {      //concrete class ; overriding abstract class method by creating an object of abstract class 
			public void show() {
				System.out.println("Hello");
	}
	
};
obj.show(); //here we created an object of abstract class by overriding the abstract class
            // we are calling the object of abstract class in the out class.

	}
}
		

public class LocalInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Out obj1 = new Out();
obj1.display();
	}

}
