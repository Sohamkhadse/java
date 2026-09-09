package looping;

import java.util.Scanner;

public class min_max {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 5 numbers:");

		int num = sc.nextInt();

		int min = num;
		int max = num;

		for(int i = 2; i <= 5; i++) {

			num = sc.nextInt();

			if(num > max) {
				max = num;
			}

			if(num < min) {
				min = num;
			}
		}

		System.out.println("Maximum = " + max);
		System.out.println("Minimum = " + min);

		sc.close();
	}
}