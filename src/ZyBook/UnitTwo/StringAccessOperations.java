package ZyBook.UnitTwo;

import java.util.Scanner;

public class StringAccessOperations {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userWord;

        System.out.print("Enter a word with 5 letters: ");
        userWord = scnr.next();

        System.out.print("Scrambled: ");
        System.out.print(userWord.charAt(3));
        System.out.print(userWord.charAt(1));
        System.out.print(userWord.charAt(4));
        System.out.print(userWord.charAt(0));
        System.out.print(userWord.charAt(2));
        System.out.println();

        String userCaption;
        int lastIndex;
        char lastChar;

        System.out.print("Enter a caption: ");
        userCaption = scnr.nextLine();

        lastIndex = userCaption.length() - 1;
        lastChar  = userCaption.charAt(lastIndex);
        System.out.println(lastChar + "hi");

        if ( (lastChar != '.') && (lastChar != '!') && (lastChar != '?') ) {
            // User's caption lacked ending punctuation, so add a period
            userCaption = userCaption + ".";
        }

        System.out.println("New: " + userCaption);


    }
}
