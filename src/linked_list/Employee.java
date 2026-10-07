package linked_list;

import java.util.*;

public class Employee {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashSet<Employee> employee = new HashSet<>();

        for (int i = 0; i < 10; i++) {

            System.out.println("Enter employee id:");
            int emp = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter employee name:");
            String emp_name = sc.nextLine();

            System.out.println("Enter employee salary:");
            int emp_salary = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter employee designation:");
            String emp_designation = sc.nextLine();

            Employee e = new Employee();

            employee.add(e);
        }

        System.out.println("Employee Details:");

        for (Employee e : employee) {
            System.out.println(e);
        }

        sc.close();
    }
}