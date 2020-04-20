package com.revature.driver;

import java.util.Scanner;
import com.revature.beans.Warrior;
import com.revature.beans.Wizard;

public class Driver {
	
	
	//If and IfElse Statements
	static int warPower;
	
	public static void determineWarPower(int warWeight, int warHeight) {
		if (warWeight * warHeight > 500) {
			warPower=1;
		}else {
			warPower=0;
		}
	}
	
	static int wizPower;
	
	public static void determineWizPower(int wizAge) {
		if (wizAge > 100) {
			wizPower=1;
		}else {
			wizPower=0;
		}
	}
	
	static int warWeaponPower;
	
	public static void determineWarWeaponPower (String warWeapon) {
		if (warWeapon.equals("Sword")) {
			 warWeaponPower=5;
		}else if (warWeapon.equals("Bow")) {
			 warWeaponPower=3;
		}else if (warWeapon.equals("Axe")) {
			 warWeaponPower=10;	
		}
	}
	
	static int wizWeaponPower;
	
	public static void determineWizWeaponPower(String wizWeapon) {
		if (wizWeapon.equals("Staff")) {
			wizWeaponPower=3;
		}else if (wizWeapon.equals("Wand")) {
			wizWeaponPower=3;
		}else if (wizWeapon.equals("Unarmed")) {
			wizWeaponPower=6;
		}
	}
	
	static double wizElementDamage;
	
	public static void determineWizElementDamage (String wizElement) {
		if (wizElement.equals("Fire")) {
			wizElementDamage=0.3;
		}else if (wizElement.equals("Lightning")) {
			wizElementDamage=0.4;
		}else if (wizElement.equals("Frost")) {
			wizElementDamage=0.5;
		}
	}
	//End If and IfElse Statements
	
	//Overloading statements
	public static void multiply (int a, int b) {
		System.out.println(a*b);
	}
	public static void multipy (double a, double b) {
		System.out.println(a*b);
	}
	public static void multiply (short a, short b) {
		System.out.println(a*b);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Warrior war = new Warrior();
		Wizard wiz = new Wizard();
		
		System.out.println("Build your Warrior:");
		System.out.println("Are they Male or Female?");
		String warSpecs = sc.next();
		//Switch Cases
		switch (warSpecs) {
			case "Male": {
				System.out.println("What is his name?");
				String warName = sc.next(); //instantiate object using the scanner
				war.setName(warName);
				System.out.println("What is his weight?");
				int warWeight = sc.nextInt();
				war.setWeight(warWeight);
				System.out.println("What is his height?");
				int warHeight = sc.nextInt();
				war.setHeight(warHeight);
				System.out.println("Choose your weapon: Sword, Bow, Axe");
				String warWeapon = sc.next();
				war.setWeapon(warWeapon);
					switch (warWeapon) {
					case "Sword": {
						System.out.println("You have chosen a balanced Sword");
					}
					break;
					case "Bow": {
						System.out.println("You have chosen a fast Bow");
					}
					break;
					case "Axe":{
						System.out.println("You have chosen a devastating Axe");
					}
					break;
					default:{
						System.out.println("Please choose again.");
					}
				}				
			}
			break;
			case "Female": {
				System.out.println("What is her name?");
				String warName = sc.nextLine();
				war.setName(warName);
				System.out.println("What is her weight?");
				int warWeight = sc.nextInt();
				war.setWeight(warWeight);
				System.out.println("What is her height?");
				int warHeight = sc.nextInt();
				war.setHeight(warHeight);
				System.out.println("Choose your weapon: Sword, Bow, Axe");
				String warWeapon =  sc.next();
				war.setWeapon(warWeapon);
					switch (warWeapon) {
					case "Sword": {
						System.out.println("You have chosen a balanced Sword");
					}
					break;
					case "Bow": {
						System.out.println("You have chosen a fast Bow");
					}
					break;
					case "Axe":{
						System.out.println("You have chosen a devastating Axe");
					}
					break;
					default:{
						System.out.println("Please choose again.");
					}
				}				
			}
			break;
			default:{
				System.out.println("Please choose Male or Female (Case Sensitive)");
			}
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("Build your Wizard:");
		System.out.println("Are they Male or Female?");
		String wizSpecs = sc.next();
		switch (wizSpecs) {
			case "Male": {
				System.out.println("What is his name?");
				String wizName = sc.next();
				wiz.setName(wizName);
				System.out.println("What is his age?");
				int wizAge = sc.nextInt();
				wiz.setAge(wizAge);
				System.out.println("Choose your weapon: Staff, Wand, Unarmed");
				String wizWeapon =  sc.next();
				wiz.setWeapon(wizWeapon);
					switch (wizWeapon) {
					case "Staff": {
						System.out.println("You have chosen a balanced Staff");
					}
					break;
					case "Wand": {
						System.out.println("You have chosen a fast Wand");
					}
					break;
					case "Unarmed":{
						System.out.println("You have chosen two-handed Unarmed Technique");
					}
					break;
					default:{
						System.out.println("Please choose again. (Case Sensitive)");
					}
				}
				System.out.println("Choose your element: Fire, Frost, Lightning");
				String wizElement = sc.next();
				wiz.setElement(wizElement);
					switch (wizElement) {
					case "Fire": {
						System.out.println("You have chosen damaging Fire");
						}break;
					case "Frost": {
						System.out.println("You have chosen debilitation Frost");
						}break;
					case "Lightning": {
						System.out.println("You have chosen stunning Lightning");
						}break;
					default:
						System.out.println("Please choose again. (Case Sensitive");
					}
				}
			case "Female": {
				System.out.println("What is her name?");
				String wizName = sc.next();
				wiz.setName(wizName);
				System.out.println("What is her age?");
				int wizAge = sc.nextInt();
				wiz.setAge(wizAge);
				System.out.println("Choose your weapon: Staff, Wand, Unarmed");
				String wizWeapon =  sc.next();
				wiz.setWeapon(wizWeapon);
					switch (wizWeapon) {
					case "Staff": {
						System.out.println("You have chosen a balanced Staff");
					}
					break;
					case "Wand": {
						System.out.println("You have chosen a fast Wand");
					}
					break;
					case "Unarmed":{
						System.out.println("You have chosen two-handed Unarmed Technique");
					}
					break;
					default:{
						System.out.println("Please choose again. (Case Sensitive)");
					}break;
				}
				System.out.println("Choose your element: Fire, Frost, Lightning");
				String wizElement = sc.next();
				wiz.setElement(wizElement);
					switch (wizElement) {
					case "Fire": {
						System.out.println("You have chosen damaging Fire");
						}break;
					case "Frost": {
						System.out.println("You have chosen debilitation Frost");
						}break;
					case "Lightning": {
						System.out.println("You have chosen stunning Lightning");
						}break;
					default:
						System.out.println("Please choose again. (Case Sensitive");
					}break;
				}
			default: {
				System.out.println("Please choose Male or Female. (Case-sensitive)");
			}
		}
		//End Switch Statements
		
		System.out.println("Welcome to the Arena!");
		System.out.println("Today's spectacle will be between the Warrior " + war.getName() + ", and the Wizard " + wiz.getName() + "!");
		
		determineWarPower(war.getHeight(), war.getWeight());
		//System.out.println(warPower);
		determineWizPower(wiz.getAge());
		//System.out.println(wizPower);
		determineWarWeaponPower(war.getWeapon());
		//System.out.println(war.getWeapon());
		//System.out.println(warWeaponPower);
		determineWizWeaponPower(wiz.getWeapon());
		determineWizElementDamage(wiz.getElement());
		System.out.println("The battle will be intense!");
		if (((warPower*warWeaponPower)*wizElementDamage)>(wizPower*wizWeaponPower)) {
			System.out.println(war.getName() + " is the Winner!");
		}else if (((warPower*warWeaponPower)*wizElementDamage)<(wizPower*wizWeaponPower)) {
			System.out.println(wiz.getName() + " is the Winner!");
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("I got carried away having fun, here is the last couple of things required for the assignment:");
		
		//while loop
		int x = 0;
		while (x<20) {
			System.out.println(x);
			x=x+5;
		}
		//do while loop
		int y = 10;
		do 
			System.out.println(y);
			while (y<5);{
			y++;
		}
		//for loop
		for (int z = 0; z<10; z++) {
			System.out.println(z);
		}
		//Overloading
		int a;
		double b;
		a=2;
		b=3;
		multiply(a,b);
	}
}

