package com.oops.moulika;





/* we can define a class inside an another class- inner class/nested class.
if a class is bigger and complex and want to make it simple then we create inner class
interface also we can define inside a class
nested inner class, local inner class, anonymous inner class and static inner class -----4 types
nested inner class : here we can have  a class inside a method. 
 OUTER CLASS ----->2) Method inside outer class -----> 3) inner class inside method
 members or fields of the outer class are directly accessible by inner class 
inside the outer class we can create an object of inner class
outer class uses the object of inner class. 
outer class cannot access the members of inner class unless it has to create an object.
inside main we create an object of outer class
outer.Inner i = new outer().new Inner(); 
 outer 0 = new outer();
 if we compile this inner classes code we get outer.class file but what about inner class ? outer$Inner.class is created
 */
class Outer{
	//int x =10;
	static int x = 10;
	Inner obj = new Inner();  // unless inner class is defined we cannot create a inner class obj in c language 
	//But in java we dont have that limitation. we can create an object in a class or in a method before defining inner class
	class Inner{
		int y=20; //local variable
		public void innerDisplay() {
			System.out.println(x+" "+y);
			
		}
	}
	public void outerDisplay() {
		Inner obj = new Inner();
		obj.innerDisplay();
		System.out.println(obj.y);
		
	}
}




public class NestedInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer obj1 = new Outer(); //this is just creating outer class object 
		obj1.outerDisplay(); //accessing inner class method by creating outer class object
		//Outer.Inner obj1 = new Outer().new Inner(); // this is how we directly access object of inner class inside inner class
		

	}

}
