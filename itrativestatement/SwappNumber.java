package com.ap.itrativestatement;

public class SwappNumber {

	public static void main(String[] args) {

		int i=10,j=20;
		
		System.out.println("Before Swap "+i+" "+j);
		
		  i=i+j;
	      j=i-j;
	      i=j-i;
	      System.out.println("After Swapping"+i+"  "+j);
			
	} 
	     
}
