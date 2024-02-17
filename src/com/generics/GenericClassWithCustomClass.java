package com.generics;

public class GenericClassWithCustomClass <c>{
	
	c var;
	
	void add(c var) {
		this.var=var;
	}
	
	c get(){
		return var;
	}

	public static void main(String[] args) {
		GenericClassWithCustomClass<EmployeeCustom> e1=new GenericClassWithCustomClass<>();
		e1.add(new EmployeeCustom(99));
		e1.add(new EmployeeCustom(-178));
		EmployeeCustom o1=e1.get();
		System.out.println(o1); // this will print memory address because this is oops.
		// in collections, just printing object name results in correct output.
		System.out.println(o1.getId());
		
	}
}
