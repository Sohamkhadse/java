package com.fuel.java.control;

import java.util.Scanner;

public class Student_grade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Java marks:");
        int a = sc.nextInt();

        System.out.println("Enter DAA marks:");
        int b = sc.nextInt();

        System.out.println("Enter OS marks:");
        int c = sc.nextInt();

        System.out.println("Enter DSA marks:");
        int d = sc.nextInt();

        System.out.println("Enter SEPM marks:");
        int e = sc.nextInt();

        int f = a + b + c + d + e;
        int percentage = f / 5;

        System.out.println("Total marks = " + f);
        System.out.println("Percentage = " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("Grade A");
        } else if (percentage >= 80) {
            System.out.println("Grade B");
        } else if (percentage >= 70) {
            System.out.println("Grade C");
        } else if (percentage >= 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }
        
     

        sc.close();
    }
}