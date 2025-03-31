package Q_10;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an odd length word :");
        String word = scanner.nextLine();

        int length = word.length();

        if (length % 2 == 1) {
            int middleIndex = length / 2;

            char middleChar = word.charAt(middleIndex);

            System.out.println("The middle character is : " + middleChar);
        }
        else {
            System.out.println("The word must have an odd length");
        }

    }
}
