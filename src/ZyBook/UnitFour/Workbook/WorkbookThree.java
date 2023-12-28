package ZyBook.UnitFour.Workbook;

import java.util.Scanner;

public class WorkbookThree {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome to Java Grocers.");
        System.out.println("What can I help you find?");

        String[] groceryItems = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        String userInput = scnr.nextLine();
        for(int i = 0; i < groceryItems.length; i++){
            if(groceryItems[i].equals(userInput)){
                System.out.println(i);
                break;
            } else {
                System.out.println("Not a valid item");
            }
        }
    }
}
