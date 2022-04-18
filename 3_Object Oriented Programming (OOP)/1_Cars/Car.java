package com.lq.exercises;

import java.time.LocalDate;
import java.time.Period;

public class Car {
	
	private String name;
	private int speed;
	private int gasoline;
	private boolean engineState;
	private LocalDate manufactured;
	
	public Car() {
		
	}
	
	public Car(String name) {
		this.name = name;
	}
	
	public Car(String name, int speed, int gasoline, boolean engineState) {
		this.name = name;
		this.speed = speed;
		this.gasoline = gasoline;
		this.engineState = engineState;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public LocalDate getManufactured() {
		return manufactured;
	}

	public void setManufactured(LocalDate manufactured) {
		this.manufactured = manufactured;
	}
	
	public int getAge() {
		return Period.between(getManufactured(), LocalDate.now()).getYears();
	}
	
	public static void main(String[] args) {
		Car car54 = new Car();
		
		car54.setName("Car 54");
		car54.setSpeed(250);
		car54.setManufactured(LocalDate.of(1961, 9, 17));
		
		for(Car car: new Car[] {car54}) {
			System.out.printf("%s is %d years old and is traveling at %d mph%n", 
				car.getName(), car.getAge(), car.getSpeed());
		}
	}

}
