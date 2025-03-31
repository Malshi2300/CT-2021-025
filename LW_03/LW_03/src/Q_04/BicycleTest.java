package Q_04;

import java.util.Scanner;

public class BicycleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter owner's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter owner's phone number: ");
        String phoneNo = scanner.nextLine();

        Bicycle myBike = new Bicycle(name, phoneNo);

        myBike.displayBicycleInfo();

        scanner.close();
    }
}
