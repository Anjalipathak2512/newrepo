//Has A Relationship Example::

package com.ap.inheritance;

public class HasRelation {
	public void m1(int i) {
		System.out.println("int_args");
		
	}
	public void m1(float f) {
		System.out.println("FLOAT _args");
		
	}
	public static void main(String[]args) {
		HasRelation h1=new HasRelation();
		h1.m1(200);
		h1.m1(100.0f);
	}



}
