package learning_method;

import java.util.Scanner;

public class calculator {

    public void add(int c, int d) {
        System.out.println(c + d);
    }

    public void sub(int e, int f) {
        System.out.println(e - f);
    }
    public void mul(int g, int h) {
    	System.out.println(g * h);
    }
    public void div(int i, int j) {
    	System.out.println(i / j);
    }
    public void mod(int k, int l) {
    	System.out.println(k % l);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        calculator a = new calculator();

        System.out.println("Enter first number:");
        int x = sc.nextInt();
        
        System.out.println("Enter second number:");
        int y = sc.nextInt();

        a.add(x, y);
        a.sub(x, y);
        a.mul(x, y);
        a.div(x, y);
        a.mod(x, y);
        

        sc.close();
    }
}