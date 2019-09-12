package v37;

import java.util.Scanner;

public class laxa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Vad heter du?");
		
		
		Scanner namnInput = new Scanner (System.in);
		String namn = namnInput.nextLine();
		
		
		System.out.println("Hur gammal är du?");
		
		Scanner ålderInput = new Scanner (System.in);
		String ålder = namnInput.nextLine();
		
		System.out.println("Vad är din adress?");
		
		
		Scanner adressInput = new Scanner (System.in);
		String adress = adressInput.nextLine();
		
		
		System.out.println("Vad är ditt postnummer?");
		
		Scanner postnummerInput = new Scanner (System.in);
		String postnummer = postnummerInput.nextLine();
		
		
		System.out.println("Vad är ditt telefonnummer?");
		
		
		Scanner telefonnummerInput = new Scanner (System.in);
		String telefonnummer = adressInput.nextLine();
		
		
		System.out.println("Information" + "\n");
		
		System.out.println("Namn:Johan" + "\n");
		
		System.out.println("Ålder:17" + "\n");
		
		System.out.println("Adress:Vinga Fyrs Väg 23" + "\n");
		
		System.out.println("Postnummer:42341" + "\n");
		
		System.out.println("Telefonnummer:0721682767" + "\n");
		
	}

}
