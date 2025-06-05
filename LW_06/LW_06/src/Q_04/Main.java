package Q_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pet> petlist = new ArrayList<>();

        while(true) {
            System.out.print("Enter pet name (If you want to terminate this enter 'STOP') : ");
            String name = scanner.nextLine();

            if(name.equalsIgnoreCase("STOP")){
                break;
            }
            System.out.print("Enter pet type(c for Cat, d for Dog ) : ");
            char type = scanner.nextLine().charAt(0);

            while(type != 'c' && type != 'd') {
                System.out.print("Invalid input,Reenter c for cat, d for dog : ");
                type = scanner.nextLine().charAt(0);
            }

            if(type == 'd'){
                    System.out.print("Enter dog's weight (kg) : ");
                    double weight = scanner.nextDouble();
                    scanner.nextLine();
                    petlist.add(new Dog(name,weight));
            }
            else {
                    System.out.print("Enter cat's coat color : ");
                    String coatColor = scanner.nextLine();
                    petlist.add(new Cat(name ,coatColor));
            }

        }
        System.out.println("Cats : ");
        for(Pet pet : petlist){
            if(pet instanceof Cat){
                Cat cat = (Cat)pet;
                System.out.println("Name : " + cat.getName() + " | Coat Color : " + cat.getCoatColor());
            }

        }
        System.out.println("\nDogs : ");
        for(Pet pet : petlist){
            if(pet instanceof Dog) {
                Dog dog = (Dog) pet;
                System.out.println("Name : " + dog.getName() + " | Weight : " + dog.getWeight());
            }
        }
        scanner.close();


    }
}
