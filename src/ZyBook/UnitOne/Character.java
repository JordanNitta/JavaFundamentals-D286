package ZyBook.UnitOne;

import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        char arrowBody;
        char arrowHead;
        char bodyChar;
        char headChar;

        arrowBody = '-';
        arrowHead = '>';

        System.out.println(arrowHead);
        System.out.println("" + arrowBody + arrowBody + arrowBody + arrowHead);

        arrowBody = 'o';

        System.out.println("" + arrowBody + arrowBody + arrowBody + arrowHead);

        System.out.println("Enter two characters: ");
        bodyChar = scnr.next().charAt(0);
        headChar = scnr.next().charAt(0);

        System.out.println(bodyChar);
        System.out.println(bodyChar);
        System.out.println(bodyChar);
        System.out.println(headChar);
    }
}
