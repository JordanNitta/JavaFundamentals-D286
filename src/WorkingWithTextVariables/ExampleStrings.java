package WorkingWithTextVariables;

public class ExampleStrings {
    public static void main(String[] args){
        String str = "Hi all!";
        int length = str.length();
        System.out.println(length);
        System.out.println(str.charAt(0));
        System.out.println(str.indexOf("all"));
        System.out.println(str.substring(3));
//      Exclusive range
        System.out.println(str.substring(3, 5));

        System.out.println(str.toUpperCase() + " " + str.toLowerCase());

        String newStr = "    bla bla bla        ";
        System.out.println(newStr.trim());

        String s1 = "Hi";
        String s2 = s1;
        System.out.println(s1 + " " + s2);

        s1 = "Hello";
        System.out.println(s1 + " " + s2);

        // mutable objects
        Text t1 = new Text();
        t1.setDescription("Hi");
        Text t2 = t1;

        System.out.println(t1.getDescription() + " " + t2.getDescription());
        System.out.println("--------------------------------");
        t1.setDescription("Hello");
        System.out.println(t1.getDescription() + " " + t2.getDescription());

//         Comparing Strings

        String string1 = "Hi";
        String string2 = new String("Hi");

        System.out.println(string1.equals(string2));
        System.out.println("----------------------");
//  String builder
        StringBuilder sb = new StringBuilder("Bob");
        sb.append(" loves java");
        String s = sb.toString();

        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append(", ");
        sb1.append("world");
        sb1.append("!");
        String greeting = sb1.toString();
        System.out.println(greeting);

    }
}
