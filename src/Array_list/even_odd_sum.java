package Array_list;
import java.util.*;

public class even_odd_sum {
    public static void main(String[] args) {

        ArrayList<Integer> Student = new ArrayList<>(Arrays.asList(10, 21, 30, 41, 550));

        int even_sum = 0;
        int odd_sum = 0;

        for(int i = 0; i < Student.size(); i++) {

            if(Student.get(i) % 2 == 0) {
                even_sum = even_sum + Student.get(i);
            }
            else {
                odd_sum = odd_sum + Student.get(i);
            }
        }

        System.out.println(even_sum);
        System.out.println(odd_sum);
    }
}