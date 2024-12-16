package com.ap.interfacecodingconflict;

public class LeftRightImpl 
	implements Right, Left{
		@Override
		public void m1() {
			System.out.println("hi...");
		}
		public static void main(String[]args) {
		
			Right right= new  LeftRightImpl();
			 right.m1();
			
			Left left = new LeftRightImpl();
			 left.m1();
		}
	}


