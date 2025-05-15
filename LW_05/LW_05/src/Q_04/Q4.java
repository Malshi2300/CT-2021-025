package Q_04;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the rows for pyramid : ");
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++){
            for(int r = 1; r <= N - i ; r++){
                System.out.print(" ");
            }
            for(int a = 1; a <= i; a++){
                System.out.print(" *");
            }
            System.out.println("\n");
        }
    }
}
