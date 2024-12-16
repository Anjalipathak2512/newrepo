package com.ap.itrativestatement;

public class FibonacciSeries {

	public static void main(String[] args) {

		int n=10,num1=0,num2=1;
		
		System.out.println("Fibonacci Series:");
		
		for(int a=1;a<=n;a++) {
			
			System.out.println(num1);
			
			int sum = num1+num2;
			num1=num2;
			num2=sum;
		}
		
		
	}

}
