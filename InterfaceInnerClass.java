package com.oops.moulika;

interface ItsInterface{
	public void show();
}
class Ou{
	public void display() {
		ItsInterface obj = new ItsInterface() {public void show() {System.out.println("Hello");}};
		obj.show();
	}
}
		



public class InterfaceInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Ou ob=new Ou();
            ob.display();
	}

}
