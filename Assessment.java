package co.grandcircus;

import java.util.Scanner;

public class Assessment {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int choice = 0;

		do {
			System.out.println("Please choose a day of class (1-50):");
			choice = scan.nextInt();

			int continents = 6 - choice;
			int oceans = 20 - choice;
			int solar = 37 - choice;
			int result = getDaysLeft(choice);
			if (choice >= 38 && choice <= 50) {
				System.out.println("There are no more tests!");
				System.out.println("There are " + result + " more days of class\n");
			} else if (choice >= 21 && choice <= 37) {
				System.out.println("The next test topic is The Solar System. It is " + solar + " days away.");
				System.out.println("There are " + result + " more days of class.\n");
				// if(solar==0) {
				// System.out.print("It Is today!");
				// }
				// i found out how to calculate if the day was today via the equation above,
				// but, i couldn't figure out how to properly implement it in my sysout statements
			} else if (choice >= 7 && choice <= 20) {
				System.out.println("the next test topic is Oceans. It is " + oceans + " days away.");
				System.out.println("There are " + result + " more days of class.\n");
			} else if (choice >= 1 && choice <= 6) {
				System.out.println("The next test topic is Continents. It is " + continents + " days away.");
				System.out.println("There are " + result + " more days of class.\n");
			}

		} while (choice >= 1 && choice <= 50);
		System.out.println("Thank you. Goodbye.");
	}

	public static int getDaysLeft(int choice) {
		int daysleft = 50 - choice;
		return daysleft;
	}
}