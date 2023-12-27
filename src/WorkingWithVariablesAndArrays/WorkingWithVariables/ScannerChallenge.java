package WorkingWithVariablesAndArrays.WorkingWithVariables;

import java.util.Scanner;

public class ScannerChallenge {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("What is your first name?");
        String firstName = scr.nextLine();

        System.out.println("What is your last name?");
        String lastName = scr.nextLine();

        System.out.println("How old are you?");
        int age = scr.nextInt();
        scr.nextLine();  // Consume the newline character left by nextInt()

        System.out.println("Make a username");
        String userName = scr.nextLine();

        System.out.println("What city do you live in?");
        String city = scr.nextLine();

        System.out.println("What country is that?");
        String country = scr.nextLine();

        System.out.println("Thank you for joining JavaGram!");
        System.out.println("Here is the information you entered");
        System.out.printf("First Name: %s%n", firstName);
        System.out.printf("Last Name: %s%n", lastName);
        System.out.printf("Age: %d%n", age);
        System.out.printf("Username: %s%n", userName);
        System.out.printf("City: %s%n", city);
        System.out.printf("Country: %s%n", country);
    }
}
