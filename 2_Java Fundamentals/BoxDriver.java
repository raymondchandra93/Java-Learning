package com.lq.exercises;


public class BoxDriver {
	
	
	public static void main(String[] args) {
		Box box1 = new Box(5, 6, 7);
		Box box2 = new Box(10);
		
		System.out.println("Box1 length is " + box1.getLength());
		System.out.println("Box1 width is " + box1.getWidth());
		System.out.println("Box1 height is " + box1.getHeight());
		
		System.out.println("Box2 length is " + box2.getLength());
		System.out.println("Box2 width is " + box2.getWidth());
		System.out.println("Box2 height is " + box2.getHeight());
	}
}