package com.skilldistillery.jets.entities;

public abstract class Jet {
protected String name;
protected double mph;
protected double range;
protected int price;

public void Jet(String name, double mph, double range, int price) {
	
	this.name = name;
	this.mph = mph;
	this.range = range;
	this.price = price;
}

public abstract String fly();public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getMph() {
	return mph;
}

public void setMph(double mph) {
	this.mph = mph;
}

public double getRange() {
	return range;
}

public void setRange(double range) {
	this.range = range;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}
{
}
}

