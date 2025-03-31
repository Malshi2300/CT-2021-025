package Q_02;

import javax.swing.*;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name :");
        String firstName = input.next();

        System.out.println("Enter your last name : ");
        String lastName = input.next();

        input.close();

        JFrame welcomeframe;
        JFrame frame = new JFrame();
        frame.setSize(250,150);
        frame.setTitle(firstName + " " + lastName);
        frame.setVisible(true);
    }
}
