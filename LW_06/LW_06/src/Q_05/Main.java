package Q_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pet> petlist = new ArrayList<>();

        while (true) {
            System.out.print("Enter pet name (if you want to terminate this enter 'STOP') : ");
            String name = scanner.nextLine();

            if(name.equalsIgnoreCase("STOP")){
                break;
            }
            System.out.print("Enter pet type (c for Cat, d for Dog) : ");
            char type = scanner.nextLine().charAt(0);

            while (type != 'c' && type != 'd') {
                System.out.print("Invalid type, Reenter pet type (c for Dog,d for Dog) : " );
                type = scanner.nextLine().charAt(0);
            }
            if(type == 'd') {
                System.out.print("Enter dog's weight (kg) : ");
                double weight = scanner.nextDouble();
                scanner.nextLine();
                petlist.add(new Dog(name, weight));
            }
            else {
                System.out.print("Enter cat's coat color : ");
                String color = scanner.nextLine();
                petlist.add(new Cat(name, color));
            }

        }
        ArrayList<Dog> doglist = new ArrayList<>();
        for (Pet pet : petlist){
            if(pet instanceof Dog) {
                doglist.add((Dog) pet);
            }
        }
        if(!doglist.isEmpty()) {
            double totalWeight = 0;
            double minWeight = Double.MAX_VALUE;
            double maxWeight = Double.MIN_VALUE;

            System.out.println("\n__________________\n");
            System.out.println("Cats : ");
            for (Pet pet : petlist) {
                if (pet instanceof Cat) {
                    Cat cat = (Cat) pet;
                    System.out.println("Name : " + cat.getName() + " | Coat Color : " + cat.getCoatColor());
                }
            }
            System.out.println("\n__________________\n");
                System.out.println("Dog weight status : ");

                for (Dog dog : doglist) {
                    double weight = dog.getWeight();
                    totalWeight = totalWeight + weight;
                    minWeight = Math.min(minWeight, weight);
                    maxWeight = Math.max(maxWeight, weight);

                    System.out.println("Name : " + dog.getName() + " | weight : " + weight);
                }
                double avgWeight = totalWeight / doglist.size();

                System.out.println("________________________");

                System.out.println("Average weight : " + avgWeight);
                System.out.println("Minimum weight : " + minWeight);
                System.out.println("Maximum weight : " + maxWeight);
                System.out.println("Total dogs analyze : " + doglist.size());

        }
        else {
            System.out.println("No dogs");
        }
        scanner.close();
    }
}


