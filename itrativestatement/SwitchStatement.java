package com.ap.itrativestatement;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		
     Scanner scanner=new Scanner(System.in);
		
	float a,b,add,sub,div,mul;
	int ch;
	System.out.println("enter the first no.:");
	a= scanner.nextFloat();
	
	System.out.println("enter the first no.:");
	b= scanner.nextFloat();
	
	System.out.println("Press key 1 for Addition");
	System.out.println("Press key 2 for Subtraction");
	System.out.println("Press key 3 for Division");
	System.out.println("Press key 4 for Multiplication");
	System.out.println("Enter your choice:");
	
	ch =scanner.nextInt();
	
	switch(ch) {
	
	case 1:
		add=a+b;
		System.out.println("Addition"+add);
		break;
	
	case 2:
		sub=a-b;
		System.out.println("Subtraction:"+sub);
	       break;
	case 3:
		div=a/b;
		System.out.println("Division:"+div);
	         break;
	case 4:
		mul=a*b;
		System.out.println("Multiplication"+mul);
		    break;
	default:
		System.out.println("Invalid Choice!");
	}
	
	scanner.close();
	
	}

}
