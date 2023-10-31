package tasksheet1_1_3;
import java.util.Scanner;

public class newClass {
    public static void main(String[] args){
      /*  int value1 = 1;
        int value2 = 2;
        int result;
        boolean someCondition = true;
        result = someCondition ? value1 : value2;

        System.out.println(result);
       */
        // take input from users
       /* Scanner input = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        double marks = input.nextDouble();

        // ternary operator checks if
        // marks is greater than 40
        String result = (marks > 40) ? "pass" : "fail";

        System.out.println("You " + result + " the exam.");
        input.close();

        */
       /* for(int i=1; i<11; i++){
            System.out.println("Count is: " + i);
        }*/

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int number : numbers) {
            String result = (number % 2 == 0) ? "even" : "odd";
            System.out.println(number + " is " + result);
        }


    }
}
