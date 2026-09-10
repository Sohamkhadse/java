package learning_method;

import java.util.Scanner;

public class student_marks_calculator {

    static Scanner sc = new Scanner(System.in);

    public static int getMarks(int choice) {

        int marks = 0;

        switch (choice) {

        case 1:
            System.out.print("Enter Java marks: ");
            marks = sc.nextInt();
            break;

        case 2:
            System.out.print("Enter DSA marks: ");
            marks = sc.nextInt();
            break;

        case 3:
            System.out.print("Enter OS marks: ");
            marks = sc.nextInt();
            break;

        case 4:
            System.out.print("Enter DBMS marks: ");
            marks = sc.nextInt();
            break;

        default:
            System.out.println("Invalid choice");
        }

        return marks;
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 65; i++) {

            System.out.println("\nEnter marks for Student " + i);

            System.out.println("Choose Subject:");
            System.out.println("1. Java");
            System.out.println("2. DSA");
            System.out.println("3. OS");
            System.out.println("4. DBMS");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            int marks = getMarks(choice);

            System.out.println("Marks = " + marks);
        }

        sc.close();
    }
}