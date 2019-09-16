package lektioner;

import java.util.Scanner;

public class lektion1 {

	public static void main(String[] args) {
	
		// villkor
		
		boolean svar = true;
		int age = 17; // initierat variabel
		
		Scanner input = new Scanner(System.in); //gör det möjligt att få input från konsolen
		
		System.out.println("Hur gammal är du?");
		age = input.nextInt();
				
		
		 if (age >= 18) { //dvs man jämför i detta fall två heltal
			
			System.out.println("Du är gammal nog att köra bil! Grattis din 47a c:");
			System.out.println("Bara så du vet så får du åka moppe också!");
			
			}
				else if (age < 14 && age> 18) {
					System.out.println("Du är fär ung för att köra bil men du får åka moppe! C:");
			}
		}
		
	{
		 { //om villkoret inte uppfylls körs else
			System.out.println("Tyvärr, inte gammal nog!");
		}
	}

}