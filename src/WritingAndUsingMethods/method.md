#### Methods - Methods in java are somewhat like functions and subprograms. We call them functions sometimes, but there's a small difference. 
##### Methods are blocks of code that perform a specific task. Methods have names, and that's how we call them to execute the code.

```java

// Start with key word public but there a lot of different keywords you can use I will be discussing this in a later section
// Void means the method does not have a result.
// printMessage is the name of the method
public void printMessage(){
//    Method body
    System.out.println("Hello Java People!");
}
printMessage();
```

#### Parameter - Defined in the method definition's parameter list
#### Arguments - The actual values that are passed to the method when it's is called
#### Methods with input parameters - To specify input parameters for a method, you include their type and name in the method definition's parameter list.
```java


public void printMessage(int number, String message){
    System.out.println("Number: " number);
    System.out.println("Message : " message);
}
// Pass in two arguments because the method is taking two parameters
printMessage(20, "Hi there");
```

####
