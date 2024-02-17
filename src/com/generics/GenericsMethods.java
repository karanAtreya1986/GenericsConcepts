package com.generics;

public class GenericsMethods {
	
	public static void main(String[] args) {
		
		Integer [] intArr= {1,2,3,4,5,610, 1000, -1, -2, -3, -4};
		Character[] chaArr= {'a', 'b', 'F', 'H'};
		
		System.out.println("----------------Integer array is printed---------");
		printingArray(intArr);
		
		System.out.println("----------------Character array is printed---------");
		printingArray(chaArr);
		
	}
	
	
	static <B> void printingArray(B[] arr) {
		for(B ele:arr) {
			System.out.println(ele + " ");
		}
	}

}
