package lllJVSlll;

import java.util.Scanner;

public class hittafel {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number;
		boolean success;

		System.out.println("Write an integer: ");

		try {
			number = input.nextInt();
			System.out.println("The number is: " + number);
		} catch (Exception e) {
			System.out.println("You typed in the wrong input u kelb");
		}
		
		
	}
	

}
