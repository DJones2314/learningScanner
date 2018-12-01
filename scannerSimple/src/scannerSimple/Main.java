package scannerSimple;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your year of birth: ");

		boolean isANumber = scanner.hasNextInt(); //checks to see if integer is entered

		if (isANumber) {

			int yearOfBirth = scanner.nextInt();

			scanner.nextLine();// give you chance to put another value in

			System.out.println("Enter your name: ");
			String name = scanner.nextLine();

			int age = 2018 - yearOfBirth;

			if (age >= 0 && age <= 100) {

				System.out.println("Good morning " + name + " don't worry " + age + " isn't that old...");

			} else {
				System.out.println("Error: Invalid year of birth!");
			}

		} else {
			System.out.println("Error: Please enter a valid number");
		}

		scanner.close();

	}

}
