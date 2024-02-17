package com.generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildCard {
	
	public static void main(String[] args) {
		List<Integer> l1= new ArrayList<>();
		l1.add(100);
		l1.add(-500);
		System.out.println("-------List of Integer-----------");
		printingArray(l1);
		
		List<Float> l2= new ArrayList<>();
		l2.add(200f);
		l2.add(-300f);
		System.out.println("-------List of Float-----------");
		//printingArray(l2);
		
		List<Double> l3= new ArrayList<>();
		l3.add(50.67890);
		l3.add(-6890.34687482347);
		System.out.println("-------List of Double-----------");
		//printingArray(l3);
		
		List<String> l4= new ArrayList<>();
		l4.add("Tata");
		l4.add("Panther");
		System.out.println("-------List of String-----------");
		//printingArray(l4);
	}
	
	
	static void printingArray(List<? super Integer> listOfElements) {
		for(Object e1:listOfElements) {
			System.out.println(e1);
		}
	}

}
