package de.naumovs.page055;

public abstract class Car {

	private double price;
	private String model;
	private String year;

	public abstract void goFast();

	public abstract void goUpHill();

	public abstract void impressNeighbors();

	// Additional, important, and serious code goes here
	void importantMethod() {
		System.out.println(price);
		System.out.println(model);
		System.out.println(year);
	}
}
