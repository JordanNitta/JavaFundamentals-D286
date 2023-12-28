package ZyBook.UnitFour;

public class LoopingArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
//        For each loop
        System.out.println("---------------");
        for(int number: numbers){
            System.out.println(number);
        }

        System.out.println("---------------");
        String[] strArray = {"apple", "banana", "cherry"};
        for (String string : strArray){
            System.out.println(string);
        }

        System.out.println("---------------");
        int[] grades = {95, 80, 85, 70, 90, 60, 88, 78};
        for(int i =0; i < grades.length; i+=2){
            System.out.println(grades[i]);
        }

        System.out.println("---------------");
        int[] values = {3, 5, 7, 9, 11};
        for(int i = 0; i < values.length; i++){
            values[i] = values[i] * 2;
            System.out.println(values[i]);
        }

        System.out.println("---------------");
        String[] colors = {"red", "green", "blue"};
        for(int i = 0; i < colors.length; i++){
            colors[i] = colors[i].toUpperCase();
            System.out.println(colors[i]);
        }

        System.out.println("---------------");
        int[] data = {4, 7, 4, 1, 4, 9, 4};
        int targetValue = 4;
        for(int i = 0; i < data.length; i++){
            if(data[i] == targetValue){
                System.out.println(i);
            }
        }
    }
}
