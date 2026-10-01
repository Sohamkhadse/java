package learning_oops_class_objects;
import java.util.*;

class Account{
	private int accno;
	private String Holdername;
	private double balance;
	private String IFSC;


public void setAccno(int Accno) {
	this.accno=Accno;
}

public void setHoldername(String Holdername) {
	this.Holdername=Holdername;
}

public void setbalance(double balance) {
	if(balance>0) {
	this.balance=balance;
	}else {
		System.out.println("you are not eligible for other process");
	}
}

public void setIFSC(String IFSC) {
	this.IFSC=IFSC;
}

public int getaccno() {
	return accno;
}public String getHolder() {
	return Holdername;
}public double getBalance() {
	return balance;
}public String getIFSC() {
	return IFSC;
}


public void deposit(int amount) {
	if(amount>0) {
	balance=balance+amount;
	System.out.println("Amount deposited successfully"+amount);
	System.out.println("the balance is"+balance);
	}else {
		System.out.println("Amount is Invalid");
	}
}
public void withdraw(int amount) {
	if(amount>0 && amount<balance) {
		balance=balance-amount;
		System.out.println("Amount withdrawl successfully"+amount);
		System.out.println("Available balance is"+balance);
	}else {
		System.out.println("Amount is Invalid");
	}
}

public void display() {
	System.out.println("Available balance is"+balance);
	System.out.println("Available balance is"+accno);
	System.out.println("Available balance is"+IFSC);
	System.out.println("Available balance is"+Holdername);
}





public int getAccno() {
	return accno;
}public String Holdername(){
    return Holdername;
}public double balance() {
	return balance;
}public String IFSC() {
	return IFSC;
}

class Savingaccount extends Account {

    public void savingAccountDetails() {
        System.out.println("This is a Saving Account");
    }
}


class Generalaccount extends Account {

    public void generalAccountDetails() {
        System.out.println("This is a General Account");
    }
}



public class bank {
	public static void main(String[] args) {
		Account a=new Account();
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome to SBI");
		System.out.println("Enter the account no");
		int accono=sc.nextInt();
		a.setAccno(accono);
		 sc.nextLine();
		System.out.println("Enter the account holder name");
		String name=sc.nextLine();
		a.setHoldername(name);
		System.out.println("Enter the balance");
		double balance=sc.nextDouble();
		 sc.nextLine();
		a.setbalance(balance);
		System.out.println("Enter the IFSC code");
		String IFSC=sc.nextLine();
		a.setIFSC(IFSC);
		
		System.out.println("Account holders  info");
		
		System.out.println(a.getAccno());
		System.out.println(a.Holdername());
		System.out.println(a.balance());
		System.out.println(a.IFSC());
		
		
		int choice=0;
		do {
			System.out.println("----hello bro------");
			System.out.println("1.Deposit");
			System.out.println("2.Withdrawl");
			System.out.println("3.check balance");
			System.out.println("4.Display");
			System.out.println("5.exit");
			System.out.println("Enter the choice");
			
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("enter the amount");
				int amount=sc.nextInt();
				a.deposit(amount);
		     break;
			
		    case 2:
		    	System.out.println("enter the amount for withdrawl");
			    int amount1=sc.nextInt();
			    a.withdraw(amount1);
			break;
			
		    case 3:
		    	System.out.println("The available balace is"+a.getBalance());
		    	break;
		    	
		    case 4:
		    	System.out.println("The account details");
		    	a.display();
		    break;
		    
		    case 6:
		    	System.out.println("thankyou");
		    	break;
		    	
		    case 5:
		    	System.out.println("enter account type");
		    	
		    	
		    
		    	
		    	
		    	
		    default:
		    	System.out.println("its over bro");
		    	
		    	
		}
			
		}while(choice!=5);
		
		
	}

}
}

private class Savingaccount {
	
}
