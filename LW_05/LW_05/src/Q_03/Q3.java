package Q_03;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number to get multiplication table : ");
        int N = scanner.nextInt();

        for(int i = 0; i <=10; i++){
            System.out.println(N + " * " + i + " = "  + N*i);
        }
    }
}
