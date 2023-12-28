package LearningFunctions;

public class ReturnValue {
    public static void main(String[] args) {
       double area1 = calculateArea(2.3, 3.5);
       double area2 = calculateArea(1.6, 2.4);
       double area3 = calculateArea(-1.6, -2.4);

       printArea(2.3, 4.0, area1);
       String englishExplanation = explainArea("English");
       String frenchExplanation = explainArea("French");
       String spanishExplanation = explainArea("Spanish");
    }

    public static double calculateArea(double length, double width){
        if(length < 0 || width < 0){
            System.out.println("Invalid Dimession");
            System.exit(0);
        }
        double area = length * width;
        return area;
    }

    public static String explainArea(String language){
        switch(language){
            case "English": return "Area equals length * width";
            case "French": return "La surface est egale a la longueur * la largeur";
            case "Spanish": return "area es igual a largo * ancho";
            default: return "language not available";
        }
    }

    //
    public static void printArea(double length, double width, double area){
        System.out.print("A rectangle with a length of " + length + " and a width of " + width + " has an area");
    }

}
