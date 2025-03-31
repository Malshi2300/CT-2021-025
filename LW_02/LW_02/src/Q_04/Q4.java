package Q_04;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        System.out.println("Enter your body weight :");
        Scanner scanner = new Scanner(System.in);
        double weight = scanner.nextDouble();

        double calories = weight * 19;

        System.out.println("Number of calories :" + calories);
    }
}
