package ZyBook.PracticeTest;

import java.util.Scanner;

public class LabSix {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        /* Type your code here. */
        System.out.println("Enter your name:");
        // Collect full name as a string
        String fullName = scnr.nextLine(); // Use nextLine() to read the entire line

        // Split the full name into parts
        String[] splitName = fullName.split(" ");

        if (splitName.length == 3) {
            String firstName = splitName[0];
            String middleName = splitName[1];
            String lastName = splitName[2];


            char middleInitial = middleName.toUpperCase().charAt(0);
            char lastInitial = lastName.toUpperCase().charAt(0);

            System.out.printf("%s., %s %s", lastInitial, firstName, middleInitial);

        } else if(splitName.length == 2){
            String firstName = splitName[0];
            String middleName = splitName[1];
            char middleInitial = middleName.toUpperCase().charAt(0);
            System.out.printf("%s., %s%n", middleInitial, firstName);
        }

    }
}
