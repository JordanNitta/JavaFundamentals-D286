package ZyBook.UnitTwo.Labs;

import java.util.Scanner;

public class LabOne {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String secretID;
        String firstName;
        String lastName;

        firstName = scnr.nextLine();
        lastName = scnr.nextLine();

        /* Your solution goes here  */
        secretID = firstName.concat(" ").concat(lastName);
        System.out.println(secretID);

    }
}
