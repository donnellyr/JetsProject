package com.skilldistillery.jets.entities;

public class Cargo extends Jet implements LoadCargo {

	public Cargo(String name, Double mph, Double range, Integer price, Pilot pilot) {
		super.Jet(name, mph, range, price, pilot);
	}

	@Override
	public void Jet(String name, double mph, double range, int price, Pilot pilot) {
		super.Jet(name, mph, range, price, pilot);
	}

	public String displayJet() {
		return "Type : Passenger Name: " + name + ", MPH: " + mph + ", Range: " + range + ", Price: " + price ;
	}

	@Override
	public String toString() {
		return "Type : Cargo, Name: " + name + ", MPH: " + mph + ", Range: " + range + ", Price: " + price +"\n   Pilot: " + pilot;
	}

	@Override
	public void load() {
		System.out.println("The " + name + " loads up its cargo for the " + range + " mile trip");

	}

	public String fly() {
		return "The " + name + " took off and flew for " + (range / mph) + "hours before having to land";

	}

}
