package firstProgram;

import java.util.Scanner;

public class AmusementParkMain {
	public static void main(String[] args) {
		AmusementPark permission = new AmusementPark();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Height");
		permission.height = sc.nextFloat();
		permission.permissionCheck();
		
	}

}
