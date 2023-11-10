package arithmaticoperators;

import java.util.Scanner;

public class MainMaths {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Operation mathOperation = new Operation();
		
		mathOperation.number1 = 10;
		
		mathOperation.number2 = 5;
		
		mathOperation.addition();
		
		mathOperation.substraction();
		
		mathOperation.multiplication();
		
		mathOperation.division();
		// TODO Auto-generated method stub

	}

}
