package com.skilldistillery.jets.entities;

public class Passenger extends Jet {

	public Passenger(String name, Double mph, Double range, Integer price, Pilot pilot) {
		super.Jet(name, mph, range, price, pilot);
		}
	
	public void Jet(String name, double mph, double range, int price, Pilot pilot) {
		super.Jet(name, mph, range, price, pilot);
	}
	
	@Override
	public String toString() {
		return "Type : Passenger, Name: " + name + ", MPH: " + mph + ", Range: " + range + ", Price: " + price +"\n   Pilot: " + pilot;
	}
	@Override
	public String fly() {
		return "The " + name + " took off and flew for " + (range / mph) + "hours before having to land";
	}

}
