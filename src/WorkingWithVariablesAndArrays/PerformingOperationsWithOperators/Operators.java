package WorkingWithVariablesAndArrays.PerformingOperationsWithOperators;

public class Operators {
    public static void main(String[] args){
//        Arithmetic operators
    double x = 2;
    int y = 3;
    double z = x + y;
    System.out.println(z);
    double d = x / y;
    System.out.println(d);
//    Doesn't change the value of the variable
    System.out.println(x - y);
    int nr1 = 10;
    int nr2 = 5;
    int result = nr1 % nr2;
    System.out.println(result);

//    Assignment Operator
    int nr3 = 7;
    int nr4 = 70;
//        Increasing and assigning
    nr3 += nr4;
    System.out.print(nr3);

//     Unary Operator
    int nr5 = 8;

    //increase the value by one
    nr5++;
    System.out.println(nr5);

    int nr6 = 3;
    System.out.println(-nr6);
    System.out.println(nr6);

//  Relation Operator
    int small = 2;
    int big = 10;
    System.out.println(small >= big);
    System.out.println(small == big);
    System.out.println(small <= big);

    }
}
