package learning_oops_class_objects;
import scanner.util.
public class multi_level_inheritance2 {

	class Person {
		String name;int age;
		void setDetails(String name, int age) {
			this.name = name;
			this.age = age;
		}
	}

	class Employee extends Person {
		int salary;int exp;
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
//
//		Teacher t = obj.new Teacher();
//
//		t.setDetails("Soham", 22);
//		t.setDetails(50000, 3);
//		t.setSubject("Java");
		for(int i = 0; i< 20;i++) {
			
		}

		t.display();
	}
}