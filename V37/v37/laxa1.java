package v37;

import java.util.Scanner;

public class laxa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Vad heter du?");
		
		
		Scanner namnInput = new Scanner (System.in);
		String namn = namnInput.nextLine();
		
		
		System.out.println("Hur gammal �r du?");
		
		Scanner �lderInput = new Scanner (System.in);
		String �lder = namnInput.nextLine();
		
		System.out.println("Vad �r din adress?");
		
		
		Scanner adressInput = new Scanner (System.in);
		String adress = adressInput.nextLine();
		
		
		System.out.println("Vad �r ditt postnummer?");
		
		Scanner postnummerInput = new Scanner (System.in);
		String postnummer = postnummerInput.nextLine();
		
		
		System.out.println("Vad �r ditt telefonnummer?");
		
		
		Scanner telefonnummerInput = new Scanner (System.in);
		String telefonnummer = adressInput.nextLine();
		
		
	}

}
