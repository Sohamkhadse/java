package learning_method;

import java.util.Scanner;

public class finding_area {

    static void circle() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        System.out.println("Area of Circle = " + 3.14 * r * r);
        
    }

  static void rectangle() {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.print("enter length:");
	  int k =sc.nextInt();

	  System.out.print("enter breadth:");
	  int l =sc.nextInt();
        
	  System.out.println("the area of rectangle is:" + l * k );
        

    }
  
  static void triangle() {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("enter height:");
	  int m =sc.nextInt();
	  
	  System.out.println("enter base:");
	  int n =sc.nextInt();
	  
	  System.out.println("the area of triangle is :"+ 1 /2 * m * n);
	  
  }
  
  static void square() {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("enter side:");
	  int s =sc.nextInt();
	  
	  
	  System.out.println("the area of square is :"+ s*s);
	  
  }
  
  
  public static void main(String[] args){
	  
	  circle();
	  rectangle();
	  triangle();
	  square();
  }
  
  
  
  
}