package ZyBook.UnitThree;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scnr = new Scanner(System.in);

// Declare variables for Celsius value, Fahrenheit value, and user's choice character
        double celsiusValue;
        double fahrenheitValue;
        char userChar;

// Initialize Celsius value to 0.0 and user's choice character to 'y'
        celsiusValue = 0.0;
        userChar = 'y';

// Execute the following block while the user's choice character is 'y'
        while (userChar == 'y') {
            // Convert Celsius to Fahrenheit using the conversion formula
            fahrenheitValue = (celsiusValue * 9.0 / 5.0) + 32.0;

            // Display the conversion results
            System.out.print(celsiusValue + " C is ");
            System.out.println(fahrenheitValue + " F");

            // Prompt the user to continue or quit
            System.out.print("Type y to continue, any other to quit: ");

            // Read the first character of the user's input
            userChar = scnr.next().charAt(0);

            // Increase the Celsius value by 5 for the next iteration
            celsiusValue = celsiusValue + 5;

            // Print a newline for better readability
            System.out.println("");
        }

// Display "Goodbye" when the loop exits (user enters a character other than 'y')
        System.out.println("Goodbye.");

    }
}
