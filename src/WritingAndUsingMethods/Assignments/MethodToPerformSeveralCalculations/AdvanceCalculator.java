package WritingAndUsingMethods.Assignments.MethodToPerformSeveralCalculations;

/*
1. Create a class named AdvancedCalculator.

2. Inside the AdvancedCalculator class, create a static method named performCalculations that takes two int parameters.

3. In the performCalculations method, calculate the sum, difference, product, and quotient of the two input parameters.

4. Print the results of the calculations.

5. Create another class named Main. (Or give it another name if this conflicts with the previous Main class if you’re working in the same package, for example App)

6. In the main method of the Main class, call the performCalculations method with two integers as arguments.


 */
public class AdvanceCalculator {

    public static void performCalculations(int a, int b){
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quotient = (double) a / b;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
