package WritingAndUsingMethods.Assignments.MethodWithInputParameters;
/*
1. Create a class named Adder.

2. Inside the Adder class, create a static method named add that takes two int parameters.

3. In the add method, calculate the sum of the two input parameters and print the result.

4. Add a main method.

5. In the main method, call the add method with two integers as arguments.
 */
public class Adder {
    public static void main(String[] args) {
        add(20, 30);
    }
    public static void add(int a, int b){
       int sum = a + b;
       System.out.println("Your sum is: " + sum);
    }
}
