package WorkingWithVariablesAndArrays.Assignments.InitializeAndPrintAStringArray;
/*
1. Create a new class for this exercise, add a main method.

2. Declare a String array fruits.

3. Assign your four favorite fruits to the array.

4. Print the elements of the array.
 */
public class StringArray {
    public static void main(String[] args) {
        String[] fruits = {"Oranges", "Pears", "Apple", "Grapes"};
        for(int i = 0; i <= fruits.length; i++){
            System.out.println("Fruits array: " + fruits[i]);
        }
    }
}
