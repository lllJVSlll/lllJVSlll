package lektioner;

import java.util.Scanner;

public class lektion1 {

	public static void main(String[] args) {
	
		// villkor
		
		boolean svar = true;
		int age = 17; // initierat variabel
		
		Scanner input = new Scanner(System.in); //g�r det m�jligt att f� input fr�n konsolen
		
		System.out.println("Hur gammal �r du?");
		age = input.nextInt();
				
		
		 if (age >= 18) { //dvs man j�mf�r i detta fall tv� heltal
			
			System.out.println("Du �r gammal nog att k�ra bil! Grattis din 47a c:");
			System.out.println("Bara s� du vet s� f�r du �ka moppe ocks�!");
			
			}
				else if (age < 14 && age> 18) {
					System.out.println("Du �r f�r ung f�r att k�ra bil men du f�r �ka moppe! C:");
			}
		}
		
	{
		 { //om villkoret inte uppfylls k�rs else
			System.out.println("Tyv�rr, inte gammal nog!");
		}
	}

}