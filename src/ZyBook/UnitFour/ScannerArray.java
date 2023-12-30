package ZyBook.UnitFour;

import java.util.Scanner;

public class ScannerArray {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

//        int[] userVals = new int[8];
//        System.out.println("Enter 8 Int values");
//
//        for(int i = 0; i < userVals.length; i++){
//            userVals[i] = scnr.nextInt();
//            System.out.println("The user entered " + userVals[i]);
//        }
//        int maxVal = userVals[0];
//
//        // Determine largest (max) number // Largest so far
//        for (int i = 0; i < userVals.length; i++) {
//            if (userVals[i] > maxVal) {
//                maxVal = userVals[i];
//            }
//        }
//        System.out.println("Max: " + maxVal);

        System.out.println("How many numbers will you enter");
        int n = scnr.nextInt();
        int[] a = new int[n];

        System.out.println("Great! Enter " + n + " integers:");
        // add our integers into array which is called a
        for(int i = 0; i < n; i++){
            a[i] = scnr.nextInt();
        }

        for(int i = 0; i < n; i++){
            System.out.println(a[i]);
        }

//        Two dimesional array
        System.out.println("Enter row size");
        int rows = scnr.nextInt();
        System.out.println("Enter col size");
        int cols = scnr.nextInt();

//        Create array
        int marks[][] = new int[rows][cols];
//        Take input
        System.out.println("Enter values in array");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                marks[i][j] = scnr.nextInt();
            }
        }
//      Output values
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.println(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
