package LearningFunctions;

public class WorkbookThree {
    public static void main(String[] args) {
        double noon = 77;          //temperature at noon in fahrenheit.
        double evening = 61;       //temperature during the evening in fahrenheit
        double midnight = 55;      //temperature at midnight in fahrenheit

        printTemp(noon);
        printTemp(evening);
        printTemp(midnight);
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        double celsiusTemp = (fahrenheit - 32) * 5 / 9;
        return celsiusTemp;
    }

    public static void printTemp(double fahrenheit){
        System.out.println("F: " + fahrenheit);
        System.out.println("C: " + fahrenheitToCelsius(fahrenheit) +"\n");
    }
}
