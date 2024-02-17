package com.generics;

public class GenericsWithNonStaticMethods {
	
		public static void main(String[] args) {
			
			GenericsWithNonStaticMethods g1=new GenericsWithNonStaticMethods();
			
			Integer [] intArr= {1,2,3,4,5,610, 1000, -1, -2, -3, -4};
			Character[] chaArr= {'a', 'b', 'F', 'H'};
			
			System.out.println("----------------Integer array is printed---------");
			g1.printingArray(intArr);
			
			System.out.println("----------------Character array is printed---------");
			g1.printingArray(chaArr);
			
		}
		
		
		 <B> void printingArray(B[] arr) {
			for(B ele:arr) {
				System.out.println(ele + " ");
			}
		}

	}