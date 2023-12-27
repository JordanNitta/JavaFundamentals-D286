##### Class members can be fields, methods, contructors, classes
##### Access modifiers - Keywords to control the visibility and accessibility of the class members.
##### Good practice to use the most restrictive access modifier. This helps to encapsulate and hide the implementation details of your class and prevent any unintended modifications from outside.
1. Public<br>
   2. Accessible from anywhere within the program.
3. Private<br>
   4. Accessible from anywhere within the same class.<br>
   5. Need to create getters and setters 
5. Protected<br>
   6. Accessible from anywhere the same package and its subclasses outside the package
7. Default - No modifier<br>
   8. Accessible from anywhere within the same package
9. Static<br>
   10. Used to indicate that member belongs to the class itself, rather than to any instance of the class.

````java
public class MyClass {
    public int x;
    private int y;
    protected int z;
    int w;
}
````




