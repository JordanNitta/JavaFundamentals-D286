package ControlFlow.Assignments.UsingForEachLoop;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int sum = 0;
        for (int num: nums){
            sum += num;
//            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
