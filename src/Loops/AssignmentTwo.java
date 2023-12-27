package Loops;

import java.util.Scanner;

public class AssignmentTwo {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Hi Timmy! Choose a number to count to: ");
        int number = scnr.nextInt();

        System.out.println("Great! Here's how it's done");
        for(int i = 0; i <= number; i++){
            System.out.println(i + " ");
        }
        scnr.close();
    }
}
