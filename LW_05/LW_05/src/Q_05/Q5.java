package Q_05;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the word or phrase : ");
        String word = scanner.nextLine();

        int length = word.length();
        String reverse = "";

        for(int i = length - 1; i>=0; i-- ){
            reverse = reverse + word.charAt(i);
        }
        System.out.println(reverse);
        if(word.equals(reverse)){
            System.out.println("It is a palindrome  word.");
        }
        else {
            System.out.println("It is not a palindrome  word.");
        }

    }


}
