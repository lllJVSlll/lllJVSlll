package lllJVSlll;

public class modulus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// % ==modulus
		
		int tal1 = 49;
		int tal2 = 19;
		int tal3 = 69;
		int tal4 = -137;
		
		System.out.println(tal1 % 3); //testar ifall tal1 �r delbart med 3
		                              //�r den det blir talet 0, om inte
		                              //s� anges rest.
		
		int sum = 0;
		
		
		for(int i = 0; i < 101 ; i++) {
			
			if (i % 3 == 0) {
				System.out.println("Talet" + i + "�r delbart med 3");
				
			sum += i;
			}
			
		}
		
		System.out.println("The total sum of all integers divisible by 3 is: " + sum);
		
		int turn = 0;
		
		while (true) {
			
			turn++;
			
			if (turn % 3 == 0) {
				System.out.println("Davids tur");
			}
			else if (turn % 3 == 1) {
				System.out.println("Johans tur");
			}
			else if (turn % 3 == 1) {
				System.out.println("Lucas tur");
			}
			
			if(turn == 100) {
				break;
			}
		}
	}

}
