package learning_oops_class_objects;

import java.util.Scanner;

public class multi_level_inheritance2 {

    class Person {
        String name;
        int age;

        void setDetails(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    class Employee extends Person {
        int salary;
        int exp;

        void setDetails(int salary, int exp) {
            this.salary = salary;
            this.exp = exp;
        }
    }

    class Teacher extends Employee {
        String subject;

        void setSubject(String subject) {
            this.subject = subject;
        }

        void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary);
            System.out.println("Experience: " + exp);
            System.out.println("Subject: " + subject);
        }
    }

    public static void main(String[] args) {

        multi_level_inheritance2 obj = new multi_level_inheritance2();

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 20; i++) {

            Teacher t = obj.new Teacher();

            System.out.println("\nEnter details of Teacher " + i);

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter age: ");
            int age = sc.nextInt();

            System.out.print("Enter salary: ");
            int salary = sc.nextInt();

            System.out.print("Enter experience: ");
            int exp = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter subject: ");
            String subject = sc.nextLine();

            t.setDetails(name, age);
            t.setDetails(salary, exp);
            t.setSubject(subject);

            System.out.println("\nTeacher " + i + " Details:");
            t.display();
        }

        sc.close();
    }
}