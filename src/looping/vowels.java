package looping;

import java.util.Scanner;

public class vowels {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character:");
        char a = sc.next().charAt(0);

        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u')
            System.out.println("Vowel");
        else
            System.out.println("Not Vowel");
        sc.close();
    }
}