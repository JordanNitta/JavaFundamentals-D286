package ControlFlow.Assignments.UsingWhileLoop;

/*
1. Declare an int variable n and an int variable counter initialized to 0.

2. Assign a value to n.

3. Use a while loop to print the first N even numbers.
 */

public class UsingWhileLoop {
    public static void main(String[] args) {
        int n = 20;
        int counter = 0;
        int i = 0;
        while(counter < n){
           if(i % 2 == 0){
               System.out.println(i);
               counter++;
           }
        }
    }
}
