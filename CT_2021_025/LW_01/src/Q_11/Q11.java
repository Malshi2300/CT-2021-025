package Q_11;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter your full name(first middle last) :");
        String fullName =  Scanner.nextLine();

        String[] nameParts = fullName.split(" ");

        if (nameParts.length == 3) {
            String firstName = nameParts[0];
            String middleName = nameParts[1];
            String lastName = nameParts[2];

            char middleInitial = middleName.charAt(0);

            String formattedName = lastName + " , " + firstName + " " + middleInitial + " . ";

            System.out.println("Formatted name : " + formattedName);
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
