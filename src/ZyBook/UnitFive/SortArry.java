package ZyBook.UnitFive;

import java.util.Scanner;

public class SortArry {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size = scnr.nextInt();
        int[] myArry = new int[size];

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < size; i++){
            myArry[i] = scnr.nextInt();
        }

        int[] sortedArray = sortArray(myArry, size);

        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] sortArray(int[] arr, int arrSize) {
        for (int i = 0; i < arrSize - 1; i++) {
            for (int j = 0; j < arrSize - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

}

