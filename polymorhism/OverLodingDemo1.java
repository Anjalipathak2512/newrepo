// case1- Method name are same but Argument are Different

package com.ap.polymorhism;

public class OverLodingDemo1 {
	public void m1() {
		System.out.println("ZERO Argument Method");
	}
	public void m1(int i) {
		System.out.println("M1 method is one argument " + i);
	}
	public static void main(String[]args) {
		OverLodingDemo1 d1=new OverLodingDemo1();
		d1.m1();
		d1.m1(100);
	}
	

}
