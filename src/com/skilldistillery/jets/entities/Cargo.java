package com.skilldistillery.jets.entities;

public class Cargo extends Jet implements LoadCargo {
	

	public Cargo(String name, Double mph, Double range, Integer price) {
	super.Jet(name, mph, range, price);
	}
	@Override
	public void Jet(String name, double mph, double range, int price) {
		// TODO Auto-generated method stub
		super.Jet(name, mph, range, price);
//		addJet(name, mph, range, price);
		
	}
//	public Cargo addJet(String name, double mph, double range, int price) {
//		cargo = name + range + range + price;
//		return cargo;
//	}
//	
	public String displayJet() {
		return "Cargo [name=" + name + ", mph=" + mph + ", range=" + range + ", price=" + price;
	}

	@Override
	public String toString() {
		return "Cargo [name=" + name + ", mph=" + mph + ", range=" + range + ", price=" + price;
	}
	@Override
	public void load() {
		System.out.println("The " + name + " loads up its cargo for the " + range + " mile trip");

	}

	
	public String fly() {
		return "The " + name + " took off and flew for " + (range / mph) + "hours before having to land";

	}

}
