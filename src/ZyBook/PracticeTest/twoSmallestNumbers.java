package ZyBook.PracticeTest;

import java.util.Scanner;

public class twoSmallestNumbers {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        System.out.println("Enter the number of integers:");
        int userInput = scrn.nextInt();
        int[] numArray = new int[userInput];

        System.out.println("Enter your numbers:");

        for (int i = 0; i < userInput; i++) {
            numArray[i] = scrn.nextInt();
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int num : numArray){
            if(num < smallest){
                secondSmallest = smallest;
                smallest = num;
            } else if(num < secondSmallest){
                secondSmallest = num;
            }
        }
        System.out.println("Two smallest numbers: " + smallest + " and " + secondSmallest);
    }
}
