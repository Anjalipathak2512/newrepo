package com.ap.itrativestatement;

import java.util.Scanner;

public class SwapTwoNumber {
  	public static void main(String[] args) {
   int a,b;
   System.out.println("Enter any two number:");
   Scanner ref=new Scanner(System.in);
   a=ref.nextInt();
   b=ref.nextInt();
	System.out.println("Before Swapping"+a+" "+b);   
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After Swapping"+a+" "+b);
	   
  	}
   
		
		
	}


