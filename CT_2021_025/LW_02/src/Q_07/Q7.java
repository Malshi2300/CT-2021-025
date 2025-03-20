package Q_07;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your body weight in Kg :");
        double weight = scanner.nextDouble();

        System.out.println("Enter your height in Cm :");
        double height = scanner.nextDouble();

        double BMI = weight / Math.pow((height/100.0),2);

        System.out.println("Your BMI value : " + BMI);

        if (BMI >20 && BMI <25) {
            System.out.println("Your BMI value is normal");
        }
        else {
            System.out.println("Take care of your body health");
        }






    }
}
