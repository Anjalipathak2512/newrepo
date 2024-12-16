// IS A Relationship example::

package com.ap.inheritance;

public class child extends parant {
	public void m2() {
		System.out.println("M2 is a child class");
	}



public static void main (String []args) {
	//case:1
	parant p1=new parant();
	p1.m1();
	
	//case2
	child c1=new child();
	c1.m1();
	c1.m2();
	
	//case3
	parant p2=new child();
	p2.m1();
	//case4 not applicable
	// child c2=new parant();
	//c2.m1();
}
}
