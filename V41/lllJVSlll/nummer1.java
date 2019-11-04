package lllJVSlll;

import java.util.Scanner;

public class nummer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Skriv in 2 olika heltal:");

 Scanner input = new Scanner(System.in);
 
 int tal1 = input.nextInt();
 int tal2 = input.nextInt();
 
 if (tal1 < tal2) {
	 
	 System.out.println("Det minsta talet är:" + tal1);
	 
 }
 else {
	 System.out.println("Det minsta talet är:" + tal2);
 }
	}
}

