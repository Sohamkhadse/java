package learning_oops_class_objects;

// Parent class
class Vehicle {

    // Method to display vehicle details
    void display() {
        System.out.println("Vehicle details");
    }
}

// Electric interface
interface Electric {

    // Method for battery
    void battery();
}

// GPS interface
interface GPS {

    // Method for location
    void location();
}

// Car inherits Vehicle
// and implements Electric and GPS
class Car extends Vehicle implements Electric, GPS {

    // Implementing battery() method
    public void battery() {
        System.out.println("Battery is charging");
    }

    // Implementing location() method
    public void location() {
        System.out.println("GPS location is showing");
    }
}

// Main class
public class interface_hybrid_inheritance {

    public static void main(String[] args) {

        // Creating object of Car
        Car c = new Car();

        // Calling Vehicle method
        c.display();

        // Calling Electric method
        c.battery();

        // Calling GPS method
        c.location();
    }
}