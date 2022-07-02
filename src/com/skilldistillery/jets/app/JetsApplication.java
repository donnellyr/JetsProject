package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.Cargo;
import com.skilldistillery.jets.entities.Fighter;
import com.skilldistillery.jets.entities.Passenger;

public class JetsApplication {
//	Cargo cargo = new Cargo();
//	Fighter fighter = new Fighter();
//	Passenger passenger = new Passenger();
	AirField airfield = new AirField();
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		JetsApplication run = new JetsApplication();
		run.newPlane(); 
		run.menu();
	}

	private void newPlane() {
		String name ="";
		Double mph = 0.0;
		Double range =0.0;
		Integer price =0;
		try ( BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt")) ) {
			  String line;
			  while ((line = bufIn.readLine()) != null) {
			   String[] test = new String[5];
				  test = line.split(",");
				  name = test[1]; 
				  mph =  Double.parseDouble(test[2]); 
				  range =  Double.parseDouble(test[3]); 
				  price =  Integer.parseInt(test[4]); 
				  if(test[0].equals("cargo")) {
					Cargo output = new Cargo(name,mph,range,price);
					 airfield.Airfield(output);
					  
				  }
				  else if(test[0].equals("fighter")) {
					  Fighter output = new Fighter(name,mph,range,price);
					  airfield.Airfield(output);
					  
				  }
				  else {
					  Passenger output = new Passenger(name,mph,range,price);
					  airfield.Airfield(output);
					  
			  }
			   
			  }
			}
			catch (IOException e) {
			  System.err.println(e);
			}
	}
	private void menu() {
		boolean repeat =true;
		while(repeat) {
		System.out.println("Please Select one of the following options");
		System.out.println("1. List Fleet");
		System.out.println("2. Fly all jets");
		System.out.println("3. View Fastest jet");
		System.out.println("4. View jet with longest range");
		System.out.println("5. Load all cargo jets");
		System.out.println("6. DogFight!");
		System.out.println("7. Add jet to fleet");
		System.out.println("8. Remove jet from fleet");
		System.out.println("9. Quit");
		int input = sc.nextInt();
		switch(input) { 
		case 1: airfield.displayAirField();
			break;
		case 2: airfield.flyAirField();
		break;
		case 3: airfield.fastestAirField();
		break;
		case 4: airfield.longestAirField();
		break;
		case 5: airfield.loadAirField();
		break;
		case 6: airfield.fightAirField();
		break;
		case 7: newJet();
		break;
		case 8: removeJet();
		break;
		case 9: repeat = false;
		break;

		}
		}
	}
	private void newJet() {
		String name ="";
		Double mph = 0.0;
		Double range =0.0;
		Integer price =0;
		System.out.println("Enter the name of the jet");
		name = sc.nextLine();
		name = sc.nextLine();
		System.out.println("Enter the speed of the jet");
		mph = sc.nextDouble();
		System.out.println("Enter the range of the jet");
		range = sc.nextDouble();
		System.out.println("Enter the price of the jet");
		price = sc.nextInt();
		
		Passenger output = new Passenger(name,mph,range,price);
		airfield.Airfield(output);
	}
	private void removeJet() {
		int jet = 0;
		System.out.println("Please enter the number of the jet you would like to remove");
		airfield.displayAirField();
		jet = sc.nextInt();
		airfield.removeAirField(jet - 1);
	}
}
