package com.skilldistillery.jets.entities;

import java.util.ArrayList;
import java.util.List;

public class Pilot {
private List<Pilot> roster = new ArrayList<>();
private String name;
private int experiance;
private double salary;
public String getName() {
	return name;
}
public Pilot(String name, int experiance, double salary) {
	super();
	this.name = name;
	this.experiance = experiance;
	this.salary = salary;
}
public Pilot() {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return name + ", Experiance: "  + experiance + ", salary: " + salary + "\n";
}
public void setName(String name) {
	this.name = name;
}
public int getExperiance() {
	return experiance;
}
public void setExperiance(int experiance) {
	this.experiance = experiance;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public void addPilot(Pilot pilot) {
	roster.add(pilot);
}
public Pilot assignPilot() {
	double r =  Math.random() * (roster.size());
	Pilot pilot = roster.get((int)r);
	roster.remove((int)r);
	return pilot;
}

}
