package arithmaticoperators;

public class Operation {
	
	int number1;
	
	int number2;
	
	int result;
	
	
	
	void addition() { 
		result = number1 + number2 ;
		System.out.println("Result is = "+ result);
	}
	void substraction() {
		
		result = number1 - number2 ;
		System.out.println("Result is = "+ result);
		
	}
	void multiplication() {
		
		result = number1 * number2;
		System.out.println("Result is = "+ result);
	}
	void division() {
		
		float Result = number1/number2;
		System.out.println("Result is = "+ Result);
		
	}
	

}
