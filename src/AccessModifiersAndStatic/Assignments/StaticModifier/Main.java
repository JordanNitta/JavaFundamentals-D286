package AccessModifiersAndStatic.Assignments.StaticModifier;

import static AccessModifiersAndStatic.Assignments.StaticModifier.Counter.increment;

public class Main {
    public static void main(String[] args){
        Counter.increment();
        System.out.println("Count: " + Counter.count);
    }
}
