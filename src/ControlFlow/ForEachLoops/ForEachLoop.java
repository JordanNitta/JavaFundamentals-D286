package ControlFlow.ForEachLoops;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        for(int num : nums){
            System.out.println(num);
            sum += num;
        }
        System.out.println("This sum is: " + sum);
    }
}
