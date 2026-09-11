package array;

public class largest_number {

	public static void main(String[] args) {

		int a[] = {10, 12, 13, 14, 15, 103, 105};

		int largest = a[0];

		for(int i = 0; i < a.length; i++) {

			if(a[i] > largest) {
				largest = a[i];
			}
		}
		System.out.println("Largest number = " + largest);
		}
	}