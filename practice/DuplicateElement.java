package com.ap.practice;

public class DuplicateElement {

	public static void main(String[] args) {

        String[] name= {"java","phyton","Ruby","C","C++","java","phyton","Ruby"};
        for(int i=0;i<name.length;i++) {
        	for(int j=i+1;j<name.length;j++) {

        		if (name[i].equals(name[j])){

        		System.out.println(name[i]);	
        }		
		
	}
        }
	}
}
