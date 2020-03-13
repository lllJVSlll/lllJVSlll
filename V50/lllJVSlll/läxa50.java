package lllJVSlll;

import java.util.Scanner;

public class läxa50 {

	public static void main(String[] args) throws InterruptedException {

		Scanner input = new Scanner(System.in);
		int choice;

		System.out.println("Välkommen! Välj alternativ för information mm: ");
		System.out.println("(1) - Pistoler");
		System.out.println("(2) - Tyngre");
		System.out.println("(3) - SMG");
		System.out.println("(4) - Gevär");
		System.out.println("(5) - Prickskyttegevär");
		System.out.println();

		choice = input.nextInt();

		switch (choice) {

		case 1:
			System.out.println("Pistoler laddar..");

			Thread.sleep(2000);
			
			System.out.println("Pistoler har laddat!");
			System.out.println("(1) - Glock-18 / USP-S");
			System.out.println("(1) - Dual Berettas");
			System.out.println("(1) - P250");
			System.out.println("(1) - Five-Seven / CZ-75 AUTO");
			System.out.println("(1) - Desert Eagle / R8 Revolver");
			
			break;

		case 2:
			System.out.println("Tyngre vapen laddar..");

			Thread.sleep(1500);
			
			System.out.println("(1) - Nova");
			System.out.println("(1) - XM1014");
			System.out.println("(1) - MAG-7 / Sawed-Off");
			System.out.println("(1) - P250");
			System.out.println("(1) - P250");
			
			break;

		case 3:
			System.out.println("SMG:s laddar..");
			
			Thread.sleep(1500);

			System.out.println("(1) - MP9");
			System.out.println("(2) - MP7/MP5");
			System.out.println("(1) - UMP-45");

			break;

		case 4:
			System.out.println("Gevär laddar..");

			Thread.sleep(1500);
			
			break;

		case 5:
			System.out.println("Prickskyttegevären laddar..");
			Thread.sleep(1500);
			

		default:
			System.out.println("Välj siffra 1-5 jävla mongolid");

		}
	}

}
