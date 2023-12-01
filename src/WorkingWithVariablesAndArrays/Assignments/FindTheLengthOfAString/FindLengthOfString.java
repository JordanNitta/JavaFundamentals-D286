package WorkingWithVariablesAndArrays.Assignments.FindTheLengthOfAString;
/*
1. Create a new class for this exercise, add a main method.

2. Declare a String variable text.

3. Assign the value Java Programming to text.

4. Find the length of text and store this in a variable. Give the variable a sensible name. The type should be an int, since it’s a non-floating point number.

5. Print the length.
 */

public class FindLengthOfString {
    public static void main(String[] args) {
        String text = "Java Programming";
        int stringLength = text.length();
        System.out.println(stringLength);
    }
}
