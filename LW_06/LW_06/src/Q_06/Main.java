package Q_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Pet> pettlist = new ArrayList<>();
        ArrayList<Dog> doglist = new ArrayList<>();
        ArrayList<Cat> catlist = new ArrayList<>();

        int choice;
        do {
            System.out.println("___Pet Management System___");
            System.out.println("1. Add Cat");
            System.out.println("2. Add Dog");
            System.out.println("3. Remove Cat");
            System.out.println("4. Remove Dog");
            System.out.println("0. Quit");
            System.out.print("Enter your choice: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a number.");
                scanner.next();
                System.out.print("Enter your choice: ");
            }
            choice = scanner.nextInt();
            scanner.nextLine();


                switch (choice) {
                    case 1:
                        System.out.print("Enter cat name: ");
                        String catName = scanner.nextLine();
                        System.out.print("Enter cat's coat color: ");
                        String color = scanner.nextLine();
                        Cat newCat = new Cat(catName, color);
                        pettlist.add(newCat);
                        catlist.add(newCat);
                        System.out.println("Cat added successfully.");
                        break;

                    case 2:
                        System.out.print("Enter dog name: ");
                        String dogName = scanner.nextLine();
                        System.out.print("Enter dog's weight (kg): ");
                        double weight = scanner.nextDouble();
                        scanner.nextLine();
                        Dog newDog = new Dog(dogName, weight);
                        pettlist.add(newDog);
                        doglist.add(newDog);
                        System.out.println("Dog added successfully.");
                        break;

                    case 3:
                        System.out.print("Enter cat name to remove: ");
                        String catToRemove = scanner.nextLine();
                        boolean catRemoved = false;
                        for (int i = 0; i < catlist.size(); i++) {
                            if (catlist.get(i).getName().equalsIgnoreCase(catToRemove)) {
                                pettlist.remove(catlist.get(i));
                                catlist.remove(i);
                                catRemoved = true;
                                System.out.println("Cat removed successfully.");
                                break;
                            }
                        }
                        if (!catRemoved) {
                            System.out.println("Cat not found.");
                        }
                        break;

                    case 4:
                        System.out.print("Enter dog name to remove: ");
                        String dogToRemove = scanner.nextLine();
                        boolean dogRemoved = false;
                        for (int i = 0; i < doglist.size(); i++) {
                            if (doglist.get(i).getName().equalsIgnoreCase(dogToRemove)) {
                                pettlist.remove(doglist.get(i));
                                doglist.remove(i);
                                dogRemoved = true;
                                System.out.println("Dog removed successfully.");
                                break;
                            }
                        }
                        if (!dogRemoved) {
                            System.out.println("Dog not found.");
                        }
                        break;

                    case 0:
                        System.out.println("Exiting program...");
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
            while (choice != 0);


            System.out.println("Current Pets:");
            System.out.println("Cats:");
            for (Cat cat : catlist) {
                System.out.println(cat);
            }
            System.out.println("\nDogs:");
            for (Dog dog : doglist) {
                System.out.println(dog);
            }


            scanner.close();
        }
    }

