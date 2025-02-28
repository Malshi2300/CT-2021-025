package Q_08;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string including a single exclamation mark :");
        String input = scanner.nextLine();

        int exclamationIndex = input.indexOf('!');

        String beforeExclamation = input.substring(0,exclamationIndex);
        String afterExclamation = input.substring(exclamationIndex + 1);

        System.out.println("Before exclamation mark : " + beforeExclamation);
        System.out.println("After exclamation mark :" + afterExclamation);





    }
}
