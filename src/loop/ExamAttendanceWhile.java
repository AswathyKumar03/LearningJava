package loop;

import java.util.Scanner;

public class ExamAttendanceWhile {

	String name;

	int noOfStudents, percentOfAtendance, qualifiedStudents;

	Scanner sc = new Scanner(System.in);
	
	/**In here we can check the number of students qualified for the Exam on the basis 
	   of the percentage of  their Attendance.*/
	void checkForExamQualification() {
		int counter = 1;
		while (counter <= noOfStudents) {
			System.out.println("Enter your name");
			name = sc.next();
			System.out.println("enter your Attendance Percentage");
			percentOfAtendance = sc.nextInt();
			if (percentOfAtendance >= 75) {
				System.out.println("You are Qualified for Exam");
				qualifiedStudents++;
			} else {
				System.out.println("Not Qualified");
			}
			counter++;

		}

		System.out.println("Total number of Qualified Students is - " + qualifiedStudents);
	}

}
