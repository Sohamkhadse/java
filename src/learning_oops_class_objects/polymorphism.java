package learning_oops_class_objects;

import java.util.Scanner;

class Employee {

    double salary;

    Employee(double salary) {
        this.salary = salary;
    }

    // Method Overloading
    void calculateSalary() {
        System.out.println("Employee Salary: " + salary);
    }

    void calculateSalary(double bonus) {
        System.out.println("Employee Salary with Bonus: " + (salary + bonus));
    }
}

class Developer extends Employee {

    Developer(double salary) {
        super(salary);
    }

    // Method Overriding
    @Override
    void calculateSalary() {
        System.out.println("Developer Salary: " + salary);
    }
}

class Manager extends Employee {

    Manager(double salary) {
        super(salary);
    }

    // Method Overriding
    @Override
    void calculateSalary() {
        System.out.println("Manager Salary: " + salary);
    }
}

public class polymorphism {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Developer Salary: ");
        double developerSalary = sc.nextDouble();

        System.out.print("Enter Manager Salary: ");
        double managerSalary = sc.nextDouble();

        // Runtime Polymorphism
        Employee developer = new Developer(developerSalary);
        Employee manager = new Manager(managerSalary);

        developer.calculateSalary();
        manager.calculateSalary();

        // Compile-time Polymorphism
        developer.calculateSalary(5000);

        sc.close();
    }
}