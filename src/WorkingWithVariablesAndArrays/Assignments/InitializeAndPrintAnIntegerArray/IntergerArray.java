package WorkingWithVariablesAndArrays.Assignments.InitializeAndPrintAnIntegerArray;
/*
Initialize an integer array and print its elements.

Steps:

1. Create a new class for this exercise, add a main method.

2. Declare an int array numbers.

3. Assign the values 1 - 5 to the array.

4. Print the elements of the array.
 */
public class IntergerArray {
    public static void main(String[] args){
        int[] number = {1, 2, 3, 4, 5};
        for (int i = 0; i < number.length; i++){
            System.out.println(number[i]);
        }
    }
}
