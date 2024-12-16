// case2- In Overloading child Argument well get more priority

package com.ap.polymorhism;

public class OverlodingDemo2 {
	public void m1(Object o) {
		System.out.println( "Object Version ");
	}
	public void m1(String s) {
		System.out.println( "String Version");
	}
	public static void main(String[]args) {
		OverlodingDemo2 d2=new OverlodingDemo2();
		d2.m1(new Object());// Object Version 
		d2.m1("NEHA"); // String Version
		d2.m1(null); // String Version
	}
	

}
