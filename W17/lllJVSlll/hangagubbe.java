package lllJVSlll;

import java.util.Scanner;
import java.util.Random;

public class hangagubbe {

	static int Vinster = 0;
	static int Förluster = 0;
	static int Omgångar = 0;
	// Alla dessa 3 static int använder jag för att kunna visa informationen om
	// spelen som spelats,
	// och om man väljer att spela igen.

	public static void Förlust() {
		Förluster++; // Om man förlorar läggs det på en förlust som kommer visas när man avslutar

	}

	public static void Vinst() {
		Vinster++; // Samma som förluster men visar vinster istället

	}

	public static void Runda() {
		Omgångar++; // Samma som innan men visar Antal gånger man har valt att spela
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String[] Ordlista = { "SKOLA", "DATOR", "LÄSK", "PANNA", "KLOCKA", "KAFFE", "HÖRLURAR", "TELEFON",
				"JORDGUBBE" }; // här finns ordlistan och koden som slumpar fram ordet.

		boolean spela = true; // används för att spela igen
		while (spela) {
			System.out.println("Välkommen till Hänga gubbe!");
			char[] slumpatord = Ordlista[random.nextInt(Ordlista.length)].toCharArray();
			int AntalGissningar = 10;
			char[] SpelarGissning = new char[slumpatord.length];

			for (int i = 0; i < SpelarGissning.length; i++) {
				SpelarGissning[i] = '_';
			}

			boolean GissatOrd = false;
			int försök = 0;

			while (!GissatOrd && försök != AntalGissningar) {
				System.out.println("Antal gissningar:" + försök);
				printArray(SpelarGissning);
				System.out.printf("Du har %d försök kvar \n", AntalGissningar - försök);
				System.out.println("Skriv en bokstav:");
				char input = scanner.nextLine().toUpperCase().charAt(0); // hela detta kodblocket visar upp nödvändig information till
															// spelaren.
				// denna information är antalet gissningar och hur många som finns kvar.
				försök++;

				if (input == '-') {
					spela = false;
					GissatOrd = true;
				} else {
					for (int i = 0; i < slumpatord.length; i++) {
						if (slumpatord[i] ==input) {
							SpelarGissning[i] = input; // detta kodblock kollar om ordet är fel eller om det inte är, om
														// det inte är fel gör detta kodblock ingenting.
						}
					}

					if (isTheWordGuessed(SpelarGissning)) {
						GissatOrd = true;
						System.out.println("Grattis du vann!!"); // denna koden kollar om man har gissat rätt eller inte
						Vinst();
						Omgångar++;
					}
				}

			}
			if (!GissatOrd)
				System.out.println("Du har inga fler försök!");
			Förlust();
			Omgångar++;
			System.out.println("Vill du spela igen? (Ja/Nej");
			String Spelaigen = scanner.nextLine(); // detta kodblock är kopplat till de andra 2 if satser som finns
													// nedanför, det bestämmer om man vill spela igen eller om man vill
													// avsluta.

			if (Spelaigen.equals("Ja"))
				System.out.println("Du valde att spela igen"); // om man väljer att spela igen.
			

			if (Spelaigen.equals("Nej")) {
				System.out.println("Du valde att avsluta"); // om man inte vill spela igen.
			System.out.println("Game over..");
			System.out.println("Vinster: " + Vinster + " Förluster: " + Förluster + " Omgångar: " + Omgångar);
			System.exit(0);
			}
		}

		System.out.println("Game over..");
		// detta block är en fortsättning på de övre kodblocken, detta block visar
		// information som samlats in under speltiden.
		System.out.println("Vinster: " + Vinster + " Förluster: " + Förluster + " Omgångar: " + Omgångar);
	}

	public static void printArray(char[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static boolean isTheWordGuessed(char[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == '_')
				return false;
		}
		return true;
	}

}
