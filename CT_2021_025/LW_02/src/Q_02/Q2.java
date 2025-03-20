package Q_02;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        System.out.println("Enter value in centimeter :");
        Scanner scanner = new Scanner(System.in);
        double Cm = scanner.nextDouble();

        double inch = Cm * (1/2.54);
        System.out.println("Inches : " + inch);

        double feet = Cm * (0.032);
        System.out.println("Feets : " + feet);

    }
}
