package halloween;

public class HalloweenWhile {
	int noOfChoclates;

	void trickAndTreating() {

		while (noOfChoclates < 10) {
			System.out.println("HouseNumber"+ (noOfChoclates + 1));
			System.out.println("Trick or Treat");
			noOfChoclates++;
			if (noOfChoclates != 10) {
				System.out.println("Go to next house");
			}

		} 

	}
}
