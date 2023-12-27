package BooleansAndConditionals;

public class ComparisonOperators {
    public static void main(String[] args) {
////      Replace the placeholder by comparing the provided variables.
//        double change = 3.50;
//        double price = 2.50;
//        System.out.println("Hi Java, do I have enough change to buy chips?");
//        System.out.println("Java: " + (change >= price));
//
//        int capacity = 12;
//        int people = 15;
//        System.out.println("Me: Hi Java, can the elevator hold everyone?");
//        System.out.println("Java: " + (capacity >= people)+ "\n");
//
//        String request = "PS5";
//        String purchase = "Toy car";
//        System.out.println("Me: Hi Java, will my friend be happy?");
//        System.out.println("Java: " + (request.equals(purchase)) + "\n");
//
//        int space = 9;
//        int guests = 8;
//        System.out.println("Me: Hi Java, can everyone attend my dinner party?");
//        System.out.println("Java: " + (space >= guests) + "\n");
//
//        int yourVotes = 24;
//        int competitorVotes = 43;
//        System.out.println("Me: Hi Java, will I win the election?");
//        System.out.println("Java: " + (yourVotes > competitorVotes) + "\n");

        double wallet = 100;

        double toyCar = 5.99;
        System.out.println("Can I get this car?");
        if(wallet >= toyCar){
            double amountLeft = wallet -= toyCar;
            System.out.printf("Sure! Here's your change %,.2f%n", amountLeft);
        } else {
            System.out.println("Insufficient funds");
        }


        double nike = 95.99;
        System.out.println("Can I get these nike shoes?");
        if(wallet >= nike){
            double amountLeft = wallet -= nike;
            System.out.printf("Sure! Here's your change %,.2f%n", amountLeft);
        } else {
            System.out.println("Insufficient funds");
        }

        //else: Sorry, I only have <wallet> left.

    }
}
