package com.skilldistillery.jets.entities;

public class Passenger extends Jet {

	public Passenger(String name, Double mph, Double range, Integer price) {
		super.Jet(name, mph, range, price);
		}
	
	public void Jet(String name, double mph, double range, int price) {
		super.Jet(name, mph, range, price);
	}
	public String displayJet() {
		return "Passenger [name=" + name + ", mph=" + mph + ", range=" + range + ", price=" + price;
	}

	@Override
	public String toString() {
		return "Passenger [name=" + name + ", mph=" + mph + ", range=" + range + ", price=" + price + "]";
	}
	@Override
	public String fly() {
		return "The " + name + " took off and flew for " + (range / mph) + "hours before having to land";
	}

}
