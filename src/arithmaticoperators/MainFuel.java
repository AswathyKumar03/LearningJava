package arithmaticoperators;

import java.util.Scanner;

public class MainFuel {

	public static void main(String[] args) {
		
		FuelCalculation fuelcalculation = new FuelCalculation();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Throttle");
		
		
		fuelcalculation.x_throttle= sc.nextInt();

		fuelcalculation.calculateFuelImjection();
	}

}
