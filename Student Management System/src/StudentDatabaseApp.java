import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {

        //Ask how many new students we want to add
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER NUMBER OF STUDENTS TO ENROLL: ");
        int numOfStudents = Integer.parseInt(in.nextLine());
       
		
        //Create n number of new students
        Student[] students = new Student[numOfStudents];
        for (int n = 0; n < numOfStudents; n++) {
      
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
          
        }
        for (int n = 0; n < numOfStudents; n++) {

            System.out.print(students[n].toString());

        }
        
    }

}