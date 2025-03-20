package Q_03;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        System.out.println("Enter temperature in degree celsius :");
        Scanner scanner = new Scanner(System.in);
        double cel = scanner.nextDouble();

        double tem = (1.8 * cel) + 32;
        System.out.println("Temperature in Fahrenheit : " +tem );


    }
}
