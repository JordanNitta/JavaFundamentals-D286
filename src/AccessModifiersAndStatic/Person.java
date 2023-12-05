package AccessModifiersAndStatic;

public class Person {
    public String name;

    private String secret;

    public void sayHi(){
        System.out.println("Hello, Im " + name);
        tellSecret();
    }

// Private
    private void tellSecret(){
        System.out.println("The secret is " + secret);
    }


}
