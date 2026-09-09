package looping_project;

import java.util.Scanner;

public class Student_scholarship_management {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username = "admin";
        String password = "1234";

        System.out.print("Enter Username: ");
        String user = sc.next();

        System.out.print("Enter Password: ");
        String pass = sc.next();

        if (user.equals(username) && pass.equals(password)) {

            System.out.println("Login Successful");

            sc.nextLine();

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Roll Number: ");
            int roll = sc.nextInt();

            int total = 0;

            for (int i = 1; i <= 5; i++) {
                System.out.print("Enter marks of Subject " + i + ": ");
                int marks = sc.nextInt();

                total = total + marks;
            }

            System.out.print("Enter Family Income: ");
            int income = sc.nextInt();

            double percentage = total / 5.0;

            String grade;
            int scholarship;

            // Grade
            if (percentage >= 90) {
                grade = "A";
            } else if (percentage >= 75) {
                grade = "B";
            } else if (percentage >= 60) {
                grade = "C";
            } else if (percentage >= 50) {
                grade = "D";
            } else {
                grade = "F";
            }

            // Scholarship
            if (percentage >= 90 && income < 200000) {
                scholarship = 10000;
            } else if (percentage >= 75 && income < 300000) {
                scholarship = 7500;
            } else if (percentage >= 60 && income < 500000) {
                scholarship = 5000;
            } else if (percentage >= 50) {
                scholarship = 2500;
            } else {
                scholarship = 0;
            }

            // Final Report
            System.out.println("\n----- Student Report -----");
            System.out.println("Student Name: " + name);
            System.out.println("Roll Number: " + roll);
            System.out.println("Total Marks: " + total);
            System.out.println("Percentage: " + percentage);
            System.out.println("Grade: " + grade);

            if (scholarship > 0) {
                System.out.println("Scholarship Amount: Rs." + scholarship);
            } else {
                System.out.println("No Scholarship");
            }

        } else {
            System.out.println("Invalid Login");
        }

        sc.close();
    }
}