package ZyBook.UnitFive;

import java.util.Scanner;

public class MethodsWithLoops {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int numValues;
        double averageVal;

//  Enter number of values
        System.out.println("Enter number of values: ");
//  Take users input
        numValues = scnr.nextInt();

//  Call function that take parameter scnr, and users input
        averageVal = computeAverage(scnr, numValues);

        System.out.print("Average: ");
        System.out.printf("%.3f", averageVal);
        System.out.println("");
    }

//  Method prompts to enter a list of values
    public static double computeAverage(Scanner scnr, int numCount) {
        double valuesSum = 0;
        int currValue = 0;

        for (int i = 0; i < numCount; ++i) {
            System.out.print("Enter number: ");
            currValue = scnr.nextInt();
            valuesSum += currValue;
        }
        return valuesSum / numCount;
    }
}
