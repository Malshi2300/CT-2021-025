package Q_09;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the invest money in dollar : ");
        double P = scanner.nextDouble();

        System.out.println("Enter the interest rate : ");
        double R = scanner.nextDouble();

        System.out.println("Enter number of years : ");
        double N = scanner.nextDouble();

        double investment = P * (Math.pow((1 + (R/100)),N));

        System.out.println("Amount of money after "+N+ " years : "+ investment);



    }
}
