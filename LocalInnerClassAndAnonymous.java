package com.oops.moulika;


//In this program we are writing a class inside a method 
//outer class ----> method ------>inner class 
//inside a method i have inner class and it is visible and useful inside the method
//outside class and inside method we are creating an obj 
//local inner class

// anonymous inner class can be defined at creation of the object itself.we can define class and create object. useful for interfaces and abstract classes.
//abstract class ----> object creation and overriding the abstract method at the same time. 
//interface is same. interface has abstract methods. by defining an anonymous class we can create an object for interface and abstract class. these anonymous classes will implement interfaces and abstarct classes
//writing a separate class and then creation is avoided here and anonymous inner class is created. 
 
/*static inner classes:

static inner classes are the static members of the outerclasses.
objects of the static inner classes can be created outside the outer classes and no need to create an obj of outer class.

*/



 




class OClass{
	public void display() {
		
		class InnerClass{
			
			public void show() {
				
				System.out.println("Hello");
				
			}
		}
		//InnerClass obj = new InnerClass();
		//obj.show();
		new InnerClass().show(); //anonymous object
	}
	
	
}

public class LocalInnerClassAndAnonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OClass obj1 = new OClass();
		obj1.display();

	}

}
