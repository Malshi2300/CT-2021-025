package Q_02;

import Q_01.Temperature;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Temperature in Fahrenheit :");
        double fahrenheit = scanner.nextDouble();

        Temperature temp = new Temperature();
        temp.setFahrenheit(fahrenheit);

        System.out.println("Temperature in Celsius : " + temp.toCelsius() );
    }
}
