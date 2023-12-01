package WorkingWithVariablesAndArrays.Assignments.ConcatenateTwoStrings;

/*
1. Create a new class for this exercise, add a main method.

2. Declare two String variables str1 and str2.

3. Assign values Hello and World to str1 and str2 respectively.

4. Concatenate str1 and str2 and store the result in a variable named result. What should the type be?

5. Print the concatenated string.
 */
public class ConcatenateTwoString {
    public static void main(String[] args){
        String str1 = "Hello";
        String str2 = "World";
        String result1 = str1 + " " + str2;
        System.out.println(result1);
        String result2 = str1.concat(str2);
        System.out.println(result2);

    }
}
