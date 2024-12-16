package com.ap.practice;

public class PrimeExample {

	public static void main(String[] args) {
		System.out.println("Prime numbers from 1 to 20:");
		for (int i=1;i<=20;i++) {
			if(isPrime(i)) {
				System.out.print(i+ " ");
			}
		}
		
	}

	private static boolean isPrime(int num) {
		if(num<=1) {
		return false;
	}
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
		}
}


