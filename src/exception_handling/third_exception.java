package exception_handling;

import java.util.Scanner;

public class third_exception {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        String s = sc.nextLine();

        try {
            int n = Integer.parseInt(s);
            System.out.println(n);
        } catch (NumberFormatException e) {
            System.out.println("Enter valid number");
        }


        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        try {
            int[] a = new int[size];
        } catch (NegativeArraySizeException e) {
            System.out.println("Size cannot be negative");
        }
        
        
        int[] marks = {10, 20, 30};

        System.out.print("Enter index: ");
        int index = sc.nextInt();

        try {
            System.out.println(marks[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        try {
            int result = 10 / num;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}