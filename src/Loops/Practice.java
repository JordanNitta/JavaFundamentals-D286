package Loops;

public class Practice {
    public static void main(String[] args) {
        int[] arrVals = {1, 2, 3, 4, 5, 6};
        reverseVals(arrVals);
    }

    public static int[] reverseVals(int[] arrVals) {
        int i;
        int tempValue;

        for (i = 0; i < (arrVals.length / 2); ++i) {
            tempValue = arrVals[i];
            arrVals[i] = arrVals[arrVals.length - 1 - i];
            arrVals[arrVals.length - 1 - i] = tempValue;
        }
        // Print the reversed array
        for (int value : arrVals) {
            System.out.println(value);
        }
        return arrVals;

    }


}
