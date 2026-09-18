package array;

public class even_odd_sum {

    public static void main(String[] args) {

        int arr[] = {10,12,13,14,15,16,17,18,20,22};

        int ecount = 0;
        int ocount = 0;

        int esum = 0;
        int osum = 0;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] % 2 == 0) {
                ecount++;
                esum = esum + arr[i];
            }
            else {
                ocount++;
                osum = osum + arr[i];
            }
        }

        System.out.println("Even count is " + ecount);
        System.out.println("Odd count is " + ocount);

        System.out.println("Even sum is " + esum);
        System.out.println("Odd sum is " + osum);
    }
}

