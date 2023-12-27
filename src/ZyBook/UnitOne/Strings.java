package ZyBook.UnitOne;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String sentenceSubject;
        String sentenceVerb;
        String sentenceObject = "an apple";

        sentenceSubject = "ate";
        sentenceVerb = "boy";

        System.out.println("A ");
        System.out.println(sentenceSubject + " ");
        System.out.println(sentenceVerb + " ");
        System.out.println(sentenceObject + ".");

//        Formatted string in a print statement
        System.out.printf("A %s %s %s", sentenceSubject, sentenceVerb, sentenceObject);

        String wordRelative;
        String wordFood;
        String wordAdjective;
        String wordTimePeriod;

        // Get user's words
        System.out.println("Provide input without spaces.");

        System.out.println("Enter a kind of relative: ");
        wordRelative = scnr.next();

        System.out.println("Enter a kind of food: ");
        wordFood = scnr.next();

        System.out.println("Enter an adjective: ");
        wordAdjective = scnr.next();

        System.out.println("Enter a time period: ");
        wordTimePeriod = scnr.next();

        // Tell the story
        System.out.println();
        System.out.print  ("My " + wordRelative);
        System.out.println(" says eating " + wordFood);
        System.out.println("will make me more " + wordAdjective + ",");
        System.out.println("so now I eat it every " + wordTimePeriod + ".");
    }
}
