package Q_06;

import javax.swing.*;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter the frame width :");
        int width = Scanner.nextInt();

        System.out.println("Enter the frame height");
        int height = Scanner.nextInt();

        frame.setSize(width,height);

        frame.setVisible(true);
    }
}
