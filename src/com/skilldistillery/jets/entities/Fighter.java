package com.skilldistillery.jets.entities;

public class Fighter extends Jet implements Combat {
	public Fighter(String name, Double mph, Double range, Integer price, Pilot pilot) {
		super.Jet(name, mph, range, price, pilot);
		}
	@Override
	public void Jet(String name, double mph, double range, int price, Pilot pilot) {
		super.Jet(name, mph, range, price, pilot);
	}
	public String displayJet() {
		return "Fighter [name=" + name + ", mph=" + mph + ", range=" + range + ", price=" + price;
	}
	@Override
	public String toString() {
		return "Type : Fighter, Name: " + name + ", MPH: " + mph + ", Range: " + range + ", Price: " + price +"\n   Pilot: " + pilot;
	}

	@Override
	public  void fight() {
		System.out.println("The " + name + " rushes into combat $" + price + " put to good use");
		
	}

	@Override
	public String fly() {
		return "The " + name + " took off and flew for " + (range / mph) + "hours before having to land";

		
	}

}
