package Q_02;

import java.util.Scanner;

public class Q2 {
    Scanner scanner = new Scanner(System.in);
    static int Number;
    int count = 0;
    int i = Number;

    public void Digit() {
        while (i > 0){

            while (Number != 0) {
                Number = Number / 10;
                count++;
            }
            System.out.println("Number of digits : " + count);
            count = 0;

            System.out.println("Enter the Number (If you wat to stop  enter negative number ) : ");
            Number = scanner.nextInt();
            i = Number;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number (If you wat to stop  enter negative number ) : ");
        Number = scanner.nextInt();
        Q2 meth = new Q2();
        meth.Digit();
    }




}


