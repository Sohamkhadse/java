package looping;

public class sum_of_even_odd {
	public static void main(String[] args) {
		int sum =0;
		for(int i=2;i<=100;i+=2) {
		sum = sum+ i;
		}
		
		System.out.println("the even sum is: "+sum);
		
		int sum2 =0;
		for(int i=1;i<=100;i+=2) {
			sum2 = sum2+ i;
		}
		
		System.out.println("the Odd sum is: "+sum2);
	}
	
}