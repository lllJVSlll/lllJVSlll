package lllJVSlll;

import java.util.Scanner;
import java.util.Random;

public class hangagubbe {

	static int Vinster = 0;
	static int F�rluster = 0;
	static int Omg�ngar = 0;
	// Alla dessa 3 static int anv�nder jag f�r att kunna visa informationen om
	// spelen som spelats,
	// och om man v�ljer att spela igen.

	public static void F�rlust() {
		F�rluster++; // Om man f�rlorar l�ggs det p� en f�rlust som kommer visas n�r man avslutar

	}

	public static void Vinst() {
		Vinster++; // Samma som f�rluster men visar vinster ist�llet

	}

	public static void Runda() {
		Omg�ngar++; // Samma som innan men visar Antal g�nger man har valt att spela
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String[] Ordlista = { "SKOLA", "DATOR", "L�SK", "PANNA", "KLOCKA", "KAFFE", "H�RLURAR", "TELEFON",
				"JORDGUBBE" }; // h�r finns ordlistan och koden som slumpar fram ordet.

		boolean spela = true; // anv�nds f�r att spela igen
		while (spela) {
			System.out.println("V�lkommen till H�nga gubbe!");
			char[] slumpatord = Ordlista[random.nextInt(Ordlista.length)].toCharArray();
			int AntalGissningar = 10;
			char[] SpelarGissning = new char[slumpatord.length];

			for (int i = 0; i < SpelarGissning.length; i++) {
				SpelarGissning[i] = '_';
			}

			boolean GissatOrd = false;
			int f�rs�k = 0;

			while (!GissatOrd && f�rs�k != AntalGissningar) {
				System.out.println("Antal gissningar:" + f�rs�k);
				printArray(SpelarGissning);
				System.out.printf("Du har %d f�rs�k kvar \n", AntalGissningar - f�rs�k);
				System.out.println("Skriv en bokstav:");
				char input = scanner.nextLine().toUpperCase().charAt(0); // hela detta kodblocket visar upp n�dv�ndig information till
															// spelaren.
				// denna information �r antalet gissningar och hur m�nga som finns kvar.
				f�rs�k++;

				if (input == '-') {
					spela = false;
					GissatOrd = true;
				} else {
					for (int i = 0; i < slumpatord.length; i++) {
						if (slumpatord[i] ==input) {
							SpelarGissning[i] = input; // detta kodblock kollar om ordet �r fel eller om det inte �r, om
														// det inte �r fel g�r detta kodblock ingenting.
						}
					}

					if (isTheWordGuessed(SpelarGissning)) {
						GissatOrd = true;
						System.out.println("Grattis du vann!!"); // denna koden kollar om man har gissat r�tt eller inte
						Vinst();
						Omg�ngar++;
					}
				}

			}
			if (!GissatOrd)
				System.out.println("Du har inga fler f�rs�k!");
			F�rlust();
			Omg�ngar++;
			System.out.println("Vill du spela igen? (Ja/Nej");
			String Spelaigen = scanner.nextLine(); // detta kodblock �r kopplat till de andra 2 if satser som finns
													// nedanf�r, det best�mmer om man vill spela igen eller om man vill
													// avsluta.

			if (Spelaigen.equals("Ja"))
				System.out.println("Du valde att spela igen"); // om man v�ljer att spela igen.
			

			if (Spelaigen.equals("Nej")) {
				System.out.println("Du valde att avsluta"); // om man inte vill spela igen.
			System.out.println("Game over..");
			System.out.println("Vinster: " + Vinster + " F�rluster: " + F�rluster + " Omg�ngar: " + Omg�ngar);
			System.exit(0);
			}
		}

		System.out.println("Game over..");
		// detta block �r en forts�ttning p� de �vre kodblocken, detta block visar
		// information som samlats in under speltiden.
		System.out.println("Vinster: " + Vinster + " F�rluster: " + F�rluster + " Omg�ngar: " + Omg�ngar);
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
