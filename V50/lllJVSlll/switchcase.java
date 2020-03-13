package lllJVSlll;

import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int choice;

		System.out.println("Välkommen! Välj någon av dessa alternativ: ");
		System.out.println("(1) - New Game");
		System.out.println("(2) - Load Game");
		System.out.println("(3) - Options");
		System.out.println("(4) - Credits");
		System.out.println("(5) - Quit");
		System.out.println();

		choice = input.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Spelet startar...");

			break;

		case 2:
	System.out.println("Välj vilken save du vill starta...");

			break;

		case 3:
			System.out.println("Ljud, kontroller");

			break;

		case 4:
			System.out.println("Johan Simonsen ");

			break;

		case 5:
System.out.println("Spelet avslutas");
			
			break;

		default:
			System.out.println("Välj en siffra mellan 1-5 din kelb");
			break;
		}
	}

}
