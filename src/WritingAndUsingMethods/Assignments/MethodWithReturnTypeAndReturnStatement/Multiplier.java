package WritingAndUsingMethods.Assignments.MethodWithReturnTypeAndReturnStatement;

/*
1. Create a class named Multiplier.

2. Inside the Multiplier class, create a static method named multiply that takes two int parameters and returns an int.

3. In the multiply method, calculate the product of the two input parameters and return the result.

4. Add a main method.

5. In the main method, call the multiply method with two integers as arguments and print the result.
 */
public class Multiplier {
    public static void main(String[] args) {
        int product = multiply(10, 10);
        System.out.println("Product: " + product);
    }

    public static int multiply(int a, int b){
        return a * b;
    }
}
