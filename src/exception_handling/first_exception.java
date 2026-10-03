package exception_handling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class first_exception {
	public static void main(String[] args) {
	int a=40;
	int b=2;
	
	//Arithmetic exception
	try {
		int c =a/b;
		System.out.println(c);
		}catch(ArithmeticException e){
			System.out.println(e);
			System.out.println("Bro there is error");
		}
	
	//null pointer exception
	try {
		String str=null;
		System.out.println(str.length());
	}catch(NullPointerException e) {
		System.out.println(e);
	}
	
	//array exception
	try {
		int k[]= {1,2,3,4,5};
		System.out.println(k[7]);
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
		System.out.print("oh come on bro select size");
	}
	
	//format exception
	try {
		String str = "abc";
		int number= Integer.parseInt(str);
		System.out.print(number);
	}catch(NumberFormatException e){
		System.out.println(e);		
	}
	
	
	//input mismatch exception
	try {
		System.out.println("enter number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n);
	}catch (InputMismatchException e){
		System.out.println(e);	
	}
	
	

}
	
}