package Q_02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pet_2> petlist = new ArrayList<>();
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
                petlist.add(new Dog_2((name)));
            }
            else{
                petlist.add(new Cat_2((name)));
            }
            count++;
        }
        System.out.println("__Pet List__");
        for(Pet_2 pet : petlist) {
            System.out.println(" Name : " + pet.getName() + " Type : " + pet.getType());
        }
        scanner.close();
    }
}
