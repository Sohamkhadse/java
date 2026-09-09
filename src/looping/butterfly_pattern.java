package looping;

public class butterfly_pattern {

    public static void main(String[] args) {
    	
//    	upper part
        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print((char)(64 + j));
            }

            for (int j = 1; j <= 2 * (4 - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print((char)(64 + j));
            }

            System.out.println();
        }
        
        
//        lower part
        for (int i = 3; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int j = 1; j <= 2 * (4 - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}