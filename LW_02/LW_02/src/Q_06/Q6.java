package Q_06;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        System.out.println("Enter your born year :");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int currentYear = java.time.Year.now().getValue();

        int age = currentYear - year ;
        System.out.println("You were born in " + year +" and will be(are) " + age + " this year.");

    }
}
