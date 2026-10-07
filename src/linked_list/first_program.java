package linked_list;
import java.util.*;
public class first_program {
	public static void main(String[] args) {
		   LinkedList Student=new LinkedList();
		   
		   Student.add("soham");
		   Student.add("Krish");
		   Student.add("Aaditya");
		   Student.add("Abhay");
		   Student.add("Tanishq");
		   Student.add(1);
		   
		   
		   System.out.println(Student);
		   
		   Student.set(0,"Rajesh"); 
		   System.out.println(Student);
		   
		   Student.remove(3);
		   System.out.println(Student);
		   
	}
}