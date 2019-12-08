package lllJVSlll;

import java.util.Arrays;

public class Arrayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] siffror1 = {1, 2, 3, 5, 6, 7, 8, 9, 10}; // skapar en array och fyller den med 10 tal
		
		int[] siffror2 = new int[10]; //skapar en array med 10 tomma lådor
		
		
		for (int i = 0; i < siffror1.length; i++) {
			
			System.out.println(siffror1[i]);
			System.out.println(Arrays.toString(siffror1));
			
		}
	}

}
