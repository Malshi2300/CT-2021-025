package Q_08;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

        final double PI = 3.14;
        System.out.println("Enter radius of the sphere in meter :");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        double volume = (4.0/3.0)  * (PI *(Math.pow(radius,2)));

        System.out.println("Volume of the sphere : " + volume );
    }
}
