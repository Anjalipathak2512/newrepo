package com.ap.practice;

public class LargestAndSmallestFromArray {

	public static void main(String[] args) {
 
		int[] numbers= {4,6,78,45,0,-88,198,-2};
		int largest=numbers[0];
		int smallest=numbers[0];
		
		for(int i=0;i<numbers.length;i++) {

			if(numbers[i]>largest) {
				largest=numbers[i];
	}
			else if(numbers[i]<smallest){
				smallest=numbers[i];
		}
	 }System.out.println("Smallest:"+smallest);
	
			 System.out.println("largest:"+largest);
}
}