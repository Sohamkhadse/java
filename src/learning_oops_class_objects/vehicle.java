package learning_oops_class_objects;

public class vehicle {
	String color; String engine; int noofwheels; int miledge;
	
	void start() {
		System.out.println("vehicle start");
	}
	
	void stop() {
		System.out.println("vehicle stop");
	}

}

class Main{
	public static void main(String[] args){
		vehicle truck = new vehicle();
		truck.start();
		truck.stop();
		
		vehicle car= new vehicle();
		car.start();
		car.stop();
	
	}
}
