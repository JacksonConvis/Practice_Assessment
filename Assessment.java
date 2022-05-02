package co.grandcircus;

import java.util.Scanner;

public class Assessment {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int choice = 0;
		int burg = 0;
		int sod = 0;
		do {
			System.out.println("Welcome to the Cafe");
			System.out.println("Menu: \n 1. Burger \n 2. Soda \n 3. Exit");
			choice = scan.nextInt();
			if (choice == 1) {
				burg++;
			} else if (choice == 2) {
				sod++;
			}

			else if (choice >= 4) {
				System.out.println("Sorry I didn't understand, lets try again.");
			}

		} while (choice != 3);

		System.out.println("Total: " + calculateSubtotal(burg, sod));
		
		System.out.print("Total with tax included: ");
		addTaxDisplayTotal(burg, sod);
		System.out.println("Burgers:" + toAsterisk(burg));
		System.out.println("Sodas:" + toAsterisk(sod));
		scan.close();
	}

	public static double calculateSubtotal(int burg, int sod) {
		double total = 2.50 * burg + 1.25 * sod;
		return total;
	}

	public static void addTaxDisplayTotal(int a, int b) {
		System.out.println((a * 2.50 + b * 1.25) * 1.07);
	}

	public static String toAsterisk(int number) {
		StringBuilder temp = new StringBuilder();
		for (int i = 0; i < number; i++) {
			temp.append("*");
		}
		return temp.toString();
	}

}
