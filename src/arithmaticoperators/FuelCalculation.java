package arithmaticoperators;

public class FuelCalculation {

	int x_throttle;
	int y_fuel;
	boolean isx_throttleValue;

	void calculateFuelImjection() {
		isx_throttleValue = x_throttle>0;
		
		if (isx_throttleValue && x_throttle <= 127) {
			y_fuel = x_throttle*2;
			System.out.println("Fuel Injection is ="+ y_fuel);
		}
		else if(x_throttle>=128 && x_throttle<=255) {
			y_fuel = x_throttle+127;
			System.out.println("Fuel Injection is ="+y_fuel);
		}
		else {
			System.out.println("Throttle value should be between 0-255");
		
		}
		
		
	}

}
