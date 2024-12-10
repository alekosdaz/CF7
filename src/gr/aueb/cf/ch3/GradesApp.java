package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * o xrhsths 8a dinei :
 * 1. tous sunolikous bathmous ma8htwn
 * 2. to plh8os twn ma8hmatwn
 *
 * 8a ypologizei ton meso oro kai 8a xarakthrizei
 * 'Arista' an o mesos oros einai >= 9, 'Poly kala' an
 * o mesos oros einai >= 7 kai 'Kalws' an o mesos oros einai
 * >= 5 kai 'Apotuxia' an o mesos oros einai < 5 .
 */
public class GradesApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;
        int coursesCount = 0;
        int average = 0;

        System.out.println("Please insert total marks");
        totalMarks = scanner.nextInt();

        if (totalMarks <= 0) {
            System.out.println("Total marks must not be negative or zero");
            System.exit(1);
        }

        System.out.println("Please insert courses count");
        coursesCount = scanner.nextInt();

        if (coursesCount <= 0) {
            System.out.println("Courses count must not be negative or zero");
            System.exit(1);
        }

        average = totalMarks / coursesCount;

        if (average > 10) {
            System.out.println("Error. The average must be less or equal than 10");
            System.exit(1);
        }

        if (average >= 9) {
            System.out.println("Excellent");
        } else if (average >= 7) {
            System.out.println("Very Good");
        } else if (average >= 5) {
            System.out.println("Good");
        } else {
            System.out.println("Failure");
        }
    }
}
