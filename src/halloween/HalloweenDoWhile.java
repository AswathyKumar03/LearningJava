package halloween;

import java.util.Scanner;

public class HalloweenDoWhile {

	int noOfChocolate, houseNumber = 1;

	boolean isSnowingHeavily;

	Scanner sc = new Scanner(System.in);

	void trickAndTreating() {
		System.out.println("Lets go to the First home");

		do {
			System.out.println("House Number "+houseNumber);
			System.out.println("Trick and Treat");
			System.out.println("chocolate Number: " + ++noOfChocolate);

			System.out.println("Is snowing?");
			isSnowingHeavily = sc.nextBoolean();
			if (isSnowingHeavily) {
				System.out.println(
						"Now snowing,so stop Trick and Treat and go back to Home.");
				break;
			} else {
				System.out.println("Lets go to next house " );
			}

			
			houseNumber++;

		} while (noOfChocolate < 10);
	}

}
