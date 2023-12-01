package WorkingWithVariablesAndArrays.StoringTextVariablesInStrings;

public class Strings {
    public static void main(String[] args){
        String s = "hi";
        String s1 = "Hello";
        boolean same = s.equals(s1);
        System.out.println(s.toUpperCase());
        System.out.println(s);

        s = s.toUpperCase();
        System.out.println(s);

        String subString = s1.substring(1, 4);
        System.out.println(subString);
    }
}
