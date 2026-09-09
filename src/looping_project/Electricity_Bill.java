package looping_project;

import java.util.Scanner;

public class Electricity_Bill {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        System.out.println("1. Residential");
        System.out.println("2. Commercial");
        System.out.println("3. Industrial");
        System.out.print("Enter customer type: ");
        int customerType = sc.nextInt();

        System.out.println("1. Online");
        System.out.println("2. Cash");
        System.out.println("3. Card");
        System.out.print("Enter payment method: ");
        int paymentMethod = sc.nextInt();

        if (units < 0) {
            System.out.println("Invalid Units");
        }
        else if (customerType < 1 || customerType > 3) {
            System.out.println("Invalid Choice");
        }
        else if (paymentMethod < 1 || paymentMethod > 3) {
            System.out.println("Invalid Choice");
        }
        else {

            double baseBill = 0;
            String type = "";

            // Customer Type
            if (customerType == 1) {
                type = "Residential";

                if (units <= 100) {
                    baseBill = units * 3;
                }
                else if (units <= 200) {
                    baseBill = 100 * 3 + (units - 100) * 5;
                }
                else if (units <= 500) {
                    baseBill = 100 * 3 + 100 * 5 + (units - 200) * 7;
                }
                else {
                    baseBill = 100 * 3 + 100 * 5 + 300 * 7
                            + (units - 500) * 10;
                }
            }

            else if (customerType == 2) {
                type = "Commercial";

                if (units <= 100) {
                    baseBill = units * 6;
                }
                else if (units <= 300) {
                    baseBill = 100 * 6 + (units - 100) * 8;
                }
                else if (units <= 600) {
                    baseBill = 100 * 6 + 200 * 8 + (units - 300) * 10;
                }
                else {
                    baseBill = 100 * 6 + 200 * 8 + 300 * 10
                            + (units - 600) * 12;
                }
            }

            else {
                type = "Industrial";

                if (units <= 200) {
                    baseBill = units * 8;
                }
                else if (units <= 500) {
                    baseBill = 200 * 8 + (units - 200) * 10;
                }
                else if (units <= 1000) {
                    baseBill = 200 * 8 + 300 * 10
                            + (units - 500) * 12;
                }
                else {
                    baseBill = 200 * 8 + 300 * 10 + 500 * 12
                            + (units - 1000) * 15;
                }
            }

            double discount = 0;
            double extraCharge = 0;
            double surcharge = 0;
            double finalBill = baseBill;

            // Payment Method
            if (paymentMethod == 1) {
                discount = baseBill * 0.10;
                finalBill = baseBill - discount;
            }
            else if (paymentMethod == 2) {
                finalBill = baseBill;
            }
            else {
                extraCharge = baseBill * 0.05;
                finalBill = baseBill + extraCharge;
            }

            // Surcharge
            if (finalBill > 10000) {
                surcharge = finalBill * 0.05;
                finalBill = finalBill + surcharge;
            }

            System.out.println("\nCustomer Type: " + type);
            System.out.println("Units Consumed: " + units);
            System.out.println("Base Bill: ₹" + baseBill);

            if (paymentMethod == 1) {
                System.out.println("Payment Discount: ₹" + discount);
            }
            else if (paymentMethod == 3) {
                System.out.println("Card Extra Charge: ₹" + extraCharge);
            }
            else {
                System.out.println("Payment Discount: ₹0");
            }

            if (surcharge > 0) {
                System.out.println("Surcharge: ₹" + surcharge);
            }

            System.out.println("Final Bill: ₹" + finalBill);

        }

        sc.close();
    }
}