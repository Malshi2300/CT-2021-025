package Q_07;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence : ");
        String sentence = scanner.nextLine();

        System.out.println("Enter the word to be replaced : ");
        String word = scanner.nextLine();

        System.out.println("Enter the replacement word : ");
        String repWord = scanner.nextLine();

        String modSentence = sentence.replaceAll(word ,repWord);
        System.out.println("Modified sentence : " + modSentence);

    }
}
