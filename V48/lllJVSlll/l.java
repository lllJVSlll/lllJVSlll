package lllJVSlll;

public class l {

	public static void main(String[] args) {

		// 100 tal i intervallet [0-9]
		int[] numbers = { 1, 1, 1, 2, 6, 7, 8, 4, 3, 7, 8, 9, 3, 1, 3, 7, 8, 5, 3, 4, 8, 9, 6, 4, 2, 4, 7, 9, 7, 4, 3,
				2, 3, 6, 7, 8, 7, 7, 5, 7, 9, 6, 1, 4, 0, 8, 6, 5, 6, 8, 9, 0, 7, 5, 4, 3, 2, 4, 5, 9, 8, 5, 9, 8, 8, 4,
				5, 6, 7, 8, 9, 0, 9, 0, 9, 7, 5, 2, 1, 2, 3, 4, 5, 4, 4, 5, 3, 4, 5, 0, 8, 7, 0, 7, 9, 7, 0, 6, 5, 4 };

		// 100 namn
		String[] names = { "Crystal", "Tam", "Ed", "Beulah", "Daina", "Benjamin", "Kia", "Clelia", "Cassy", "Gita",
				"Celsa", "Karoline", "Talitha", "Lewis", "Betsy", "Colin", "Glendora", "Carola", "Rosalba", "Jeanie",
				"Yevette", "Armand", "Neal", "Lilla", "Dorethea", "Delta", "Maye", "Nikita", "Shoshana", "Carola",
				"Margie", "Haywood", "Venessa", "Natacha", "Gilbert", "Kandi", "Tyisha", "Tammie", "Blossom", "Penney",
				"Diana", "Audrey", "Willard", "Zoraida", "Drusilla", "Jacquline", "Cyndy", "Janiece", "Tressie", "Kami",
				"Lashanda", "Leann", "Tom", "Santana", "Junita", "Gisela", "Tom", "Marquerite", "Bryant", "Lauralee",
				"Yael", "Kelle", "Samantha", "Tom", "Meta", "Lanette", "Wanetta", "Carola", "Jana", "Neal", "Brady",
				"Rigoberto", "Felicia", "Hellen", "Georgeann", "Carola", "Isaias", "Ellis", "Roseanne", "Lenard", "Ela",
				"Ophelia", "Alesha", "Mafalda", "Flor", "Kelsi", "Autumn", "Sondra", "Pasty", "Jacquelyne", "Benjamin",
				"Emmie", "Mickie", "Lang", "Jamee", "Felice", "Daniella", "Carola", "Nathalie", "Genevive" };
		System.out.println(mostnumbers(numbers));
		System.out.println(numberof7(numbers));
		System.out.println(numberofToms(names));
		System.out.println(find(names));
		System.out.println(jämna(tal));
	}

	public static void jämna(int [] tal) {
		int container = 0;
		for (int i = 0; i < tal.length; i++) {
			if (tal[i] == 2 ||
					tal[i] == 4 ||
					tal[i] == 6 ||
					tal[i] == 8 ) {
				container = container + tal[i];
			}
					
		}
		return;
	}

	public static int find(String[] names) {
		int number = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals("Drusilla")) {
				return i;
			}
		}
		return 0;
	}

	private static int mostnumbers(int[] numbers) {
		int most = 0;
		int max = 0;

		for (int i = 0; i < 10; i++) {

			int amount = 0;
			for (int j = 0; j < numbers.length; j++) {

				if (numbers[j] == i) {
					amount++;
				}

			}

			if (amount > max) {
				most = i;
				max = amount;
			}
		}

		return most;
	}

	private static int numberof7(int[] numbers) {
		int howmany7s = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 7) {
				howmany7s++;
			}

		}
		return howmany7s;
	}

	private static int numberofToms(String[] names) {
		int howmanyToms = 0;

		for (int i = 0; i < names.length; i++) {
			if (names[i].equals("Tom")) {
				howmanyToms++;
			}
		}
		return howmanyToms;
	}
}