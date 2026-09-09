package looping;

public class fibonacci_series {

	public static void main(String[] args) {

		int first = 0;
		int second = 1;

		for(int i = 1; i <= 50; i++) {

			System.out.print(first + " ");

			int third = first + second;
			first = second;
			second = third;
		}
	}
}