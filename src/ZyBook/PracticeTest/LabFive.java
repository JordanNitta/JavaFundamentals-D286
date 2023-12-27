package ZyBook.PracticeTest;

import java.util.Scanner;

public class LabFive {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numOne = scnr.nextInt();
        int numTwo = scnr.nextInt();
        int numThree = scnr.nextInt();
        int sum = 0;

        if(numOne < 0 && numTwo < 0 && numThree < 0){
            System.out.println("Invalid Input");
        } else if(numOne > 0 && numTwo > 0 && numThree > 0){
            sum = numOne + numTwo + numThree;
            boolean isDivisble = sum % 3 == 0;
            System.out.println(numOne + numTwo + numThree + (isDivisble ? " is divisible by 3!" : " is not divisible by 3!"));
        }
    }
}
