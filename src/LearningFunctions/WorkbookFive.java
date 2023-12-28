package LearningFunctions;

public class WorkbookFive {
    public static void main(String[] args) {
        double square = areaSquare(2);
    }

    public static double areaSquare(double side){
        if(side < 0){
            System.out.println("Impossible");
            System.exit(0);
        }
        return Math.pow(side, 2);
    }

    public static double areaRectangle(double length, double width){
        if(length < 0 || width < 0){
            System.out.print("Error: impossible");
            System.exit(0);
        }
        return length * width;
    }
}
