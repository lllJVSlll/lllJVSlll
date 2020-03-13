package lllJVSlll;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class talspelet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in); // gör så att användaren kan skriva in i konsolen
		int choice; // skapar en variabel som gör så att en switch case fungerar
		boolean spelaigen = true; // används för att kunna göra en do while loop
		do {

			System.out.println("Välkommen! Välj svårighetsgrad: "); // alla dessa är olika val för användaren, i detta fallet svårighetsgrad
			System.out.println("(1) - Enkelt");
			System.out.println("(2) - Meduim");
			System.out.println("(3) - Svårt");
			System.out.println();

			choice = input.nextInt();

			switch (choice) {

			case 1:
				System.out.println(
						"Du har valt enkel svårighetsgrad, du ska gissa ett tal mellan 1-50, du har 20 försök på dig!");
				Thread.sleep(1500); // Denna gör att det fördröjer en liten stund.

				Scanner input1 = new Scanner(System.in);

				int min = 1; // Båda dessa int sätter vilka tal det är som användaren spelar
				int max = 50;

				int slumpatnummer = (int) (Math.random() * ((max - min) + 1) + min); // Slumpgenerator mellan int min
																						// och int max

				int gissningar = 1;

				for (int i = 20; i > gissningar; gissningar++) { // min for loop som gör att användaren kan gissa ett flertal gånger men även så att det finns en gräns för hur
					//många gånger användaren kan gissa.
					
					int tal1 = 0;

					tal1 = input.nextInt();

					try {        // en try catch metod som gör att om användaren skriver in fel så visar den fel och säger vad felet är.

					} catch (Exception e) {
						input.next();
						System.out.println("Det måste vara ett nummer!");
						System.out.println(e);
						gissningar--;
					}
					

					if (tal1 == slumpatnummer) {   // en if sats som ger spelet sina regler som ska följas men även stammen i hela koden, den visar om man ska gissa högre eller 
						// lägre, om användaren vill spela igen.

						System.out.println("Grattis! du vann :)");
						System.out.println("Antal gissningar: " + gissningar);
						Thread.sleep(2000);
						System.out.println("Vill du spela igen? skriv '1' om ja, annars valfri siffra om nej");

						if (input.nextInt() != 1) {
							spelaigen = false;
						}
					} else if (slumpatnummer < tal1) {
						System.out.println("Gissa lägre!");
						System.out.println("Antal gissningar: " + gissningar);
					}

					else if (slumpatnummer > tal1) {
						System.out.println("Gissa högre!");
						System.out.println("Antal gissningar: " + gissningar);

					}
				}

				break;

			case 2:
				System.out.println(
						"Du har valt medium svårighetsgrad, du ska gissa ett tal mellan 1-50, du har 15 försök på dig!");
				Thread.sleep(1500);
				Scanner input2 = new Scanner(System.in);

				int min1 = 1; // Båda dessa int sätter vilka tal det är som användaren spelar
				int max1 = 50;

				int slumpatnummer1 = (int) (Math.random() * ((max1 - min1) + 1) + min1); // Slumpgenerator mellan int
																							// min och int max

				int gissningar1 = 1;

				for (int i = 15; i > gissningar1; gissningar1++) {
					int tal2 = 0;

					tal2 = input.nextInt();

					try {

					} catch (Exception e) {
						input.next();
						System.out.println("Det måste vara ett nummer!");
						System.out.println(e);
						gissningar1--;
					}

					if (tal2 == slumpatnummer1) {

						System.out.println("Grattis! du vann :)");
						System.out.println("Antal gissningar: " + gissningar1);
						Thread.sleep(2000);
						System.out.println("Vill du spela igen?");
						System.out.println("Vill du spela igen? skriv '1' om ja, annars valfri siffra om nej");

						if (input.nextInt() != 1) {
							spelaigen = false;
						} else if (slumpatnummer1 < tal2) {
							System.out.println("Gissa lägre!");
							System.out.println("Antal gissningar: " + gissningar1);
						}

						else if (slumpatnummer1 > tal2) {
							System.out.println("Gissa högre!");
							System.out.println("Antal gissningar: " + gissningar1);

						}
					}
				}
				break;

			case 3:
				System.out.println(
						"Du har valt svårt som svårighetsgrad, du ska gissa ett tal mellan 1-50, du har 8 försök på dig!");
				Thread.sleep(1500);
				Scanner input3 = new Scanner(System.in);

				int min2 = 1; // Båda dessa int sätter vilka tal det är som användaren spelar
				int max2 = 50;

				int slumpatnummer2 = (int) (Math.random() * ((max2 - min2) + 1) + min2); // Slumpgenerator mellan int
																							// min och int max

				int gissningar2 = 1;

				for (int i = 15; i > gissningar2; gissningar2++) {
					int tal3 = 0;

					tal3 = input.nextInt();

					try {

					} catch (Exception e) {
						input.next();
						System.out.println("Det måste vara ett nummer!");
						System.out.println(e);
						gissningar2--;
					}

					if (tal3 == slumpatnummer2) {

						System.out.println("Grattis! du vann :)");
						System.out.println("Antal gissningar: " + gissningar2);
						Thread.sleep(2000);
						System.out.println("Vill du spela igen?");
						System.out.println("Vill du spela igen? skriv '1' om ja, annars valfri siffra om nej");

						if (input.nextInt() != 1) {
							spelaigen = false;

						} else if (slumpatnummer2 < tal3) {
							System.out.println("Gissa lägre!");
							System.out.println("Antal gissningar: " + gissningar2);
						}

						else if (slumpatnummer2 > tal3) {
							System.out.println("Gissa högre!");
							System.out.println("Antal gissningar: " + gissningar2);

						}
					}
					break;

				}

			}

		} while (spelaigen);
	}
}
