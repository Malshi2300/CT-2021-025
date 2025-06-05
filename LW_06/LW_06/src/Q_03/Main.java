package Q_03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pet_3> petlist = new ArrayList<>();
        int count = 0;


        while(true) {
            System.out.print("Enter your pet name (Enter 'STOP' to terminate) : ");
            String name = scanner.nextLine();

            if(name.equalsIgnoreCase("STOP")){
                break;
            }
            System.out.print("Enter pet type (c for cat, d for dog) : ");
            char type = scanner.nextLine().charAt(0);

            while(type != 'c' && type != 'd'){
                System.out.println("Invalid input, Reenter c for cat, d for dog : ");
                type = scanner.nextLine().charAt(0);
            }
            if(type == 'd'){
                petlist.add(new Dog_3((name)));
            }
            else{
                petlist.add(new Cat_3((name)));
            }
            count++;
        }
        System.out.println("\nCats : ");
        for(Pet_3 pet : petlist) {
            if(pet instanceof  Cat_3 ){
                System.out.println(pet.getName());
            }
        }
        System.out.println("\n\nDogs : ");
        for (Pet_3 pet : petlist){
            if(pet instanceof  Dog_3) {
                System.out.println(pet.getName());
            }
        }
        scanner.close();
    }
}
