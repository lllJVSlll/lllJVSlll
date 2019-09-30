package lllJVSlll;

import java.util.Scanner;

public class stuckinaloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int num = input.nextInt();

		if (num > 1 && num < 101) {
			for (int i = 1; i <= num; i++)
				System.out.println(i + " Abracadabra");
		}
		else System.out.println("Håll dig till gränserna!");
	}

}
