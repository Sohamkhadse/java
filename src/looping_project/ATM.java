package looping_project;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pin = 1234;
        int balance = 10000;

        System.out.println("Welcome to ATM");

        System.out.print("Enter PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin == pin) {

            System.out.println("Login Successful");

            int choice = 0;

            while (choice != 4) {

                System.out.println("\nATM Menu");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");

                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                if (choice == 1) {

                    System.out.println("Balance: " + balance);

                } else if (choice == 2) {

                    System.out.print("Enter deposit amount: ");
                    int amount = sc.nextInt();

                    balance = balance + amount;

                    System.out.println("Money deposited successfully");
                    System.out.println("Updated Balance: " + balance);

                } else if (choice == 3) {

                    System.out.print("Enter withdrawal amount: ");
                    int amount = sc.nextInt();

                    if (amount <= balance) {
                        balance = balance - amount;

                        System.out.println("Money withdrawn successfully");
                        System.out.println("Updated Balance: " + balance);
                    } else {
                        System.out.println("Insufficient Balance");
                    }

                } else if (choice == 4) {

                    System.out.println("Thank you for using ATM");

                } else {

                    System.out.println("Invalid Choice");
                }
            }

        } else {

            System.out.println("Invalid PIN");
        }

        sc.close();
    }
}