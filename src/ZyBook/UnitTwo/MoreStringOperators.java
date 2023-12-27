package ZyBook.UnitTwo;

public class MoreStringOperators {
    public static void main(String[] args) {

        String userText = "google.com";
        userText.substring(7);
        System.out.println(userText.substring(7));

        // userText is "Hi"
        userText = "Hi";
        userText = userText.concat(" friend"); // Now "Hi friend"
        String newText = userText.concat(" there");
        // newText is "Hi friend there"

    }
}
