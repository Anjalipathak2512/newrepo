package com.ap.polymorhism;

public class OverlodingDemo4 {
	public void m1(Integer i) {
		System.out.println("Integer Wrapper Version ");
	}
	public void m1(int i) {
		System.out.println("int primitive version");
	}
	public static void main(String[] args) {
		OverlodingDemo4 od=new OverlodingDemo4();
		od.m1(10);
	}

}
