package Q_05;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        System.out.println("Enter temperature in Fahrenheit :");
        Scanner scanner = new Scanner(System.in);
        double fahrenheit = scanner.nextDouble();

        double tem =  (5.0/9.0) * (fahrenheit - 32);
        System.out.println("Temperature in celsius : " + tem);
    }
}
