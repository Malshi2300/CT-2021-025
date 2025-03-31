package Q_01;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        //part a:

        System.out.println("PART a ");
        Scanner scanner = new Scanner(System.in);

       System.out.println("Enter value of A:");
        double A = scanner.nextDouble();

        System.out.println("Enter Value of C(C and A should not be equal) :");
        double C = scanner.nextDouble();

        System.out.println("Enter value of B :");
        double B = scanner.nextDouble();

        double root =  Math.sqrt((Math.pow(B,2)) + 4 * A * C);
        System.out.println("Answer is "+ root);



        // Part b:
        System.out.println("PART b ");

        System.out.println("Enter value of X :");
        double X = scanner.nextDouble();

        System.out.println("Enter value of Y :");
        double Y = scanner.nextDouble();

        double root2 = Math.sqrt(X + (4 * Math.pow(Y,3)));

        System.out.println("Answer is "+ root2);

        // Part c:
        System.out.println("PART c ");
        System.out.println("Enter value of X :");
        double x = scanner.nextDouble();

        System.out.println("Enter value of Y :");
        double y = scanner.nextDouble();

        double root3 = Math.cbrt(x * y);

        System.out.println("Answer is " + root3);

        //Part d:
        System.out.println("PART d ");

        final double PI = 3.14;
        double area; double radius ;

        System.out.println("Enter radius of the circle :");
        radius = scanner.nextDouble();

        area = PI * Math.pow(radius , 2);
        System.out.println("Area of the circle is " + area);
    }
}
