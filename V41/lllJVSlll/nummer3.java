package lllJVSlll;

import java.util.Scanner;

public class nummer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv in 5 olika heltal:");
		
		int tal1 = input.nextInt();
		int tal2 = input.nextInt();
		int tal3 = input.nextInt();
		int tal4 = input.nextInt();
		int tal5 = input.nextInt();
		
		
		System.out.println("Den totala summan är :" + tal1 * tal2 * tal3 * tal4 * tal5);
		
	}

}
