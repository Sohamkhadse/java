package exception_handling;

public class second_exception {
	public static void main(String[] args) {

		try {
			int age = 10;

			if(age > 18) {
				System.out.println("you can drink");
			}
			throw new Exception("You cannot drink");

		} catch(Exception e) {
			System.out.println(e);
		}
	}
}