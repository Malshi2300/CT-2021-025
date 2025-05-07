package Q_05;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;

        System.out.println("Entree : ");
        System.out.println("\t 1. Tofu Burger - $3.49");
        System.out.println("\t 2. Cajun Chicken - $4.59");
        System.out.println("\t 3. Buffalo Wings - $3.99 ");
        System.out.println("\t 4. Rainbow Fillet - $2.99 \n");

        System.out.println("Side Dish : ");
        System.out.println("\t 5. Rice Cracker - $0.79 ");
        System.out.println("\t 6. No-Salt Fries - $0.69");
        System.out.println("\t 7. Zucchini - $1.09");
        System.out.println("\t 8. Brown Rice - $0.59\n");

        System.out.println("Drink : ");
        System.out.println("\t 9. Cafe Mocha - $1.99");
        System.out.println("\t 10. Cafe Latte - $1.90");
        System.out.println("\t 11. Espresso - $2.49");
        System.out.println("\t 12. Oolong Tea - $0.99\n");

        System.out.println("Enter the Number of item in Entree :  ");
        int entree = scanner.nextInt();

        System.out.println("Enter the Number of item in Side Dish :  ");
        int side = scanner.nextInt();

        System.out.println("Enter the Number of item in Drink :  ");
        int drink = scanner.nextInt();


        if (entree == 1){
            System.out.println("you selected entree as Tofu Burger");
            total = total + 3.49;
        }
        else if (entree == 2){
            System.out.println("you selected entree as Cajun Chicken");
            total = total + 4.59;
        }
        else if (entree == 3){
            System.out.println("you selected entree as Buffalo Wings");
            total = total + 3.99;
        }
        else if (entree == 4){
            System.out.println("you selected entree as Rainbow Fillet");
            total = total + 2.99;
        }


        if(side == 5) {
            System.out.println("you selected side dish as Rice Cracker");
            total = total + 0.79;
        }
        else if (side == 6) {
            System.out.println("you selected side dish as No-Salt Fries");
            total = total + 0.69;
        }
        else if (side == 7) {
            System.out.println("you selected side dish as Zucchini");
            total = total + 1.09;
        }
        else if (side == 8){
            System.out.println("you selected side dish as Brown Rice");
            total = total + 0.59;
        }

        if(drink == 9){
            System.out.println("you selected drink as Cafe Mocha");
            total = total + 1.99;
        }
        else if (drink == 10){
            System.out.println("you selected drink as Cafe Latte");
            total = total + 1.90;
        }
        else if (drink == 11) {
            System.out.println("you selected drink as Espresso");
            total = total + 2.49;
        }
        else if (drink == 12) {
            System.out.println("you selected drink as Oolong Tea");
            total = total + 0.99;
        }

        System.out.println("Youre total bill : " + total);



    }
}
