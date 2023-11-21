package loop;

import java.util.Scanner;

public class ExamMain {

	public static void main(String[] args) {

		ExamAttendanceWhile attendance = new ExamAttendanceWhile();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Total number of Students ");
		attendance.noOfStudents = sc.nextInt();
		attendance.checkForExamQualification();
		sc.close();

	}

}
