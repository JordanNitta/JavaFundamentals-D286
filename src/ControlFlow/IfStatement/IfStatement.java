package ControlFlow.IfStatement;

public class IfStatement {
    public static void main(String[] args) {
        int input = 2;

        if(input > 0) {
            System.out.println("2 divided by the input equals: " + (2 / input));
        } else {
            System.out.println("Input cannot be 0");
        }

        int hour = 6;
        if(hour < 12) {
            System.out.println("Good Morning");
        } else if (hour >= 12 && hour < 18){
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Evening!");
        }
    }
}
