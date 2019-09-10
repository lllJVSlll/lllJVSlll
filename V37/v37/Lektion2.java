package v37;

import java.util.Scanner;

public class Lektion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		String namn1 = "Johan Simonsen";
		String namn2 = "snikker";
				String namn3 = "KalleBalle";
				
				System.out.println("Skriv in ett namn:");
				
				String namn4 = input.nextLine(); // läser in ett namn från konsolen
				
				String namn5 = input.nextLine();
		
				
			System.out.println("\nNamn:");
			System.out.println(namn1 + "\n" + namn2 + "\n" + namn3 + "\n" + namn4 + "\n" + namn5);
		
	}

}
