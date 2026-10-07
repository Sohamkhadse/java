package Multi_threading;

import java.util.InputMismatchException;

class d{
	public void run() {
		for(int i = 0; i < 10; i++) {
		System.out.println("This is normal thread");
	}
	}
}

class A extends d implements Runnable {

    public void add() {
        for(int i = 0; i < 10; i++) {
            System.out.println("captain O ! captain");
        }
    }
}

class B extends Thread {
	
	public void run() {
		for(int k = 0; k < 10; k++) {
			System.out.println("Life is great");
			
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}



public class first_thread {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("This is dead poet's society");

        A a = new A();
       Thread d = new Thread(a);
      
        d.start();
        a.add();
        
        
        B b = new B();
        b.start();
        b.join();

        for(int j = 0; j < 50; j++) {
            System.out.println("This is main Thread stop branch");
        }
    }
}