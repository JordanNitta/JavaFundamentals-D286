package LearningFunctions;

public class Parameters {
    public static void main(String[] args) {
//      Takes to arguments
        calculateArea(3.0, 5.0);
    }

//  Parameter stores a value that your function expects to receive
    public static void calculateArea(double length, double width){
        double area = length * width;
        System.out.println("Area: " + area);
    }

}
