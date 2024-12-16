 //  case3:: It is given highest priority in specific version.

package com.ap.polymorhism;

public class OverlodingDemo3 {
       public void m1(StringBuffer sb) {
    	   System.out.println("StringBuffer Version");
       }
       public void m1(String S) {

    	   System.out.println("String Version");
	}
       public static void main(String[] args) {
		OverlodingDemo3 overloding=new OverlodingDemo3();
		overloding.m1(new StringBuffer("Priya"));  // StringBuffer Version
		overloding.m1("NEHA");// String Version 
	//	overloding.m1(null);   //The method m1(StringBuffer) is ambiguous for the type OverlodingDemo3
	}
       
       
}
