package firstProgram;

public class AmusementPark {

	float height;
	
	void permissionCheck() {
		if(height>90|| height<200) {
			System.out.println("Permission Granted");
		}
		else if(height>=200 || height<=90) {
			System.out.println("No permission");
		}
		else {
			System.out.println("Invalid entry");
		}
	}
}
