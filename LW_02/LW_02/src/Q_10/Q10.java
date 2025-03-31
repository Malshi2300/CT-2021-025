package Q_10;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter loan amount : ");
        double amount = scanner.nextDouble();

        System.out.println("Enter annual interest rate : ");
        double AnnualRate = scanner.nextDouble();

        System.out.println("Enter loan period  in months: ");
        double period = scanner.nextDouble();

        double monthlyInterestRate = (AnnualRate / 100.0 /12);

        double numberOfPayments = period * 12;

        double monthlyPayment = (amount * monthlyInterestRate)/ (1- Math.pow((1/(1 + monthlyInterestRate)),numberOfPayments));

        double totalPayment = monthlyPayment * numberOfPayments;

        System.out.println("Monthly Payment : " + monthlyPayment);
        System.out.println("Total payment : " + totalPayment);


    }
}
