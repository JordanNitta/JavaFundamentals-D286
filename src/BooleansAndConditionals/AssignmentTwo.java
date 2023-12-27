package BooleansAndConditionals;

public class AssignmentTwo {
    public static void main(String[] args) {
        int temp = 25;
        String forecast;

        if(temp <= -1){
            System.out.println("The forecast is FREEZING! Stay home!");
        } else if(temp <= 10){
            System.out.println("The forecast is Chilly. Wear a coat!");
        } else {
            System.out.println("It's warm. Go outside!");
        }
        System.out.println("forecast");
    }
}
