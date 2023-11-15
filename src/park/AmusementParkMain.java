package park;

import java.util.Scanner;

public class AmusementParkMain {
	public static void main(String[] args) {
		
		//object creation
		AmusementPark permission = new AmusementPark();
		
		//object creation for scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Height");
		
		//Accepting the value from the user and assigning to the variable
		permission.height = sc.nextFloat();
		
		//invoking the method
		permission.permissionCheck();
		sc.close();
		
		
		
	}

}
