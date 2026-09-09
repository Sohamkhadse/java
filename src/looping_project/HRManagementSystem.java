package looping_project;

import java.util.Scanner;

public class HRManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int employeeId = 0;
        String employeeName = "";
        int age = 0;
        double salary = 0;
        int experience = 0;
        int performance = 0;
        int leaveDays;

        for (;;) {

            System.out.println("\n--- HR Management System ---");
            System.out.println("1. Enter Employee Details");
            System.out.println("2. Display Employee Details");
            System.out.println("3. Check Employee Performance");
            System.out.println("4. Check Promotion Eligibility");
            System.out.println("5. Check Salary Category");
            System.out.println("6. Check Leave Eligibility");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    employeeId = sc.nextInt();

                    System.out.print("Enter Employee Name: ");
                    employeeName = sc.next();

                    System.out.print("Enter Age: ");
                    age = sc.nextInt();

                    System.out.print("Enter Salary: ");
                    salary = sc.nextDouble();

                    System.out.print("Enter Experience: ");
                    experience = sc.nextInt();

                    System.out.print("Enter Performance Score: ");
                    performance = sc.nextInt();

                    System.out.println("Employee details saved!");
                    break;

                case 2:
                    System.out.println("\n--- Employee Details ---");
                    System.out.println("Employee ID : " + employeeId);
                    System.out.println("Name        : " + employeeName);
                    System.out.println("Age         : " + age);
                    System.out.println("Salary      : " + salary);
                    System.out.println("Experience  : " + experience + " years");
                    System.out.println("Performance : " + performance);
                    break;

                case 3:
                    System.out.println("\n--- Performance Report ---");

                    if (performance >= 90) {
                        System.out.println("Performance: Excellent");
                    } 
                    else if (performance >= 75) {
                        System.out.println("Performance: Very Good");
                    } 
                    else if (performance >= 60) {
                        System.out.println("Performance: Good");
                    } 
                    else if (performance >= 40) {
                        System.out.println("Performance: Average");
                    } 
                    else {
                        System.out.println("Performance: Poor");
                    }

                    break;

                case 4:
                    System.out.println("\n--- Promotion Check ---");

                    if (experience >= 3 && performance >= 75) {
                        System.out.println("Employee is eligible for promotion.");
                    } 
                    else {
                        System.out.println("Employee is not eligible for promotion.");
                    }

                    break;

                case 5:
                    System.out.println("\n--- Salary Category ---");

                    if (salary >= 100000) {
                        System.out.println("Salary Category: High Salary");
                    } 
                    else if (salary >= 50000) {
                        System.out.println("Salary Category: Medium Salary");
                    } 
                    else {
                        System.out.println("Salary Category: Low Salary");
                    }

                    break;

                case 6:
                    System.out.print("Enter Leave Days Taken: ");
                    leaveDays = sc.nextInt();

                    System.out.println("\n--- Leave Check ---");

                    if (leaveDays <= 15) {
                        System.out.println("Leave Status: Approved");
                    } 
                    else {
                        System.out.println("Leave Status: Not Approved");
                    }

                    break;

                case 7:
                    System.out.println("Thank you for using HR Management System!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

