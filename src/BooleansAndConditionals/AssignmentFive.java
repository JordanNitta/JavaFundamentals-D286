package BooleansAndConditionals;

import java.util.Scanner;

public class AssignmentFive {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("\n****ROYAL BANK OF JAVA****");

        System.out.println("Are you here to get a mortgage? (yes or no)");
        String mortgage = scnr.nextLine();
        if(mortgage.equals("yes")){
            System.out.println("\nGreat! In one line" +
                    "\nHow much money do you have in your savings?" +
                    "\nAnd, how much do you owe in credit card debt?");
            double saving = scnr.nextDouble();
            double creditCardDebt = scnr.nextDouble();
            System.out.println("\nHow many years have you worked for?");
            int yearWorked = scnr.nextInt();
            System.out.println("What is your name?");
            String name = scnr.next();
            if(saving >= 10000 && creditCardDebt <= 5000 && yearWorked > 2){
                System.out.println("Congratulations " + name + " you have been approved!");
            } else {
                System.out.println("Sorry, you are not eligible for a mortgage");
            }
        } else {
            System.out.println("\nOK. Have a nice day!");;
        }


    }
}
