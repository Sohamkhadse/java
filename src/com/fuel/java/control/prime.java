package com.fuel.java.control;

import java.util.Scanner;

public class prime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Not Prime");
        } else {
            System.out.println("Prime");
        }

        sc.close();
    }
}