package ProgrammingChallenge;
import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
     /*

        //Enter student name
        System.out.print("Enter student name: "  );
        String student = new Scanner(System.in).next();


        //Enter test score
        System.out.print("Enter the student's test score: ");
        int score = new Scanner(System.in).nextInt();

        char grade;

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println( student );
        System.out.println("The student's grade is: " + grade);
    }

         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        String[] studentNames = new String[numStudents];
        int[] studentScores = new int[numStudents];

        // Input student names and scores
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            studentNames[i] = scanner.next();
            System.out.print("Enter the score of student " + (i + 1) + ": ");
            studentScores[i] = scanner.nextInt();
        }

        System.out.println("\nStudent Grades:");

        for (int i = 0; i < numStudents; i++) {
            char grade;

            if (studentScores[i] >= 90) {
                grade = 'A';
            } else if (studentScores[i] >= 80) {
                grade = 'B';
            } else if (studentScores[i] >= 70) {
                grade = 'C';
            } else if (studentScores[i] >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            System.out.println(studentNames[i] + " : Score = " + studentScores[i] + "/100 , Your Grade is = " + grade);
        }
    }
}
