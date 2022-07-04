package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.Cargo;
import com.skilldistillery.jets.entities.Fighter;
import com.skilldistillery.jets.entities.Passenger;
import com.skilldistillery.jets.entities.Pilot;

public class JetsApplication {
	AirField airfield = new AirField();
	Pilot p = new Pilot();
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		JetsApplication run = new JetsApplication();
		run.newPilot();
		run.newPlane();
		run.menu();
	}

	private void newPlane() {
		String name = "";
		Double mph = 0.0;
		Double range = 0.0;
		Integer price = 0;
		Pilot pilot;
		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] input = new String[5];
				input = line.split(",");
				name = input[1];
				mph = Double.parseDouble(input[2]);
				range = Double.parseDouble(input[3]);
				price = Integer.parseInt(input[4]);
				pilot = p.assignPilot();
				
				if (input[0].equals("cargo")) {
					Cargo output = new Cargo(name, mph, range, price,pilot);
					airfield.Airfield(output);

				} else if (input[0].equals("fighter")) {
					Fighter output = new Fighter(name, mph, range, price,pilot);
					airfield.Airfield(output);

				} else {
					Passenger output = new Passenger(name, mph, range, price,pilot);
					airfield.Airfield(output);

				}

			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	private void newPilot() {
		String name ="";		
		Integer experiance =0;		
		Double salary =0.0;		
		try (BufferedReader bufIn = new BufferedReader(new FileReader("roster.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] input = new String[5];
				input = line.split(",");
				name = input[0];
				experiance =Integer.parseInt(input[1]);
				salary = Double.parseDouble(input[2]);
				Pilot output =new Pilot(name,experiance,salary);
				p.addPilot(output);
			}
		}
				catch (IOException e) {
				System.err.println(e);
			}
		
	}

	private void menu() {
		boolean repeat = true;
		while (repeat) {
			System.out.println("Please Select one of the following options");
			System.out.println("1. List Fleet");
			System.out.println("2. Fly all jets");
			System.out.println("3. View Fastest jet");
			System.out.println("4. View jet with longest range");
			System.out.println("5. Load all cargo jets");
			System.out.println("6. DogFight!");
			System.out.println("7. Add jet to fleet");
			System.out.println("8. Remove jet from fleet");
			System.out.println("9. Fly a single jet");
			System.out.println("10. Quit");
			int input = sc.nextInt();
			switch (input) {
			case 1:
				airfield.displayAirField();
				break;
			case 2:
				airfield.flyAirField();
				break;
			case 3:
				airfield.fastestAirField();
				break;
			case 4:
				airfield.longestAirField();
				break;
			case 5:
				airfield.loadAirField();
				break;
			case 6:
				airfield.fightAirField();
				break;
			case 7:
				newJet();
				break;
			case 8:
				removeJet();
				break;
			case 9:
				 singleJet();
				 break;
			case 10:
				repeat = false;
				break;

			}
		}
	}

	private void newJet() {
		String name = "";
		Double mph = 0.0;
		Double range = 0.0;
		Integer price = 0;
		Integer type = 0;
		Pilot pilot;
		pilot = p.assignPilot();
		System.out.println("Please enter the number of the type of jet you would like to create");
		System.out.println("1. Passenger");
		System.out.println("2. Fighter");
		System.out.println("3. Cargo");
		type = sc.nextInt();
		System.out.println("Enter the name of the jet");
		name = sc.nextLine();
		name = sc.nextLine();
		System.out.println("Enter the speed of the jet");
		mph = sc.nextDouble();
		System.out.println("Enter the range of the jet");
		range = sc.nextDouble();
		System.out.println("Enter the price of the jet");
		price = sc.nextInt();
		if(type == 1) {
		Passenger output = new Passenger(name, mph, range, price,pilot);
		airfield.Airfield(output);
		}
		if(type == 2) {
			Fighter output = new Fighter(name, mph, range, price,pilot);
			airfield.Airfield(output);
		}
		if(type == 3) {
			Cargo output = new Cargo(name, mph, range, price,pilot);
			airfield.Airfield(output);
		}
	}

	private void removeJet() {
		int jet = 0;
		System.out.println("Please enter the number of the jet you would like to remove");
		airfield.displayAirField();
		jet = sc.nextInt();
		airfield.removeAirField(jet - 1);
	}
	private void singleJet() {
		int jet = 0;
		System.out.println("Please enter the number of the jet you would like to fly");
		airfield.displayAirField();
		jet = sc.nextInt();
		airfield.singleAirField(jet - 1);
	}
}
