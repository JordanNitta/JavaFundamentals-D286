package WritingAndUsingMethods.Assignments.InvokingMethodsFromAnotherClass;

import WritingAndUsingMethods.Assignments.InvokingMethodsFromAnotherClass.Calculator;
public class Main {
    public static void main(String[] args) {
        int sum = Calculator.add(1, 5);
        System.out.println("Sum: " + sum);
    }
}
