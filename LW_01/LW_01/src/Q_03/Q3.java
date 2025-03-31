package Q_03;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name :");
        String firstName = input.next();

        System.out.println("Enter middle name :");
        String middleName = input.next();

        System.out.println("Enter last name :");
        String lastName = input.next();

        String initial = middleName.substring(0,1);

        System.out.println(firstName + " " + initial + "." + lastName);
    }
}
