package park;

public class AmusementPark {

	float height;
	
	//In this method height of the user is checked and if the height is between 90 to 200
	//then the permission is granted.
	void permissionCheck() {
		if(height>=90&& height<=200) {
			System.out.println("Permission Granted");
		}
		else  {
			System.out.println("No permission");
		}

	}
}
