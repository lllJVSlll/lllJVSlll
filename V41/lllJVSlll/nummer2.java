package lllJVSlll;

import java.util.Scanner;

public class nummer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Skriv in ett heltal mellan 1-10000:");

		String hej = input.nextLine();
		
		char[] tecken = hej.toCharArray();
		
		int sum =0;
		
		for(char c : tecken)
		{
			sum += Character.getNumericValue(c);
		}
		
		
//		int num = input.nextInt();
//		int sum = 0;
//    while (num > 0) {
//        sum = sum + num % 10;
//        num = num / 10;
//    }
		System.out.println(sum);
	}

}
