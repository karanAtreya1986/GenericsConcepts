package com.generics;

public class GenericsMain {
	
	public static void main(String[] args) {
		
		GenericsBasics<Integer> a1=new GenericsBasics<>();
		a1.add(45);
		
		System.out.println(a1.get());
	}

}
