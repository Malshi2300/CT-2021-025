package Q_01;

import java.util.Scanner;

public class Q1  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int a = scanner.nextInt();
        System.out.println("Enter second number : ");
        int b = scanner.nextInt();
        System.out.println("Enter third number : ");
        int c = scanner.nextInt();

        if (a < b){
            if (a < c) {
                System.out.println("Minimum Number : " + a);
            }
            else {
                System.out.println("Minimum Number : " + c);
            }
        }
        else {
            if (b < c) {
                System.out.println("Minimum Number : " + b);
            }
            else {
                System.out.println("Minimum Number : " + c);
            }
        }
    }
}
