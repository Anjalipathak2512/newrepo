package com.ap.itrativestatement;

public class SumofDigits {

	public static void main(String[] args) {
    int number= 2365;
    int sum=0;
    int r=number%10;
    for(number=number/10;number>0;sum=sum+r) {
    	 System.out.println("the sum of digits is:"+sum);
    }
	
	}
}
    
