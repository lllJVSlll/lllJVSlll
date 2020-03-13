package lllJVSlll;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = {2, 6, 5, 7, 1, 9, 8, 3, 0, 4, 10};
		boolean swapped = false;
		int temp;
		
		System.out.println(Arrays.toString(numbers));
		
		do {
			
		swapped = false;
		for (int i = 0; i < numbers.length -1; i++) {
			if (numbers[i] > numbers[i+1]) {
				temp = numbers[i]; // sparar tillfälligt värdet på vänsta sidan
				numbers[i] = numbers[i+1];
				numbers[i+1] = temp;
				swapped = true;
				}
			}
		
		}
		while (swapped);
		System.out.println(Arrays.toString(numbers));

	}


}
