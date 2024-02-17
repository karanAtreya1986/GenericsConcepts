package com.generics;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundedWildCard {
	
	abstract class Shape{
		abstract void draw();
	}
	
	class Rectangle extends Shape{

		@Override
		void draw() {
			System.out.println("Rectangle over rides the method");
			
		}
	}
	
	class Circle extends Shape{

		@Override
		void draw() {
			System.out.println("Circle over rides the method");
			
		}	
	}
	
	static void drawShapes(List<? extends Shape> listOfShapes) {
		for(Shape s1:listOfShapes) {
			s1.draw();
		}
	}

	public static void main(String[] args) {
		List<Rectangle> l1=new ArrayList<>();
		UpperBoundedWildCard u1=new UpperBoundedWildCard();
		l1.add(u1.new Rectangle());
		l1.add(u1.new Rectangle());
		System.out.println("--------RECTANGLE CHECK----------");
		drawShapes(l1);
		
		List<Circle> l2=new ArrayList<>();
		l2.add(u1.new Circle());
		l2.add(u1.new Circle());
		System.out.println("--------CIRCLE CHECK----------");
		drawShapes(l2);
		
		
		
	}
}
