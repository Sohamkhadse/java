package projects;

public class traping_rain {

    public static void main(String[] args) {

        int a[] = {3, 0, 2, 0, 4};

        int water = 0;

        for(int i = 1; i < a.length - 1; i++) {

            int leftMax = a[i];

            for(int j = 0; j < i; j++) {

                if(a[j] > leftMax) {
                    leftMax = a[j];
                }
            }            int rightMax = a[i];

            for(int j = i + 1; j < a.length; j++) {

                if(a[j] > rightMax) {
                    rightMax = a[j];
                }
            }

            int min;

            if(leftMax < rightMax) {
                min = leftMax;
            }
            else {
                min = rightMax;
            }

            water = water + (min - a[i]);
        }

        System.out.println("Total trapped water = " + water);
    }
}