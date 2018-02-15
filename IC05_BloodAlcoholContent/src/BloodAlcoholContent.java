
/*
    Nguyen, Nguyen
    CS A170
    02/14/2018

    IC05_BloodAlcoholContent
 */
import java.util.Scanner;

public class BloodAlcoholContent {
	// Constants
	final static double BAC_LIMIT = .08, OUNCES_ALCOHOL = 1.5;

	public static void main(String[] args) {
		// Variables
		double drinks, weight, BAC;
		Scanner consoleScanner = new Scanner(System.in);

		System.out.print("Enter the number of alcoholic drinks consumed: ");
		drinks = consoleScanner.nextDouble();

		System.out.print("Enter your weight in lbs: ");
		weight = consoleScanner.nextDouble();

		// Close the scanner
		consoleScanner.close();

		// Calculation
		BAC = (4.136 * drinks * OUNCES_ALCOHOL) / weight;

		// Display
		if (BAC > BAC_LIMIT) {
			System.out.println("\n According to the state of California, you are intoxicated. Do not drive!");
		} else {
			System.out.println("\n You can drive");
		}
	}
}