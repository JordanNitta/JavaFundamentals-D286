package Loops;

import java.util.Scanner;

public class PracticeTwo {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int i = scrn.nextInt();

        while(i < 1 || i > 10){
            System.out.println(i + " is not between 1 and 10. Try again: ");
            i = scrn.nextInt();
        }
        System.out.println(i + " is between 1 and 10");
    }

}
