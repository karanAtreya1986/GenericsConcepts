package com.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class UnBoundedWildCard {
	
	public static void main(String[] args) {
		
		List<Integer> l1=new ArrayList<>();
		l1.add(99);
		l1.add(-189);
		System.out.println("-----------Integer Array List to be printed-----------");
		printingCollections(l1);
		
		List<String> l2=new LinkedList<>();
		l2.add("Tata");
		l2.add("Tiger");
		System.out.println("-----------String Link List to be printed-----------");
		printingCollections(l2);
		
	}
	
	static void printingCollections(Collection<?> eleToBePrinted) {
		for(Object o:eleToBePrinted) {
			System.out.println(o.getClass().getCanonicalName() + " " + o);
		}
	}

}
