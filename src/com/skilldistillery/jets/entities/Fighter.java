package com.skilldistillery.jets.entities;

public class Fighter extends Jet implements Combat {
	public Fighter(String name, Double mph, Double range, Integer price) {
		super.Jet(name, mph, range, price);
		}
	@Override
	public void Jet(String name, double mph, double range, int price) {
		// TODO Auto-generated method stub
		super.Jet(name, mph, range, price);
	}
	public String displayJet() {
		return "Fighter [name=" + name + ", mph=" + mph + ", range=" + range + ", price=" + price;
	}
	@Override
	public String toString() {
		return "Fighter [name=" + name + ", mph=" + mph + ", range=" + range + ", price=" + price + "]";
	}

	@Override
	public  void fight() {
		System.out.println("The " + name + " rushes into combat $" + price + " put to good use");
		
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "The " + name + " took off and flew for " + (range / mph) + "hours before having to land";

		
	}

}
