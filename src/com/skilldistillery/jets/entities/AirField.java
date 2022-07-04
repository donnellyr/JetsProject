package com.skilldistillery.jets.entities;

import java.util.ArrayList;
import java.util.List;

public class AirField {
	private List<Jet> fleet = new ArrayList<>();

	public void displayAirField() {
		for (int i = 0; i < fleet.size(); i++) {
			System.out.println((i + 1) + ". " + (fleet.get(i)).toString());
		}
	}

	public void flyAirField() {
		for (int i = 0; i < fleet.size(); i++) {
			System.out.println(fleet.get(i).fly());
		}
	}

	public void fightAirField() {
		for (int i = 0; i < fleet.size(); i++) {

			if (fleet.get(i) instanceof Combat) {
				((Combat) fleet.get(i)).fight();
			}

		}
	}

	public void loadAirField() {
		for (int i = 0; i < fleet.size(); i++) {
			if (fleet.get(i) instanceof LoadCargo) {
				((LoadCargo) fleet.get(i)).load();
			}
		}
	}

	public void fastestAirField() {
		double fastest = 0;
		int jet = 0;
		for (int i = 0; i < fleet.size(); i++) {
			if (fleet.get(i).getMph() > fastest) {
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
			if (fleet.get(i).getRange() > longest) {
				longest = (double) fleet.get(i).getRange();
				jet = i;
			}
		}
		System.out.println(fleet.get(jet));
	}

	public void removeAirField(int jet) {

		fleet.remove(jet);

	}
	public void singleAirField(int jet) {
		
		System.out.println(fleet.get(jet).fly());
		
	}

	public void Airfield(Cargo jet) {

		fleet.add(jet);

	}

	public void Airfield(Fighter jet) {

		fleet.add(jet);

	}

	public void Airfield(Passenger jet) {

		fleet.add(jet);

	}

}
