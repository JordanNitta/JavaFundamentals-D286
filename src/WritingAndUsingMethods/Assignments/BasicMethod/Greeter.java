package WritingAndUsingMethods.Assignments.BasicMethod;
/*
1. Create a class named Greeter.

2. Inside the Greeter class, create a static method named greet that takes no parameters.

3. In the greet method, print "Hello, User!".

4. Add a main method.

5. In the main method, call the greet method.
 */
public class Greeter {
    public static void main(String[] args) {
        greet();
    }

    public static void greet(){
        System.out.println("Hello, user");
    }

}
