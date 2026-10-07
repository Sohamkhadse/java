package Array_list;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.util.*;

public class predefined_list {
	public static void main(String[] args) {
		ArrayList Student=new ArrayList(List.of("Soham",10,20,40));
		
		System.out.println(Student);
		
		System.out.println(Student.size());
		
		try {
		System.out.println(Student.indexOf(20));
		}catch(AnnotationTypeMismatchException e) {
			System.out.println(e);
		}
	}
}