package Array_list;
import java.util.ArrayList;

public class student_array {
   public static void main(String[] args) {
	   ArrayList<String>Student=new ArrayList<>();
	   
	   Student.add("soham");
	   Student.add("Krish");
	   Student.add("Aaditya");
	   Student.add("Abhay");
	   Student.add("Tanishq");
	   
	   System.out.println(Student);
	   
	   Student.set(0,"Rajesh"); 
	   System.out.println(Student);
	   
	   Student.remove(3);
	   System.out.println(Student);
	   
	   
   }
}
