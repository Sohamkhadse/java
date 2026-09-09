package com.fuel.java.control;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        System.out.print("Enter operator: ");
        char a = sc.next().charAt(0);

        if (a == '+') {
            System.out.println(n1 + n2);
        }
        else if (a == '-') {
            System.out.println(n1 - n2);
        }
        else if (a == '*') {
            System.out.println(n1 * n2);
        }
        else if (a == '/') {
            System.out.println(n1 / n2);
        }
        else {
            System.out.println("Invalid operator");
        }

        sc.close();
    }
}