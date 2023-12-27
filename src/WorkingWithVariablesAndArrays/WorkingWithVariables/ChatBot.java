package WorkingWithVariablesAndArrays.WorkingWithVariables;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Java Chatbot");
        System.out.println("Hello. What is your name?");

        String name = scnr.nextLine();

        System.out.println(name);

        System.out.printf("Hi %s! I'm Javabot. Where are you from? %n", name);

        String location = scnr.nextLine();
        System.out.printf("I hear it's beautiful at %s! I'm from a place called Oracle %n", location);

        System.out.println("How old are you");


        int age = scnr.nextInt();
        System.out.printf("%d %n", age);

        int chatBotAge = 400;
        System.out.printf("So your %d, cool! I'm %d years old.%n", age, chatBotAge);

        int difference = chatBotAge / age;
        System.out.printf("This means I'm %d times older than you.%n", difference);

        System.out.println("Enough about me. What's your favorite language? (just don't say Python)%n");

        scnr.nextLine();
        String favLanguage = scnr.nextLine();
        System.out.printf("%s %n", favLanguage);

        System.out.printf("%s that's great! Nice chatting with you %s. I have to log off now. See ya!", favLanguage, name);





    }
}
