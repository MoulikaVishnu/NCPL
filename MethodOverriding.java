package com;
                               //idea is to listing out various brands of smart-watches under the category of smart watch.

class SmartWatch{                                                     //Here I created a class whose name is smart-watch / parent class
	void showstime() {                                        //Here I created a Method which is behavior of a smart-watch called shows time
		System.out.println("Dial shows the time");        //Here I created a functionality of shows time method.
		System.out.println("------------------------");
		
	}
}

class SamsungGalaxyWatch extends SmartWatch{   //created samsunggalaxywatch - child class. this child class is inherint the behavior of parent class     
		void showstime () {                    // reusing the same method/behavior of parent class
			
			System.out.println("SamsungGalaxyWatch");
			System.out.println("Dial goes in clockwise direction");//created a functionality inside my child class 
			System.out.println("------------------------");
		}
		
	}
	
	
	
	class GooglePixelWatch extends SmartWatch{ //googlepixelwatch is a new child class and it  is inheriting behavior of parent class
		void showstime () {                            //reusing the parent class method
			System.out.println("GooglePixelWatch");
			System.out.println("Dial has 12 numbers"); //functionality 
			System.out.println("------------------------");
		}
	}
	
	
	class AppleWatchSeries8 extends SmartWatch{     //created a new child class and making sure it inherits property/behavior of parent class
		void showstime () {                          //reusing the parent class method
			System.out.println("AppleWatchSeries8");
			System.out.println("It is a smarter way to access iphone");  //functionality
		}
	}

	
	
	public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartWatch obj1 = new SmartWatch();
		SamsungGalaxyWatch obj2 = new SamsungGalaxyWatch();     //creating objects for all the classes
		GooglePixelWatch obj3 = new GooglePixelWatch();
		AppleWatchSeries8  obj4 = new  AppleWatchSeries8 ();
		obj1.showstime();
		obj2.showstime();             //referring objects of respected method
		obj3.showstime();
		obj4.showstime();
		
		
		/*here we are over riding.
		 * over riding is a concept of 'Polymorphism'
		 * mandatory to make child classes over ride the parent class
		 * Is-A relation - Inheritance 
		 * using extends keyword - child and parent relation
		*/
		

	}

}
	
