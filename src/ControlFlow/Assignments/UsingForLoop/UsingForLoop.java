package ControlFlow.Assignments.UsingForLoop;
/*
1. Declare an int array numbers.

2. Assign 5 values to the array.

3. Use a for loop to iterate over the array and print each value.
 */
public class UsingForLoop {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 6, 7, 8};
        for(int i = 0; i < nums.length; i++){
            System.out.println("Here are the elements in the array " + nums[i] );
        }
    }
}
