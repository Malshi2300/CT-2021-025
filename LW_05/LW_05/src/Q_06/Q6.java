package Q_06;

import java.util.Random;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int random = rand.nextInt(100);
        int guessNo;
        int attempt = 0;
        do{
            System.out.println("Guess the secret number (1 to 100) : ");
            guessNo = scanner.nextInt();
            attempt++;
            if (guessNo > random){
                System.out.println("Number is higher.");
            }
            else if (guessNo < random){
                System.out.println("Number is lower.");
            }
            else{
                System.out.println("You guess the secret number in " +attempt + " attempts");
            }
        }
        while(guessNo != random);{
        }
    }

}
