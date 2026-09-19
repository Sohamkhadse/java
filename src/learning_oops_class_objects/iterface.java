package learning_oops_class_objects;

// Creating an interface
interface Message {

    // Method inside interface
    void hello();
}

// Creating a class that implements the interface
class Student implements Message {

    // Providing the implementation of hello()
    public void hello() {
        System.out.println("Hello");
    }
}

// Main class
public class iterface {

    public static void main(String[] args) {

        // Creating object of Student
        Student s = new Student();

        // Calling hello() method
        s.hello();
    }
}