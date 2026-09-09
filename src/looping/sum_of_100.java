package looping;

public class sum_of_100 {

    public static void main(String[] args) {

        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 100; i++) {

            sum = sum + i;
            count++;

        }

        System.out.println("Sum = " + sum);
        System.out.println("Count = " + count);
    }
}