package com.skilldistillery.jets.entities;

import java.util.ArrayList;
import java.util.List;

public class AirField {
	private List<Jet> fleet = new ArrayList<>();
public void Airfield1(Object object){
	for(int i =0; i < fleet.size(); i++) {
		
	}
	
	}

public void displayAirField() {
	for (int i = 0; i < fleet.size(); i++) {
		if(fleet.get(i) instanceof Cargo) {
		System.out.println((i + 1)+ ". " +((Cargo) fleet.get(i)).displayJet());
		}
		if(fleet.get(i) instanceof Fighter) {
		System.out.println((i + 1)+ ". " +((Fighter) fleet.get(i)).displayJet());
		}
		if(fleet.get(i) instanceof Passenger) {
		System.out.println((i + 1)+ ". " +((Passenger) fleet.get(i)).displayJet());
		}
	}
}
public void flyAirField() {
	for (int i = 0; i < fleet.size(); i++) {
		if(fleet.get(i) instanceof Cargo) {
			System.out.println(((Cargo) fleet.get(i)).fly());
		}
		if(fleet.get(i) instanceof Fighter) {
			System.out.println(((Fighter) fleet.get(i)).fly());
		}
		if(fleet.get(i) instanceof Passenger) {
			System.out.println(((Passenger) fleet.get(i)).fly());
		}
	}
}
public void fightAirField() {
	for (int i = 0; i < fleet.size(); i++) {

		if(fleet.get(i) instanceof Combat) {
			((Fighter) fleet.get(i)).fight();
		}
		
	}
}
public void loadAirField() {
	for (int i = 0; i < fleet.size(); i++) {
		if(fleet.get(i) instanceof LoadCargo) {
			((LoadCargo) fleet.get(i)).load();
		}
	}
}
public void fastestAirField() {
    double fastest = 0;
	int jet = 0;
	for (int i = 0; i < fleet.size(); i++) {
		if(fleet.get(i).getMph() > fastest) {
			fastest = (double) fleet.get(i).getMph();
			jet = i;
		}
	}
	System.out.println(fleet.get(jet));
}
public void longestAirField() {
	double longest = 0;
	int jet = 0;
	for (int i = 0; i < fleet.size(); i++) {
		if(fleet.get(i).getRange() > longest) {
			longest = (double) fleet.get(i).getRange();
			jet = i;
		}
	}
	System.out.println(fleet.get(jet));
}

public void removeAirField(int jet) {
	// TODO Auto-generated method stub
	
	fleet.remove(jet);
	
}
public void Airfield(Cargo jet) {
	// TODO Auto-generated method stub
	
		fleet.add(jet);
	
}
public void Airfield(Fighter jet) {
	// TODO Auto-generated method stub
	
	fleet.add(jet);
	
}
public void Airfield(Passenger jet) {
	// TODO Auto-generated method stub
	
	fleet.add(jet);
	
}
	
}

