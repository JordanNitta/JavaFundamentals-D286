package ControlFlow.Assignments.AverageOfOddNumbersInAnArray;

public class AverageOfOddNumbersInAnArray {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 6, 8};
        int sum = 0;
        int count = 0;
        for(int i =0; i < nums.length; i++){
            if(nums[i] % 2 != 0){
               sum += nums[i];
               count++;
            }
        }
        double average = (double) sum / count;
        System.out.println("Average of odd numbers: " + average);
    }
}
