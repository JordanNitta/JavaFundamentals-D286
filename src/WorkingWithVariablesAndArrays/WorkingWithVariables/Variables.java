package WorkingWithVariablesAndArrays.WorkingWithVariables;

import java.util.Scanner;

public class Variables {

    public static void main(String[] args) {

        int passengers = 5;
        int busTickets = passengers;
        System.out.println(passengers);
        System.out.println(busTickets);

        int points = 0;
        String name = "Jordan";
        points = 50;
        System.out.println(name + " loses " + points + "points!");
        points = 3;
        System.out.println(name + " loses " + points + "points!");
        points = 30;
        System.out.println(name + " loses " + points + "points!");
        points = 100;
        System.out.println(name + " loses " + points + "points!");
        points = 60;
        System.out.println(name + " loses " + points + "points!");
        points += points;
        System.out.println(points);

        double sales = 24309.65;
        double profit = 18562.18;
        double refunds = 688.78;
        double shipping = 1233.57;

        System.out.printf("This month we made %.0f in sales%n", sales);
        System.out.printf("Factoring in costs, we made $%.0f in profit%n", profit);
        System.out.printf("The refunds are at a low $%.0f. This is a good sign!%n", refunds);
        System.out.printf("Shipping costs were high. We paid $%.0f in shipping", shipping);



    }
}
