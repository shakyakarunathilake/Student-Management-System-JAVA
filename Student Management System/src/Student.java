import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private static int tuitionBalance;
	private static int costOfCourses = 600;
	private static int id = 1000;
	static Scanner in = new Scanner(System.in);
	
	//Constructor: prompt user to enter student's name and year
	public Student() {	
		
		System.out.print("ENTER STUDENT'S FIRST NAME: ");
		this.firstName = in.nextLine();
		
		System.out.print("ENTER STUDENT'S LAST NAME: ");
		this.lastName = in.nextLine();
	
		System.out.print("1 - FRESHMEN\n2 - SOPHMORE\n3 - JUNIOR\n4 - SENIOR\nENTER STUDENT CLASS LEVEL:");
		this.gradeYear = in.nextInt();
		in.nextLine();
		
		setStudentID();
		
	}
	
	//Generate an ID
	private void setStudentID() {
		
		//Grade Level + ID
		id++;
		this.studentID = gradeYear + "" + id;
		
	}
	
	//Enroll in courses
	public void enroll() { 
	
		do {	
			System.out.print("ENTER COURSE TO ENROLL(Q TO QUIT): ");
			String course = in.nextLine();
			if(!course.equals("Q")) {
				courses += "\n	" + course;
				tuitionBalance += costOfCourses;
			} else {
				break;
			}
		} while (1 != 0);	
		
	}
	
	//View balance
	public void viewBalance() {
		
		System.out.println("TUITION BALANCE: $" + tuitionBalance);
		
	}
	
	//Pay Tuition
	public void payTuition() {
		
		viewBalance();
		System.out.print("ENTER YOUR PAYMENT: $");
		int payment = in.nextInt();
		in.nextLine();
		tuitionBalance -= payment;
		System.out.println("THANK YOU FOR YOUR PAYMENT OF $" + payment);
		viewBalance();
		
	}
	
	//Show status
	public String toString() {
		
		return 	"\nSTUDENT ID: " + studentID + 
				"\nNAME: " + firstName + " " + lastName + 
				"\nGRADE LEVEL: " + gradeYear +
				"\nCOURSE(S): " + courses + 
				"\nTUITION BALANCE: " + tuitionBalance + "/n";
	
	}
	
}