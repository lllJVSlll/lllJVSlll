package lllJVSlll;

import java.util.Scanner;

public class mathString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println((fahrenheitToKelvin(3)));
		
		System.out.println((KelvinToCelsius(200)));
		
		System.out.println((km(150)));
		
		System.out.println((Mass(81, 10)));
		
		System.out.println((h�jd(2, 5)));
		
		System.out.println((medel(3, 4, 5)));
		
		String mening = "PaParaZZi";
		System.out.println(stsb(mening));
		
		String mening2 = "Jag vill bli godk�nd i programmering! <3";
		System.out.println(program(mening2));
		
		System.out.println("Skriv in str�cka och hastighet och f� ut tiden det tar");
		double str�cka = input.nextDouble();
		double hastighet = input.nextDouble();
		System.out.println(tiden(str�cka, hastighet));
		
		
	}

	public static double fahrenheitToKelvin(double fahrenheit) {
		return (fahrenheit + 459.67) * 5 / 9;
	}

	public static double KelvinToCelsius(double Kelvin) {
		return Kelvin - 273.15; // r�knar ut och ckickar tillbaka i celsius
	}

	public static double km(double m) {
		return (m) / 3.6;
	}

	public static double Mass(double M, double V) {
		return (M * V * V / 2);
	}

	public static double h�jd(double M, double H) {
		return (M * 9.82 * H);
	}

	public static double medel(double first, double second, double last) {
		return (3 + 4 + 5 / 3);
	}

	public static String stsb(String mening) {
		mening = mening.toLowerCase();
		return mening;
	}
	public static String program(String mening2) {
		mening2 = mening2.replace("o", "0").toUpperCase();
				return mening2;
	}
	public static double tiden(double str�cka, double hastighet) {
		double tid = str�cka / hastighet;
		return tid;
	}
	syso
}
