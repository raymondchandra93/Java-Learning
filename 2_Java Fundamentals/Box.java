package com.lq.exercises;


public class Box {
	
	private double height;
	private double width;
	private double length;
	
	public Box(double height, double width, double length) {
		super();
		this.height = height;
		this.width = width;
		this.length = length;
	}
	
	public Box(double number) {
		super();
		this.height = number;
		this.width = number;
		this.length = number;
	}
	
	public double getVolume() {
		double volume = height*width*length;
		
		return volume;
	}
	
	public double getSurfaceArea() {
		double area1 = height*width*2;
		double area2 = height*length*2;
		double area3 = length*width*2;
		
		return area1+area2+area3;
	}
	
	public void printBox() {
		if (length <= 0 || width <=0 || height <=0) {
			System.out.println("Invalid");
		} else {
			System.out.println("Length: " + length);
			System.out.println("Width: " + width);
			System.out.println("Height: " + height);
			System.out.println("Volume: " + this.getVolume());
			System.out.println("Surface Area: " + this.getSurfaceArea());
		}
	}
	
	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}
	
	public static void main(String[] args) {
		Box box1 = new Box(5, 6, 7);
		box1.printBox();
	}
}