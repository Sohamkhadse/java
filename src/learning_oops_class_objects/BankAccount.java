package learning_oops_class_objects;
import java.util.Scanner;

abstract class BankAccount {
	private int accountNumber;
	private String holderName;
	private double balance;
	

    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    abstract double calculateInterest();

    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount{
	
	SavingsAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    double calculateInterest() {
        return balance ;
    }
	
	
}

class CurrentAccount extends BankAccount{
	
	CurrentAccount	(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }
	double calculateInterest() {
		return balance ;
	}
}

class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accountNumber = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Holder Name: ");
        String holderName = sc.nextLine();

        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();

        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");

        System.out.print("Enter Account Type: ");
        int choice = sc.nextInt();

        BankAccount account;

        if (choice == 1) {
            account = new SavingsAccount(accountNumber, holderName, balance);
        } else {
            account = new CurrentAccount(accountNumber, holderName, balance);
        }

        System.out.println("\n--- Account Details ---");
        account.displayAccount();

        System.out.println("Calculated Interest: " + account.calculateInterest());

        sc.close();
    }
}


