# Control Flow

#### [**If statement**](IfStatement) - decides whether or not a block of code gets executed.
```java
if(condition){
//    Code to be executed if condition is true
}

if(condition){ 
//    Code to be executed if condition is true
} else { 
//    Code to be executed if condition is false
}

if(condition1){
//    Code to bexecuted if condition1 is true
} else if(condition2){
//    Code to be executed if condition1 is false and condition2 is true
} else {  
//    Code to be executed if condition1 and condition2 are false
}
```

#### [Switch Statements](SwitchStatements) - Control Flow statement that allows a program to execute a specific block of code depending on the value of a given expression. It's a alternative of using multiple if else statements
```java
switch(expression){
//    Code to be executed if expression equals value1
        break;
     case value2:
//    Code to be executed if expression equals value2
        break;
     defaults:
//    Code to be executed if expression
//    Does not equal any of the specified values
        break;
}
```

#### [While Loops](WhileLoops) - Allows a program to repeatedly execute a certain block of code as long as a given condition is met. If the condition in a while loop never becomes false, it loops forever.
```java
while(condition){
//    Code to be exectued as long as condition is true
}

boolean notFound = true;
while(notFound){
    int randomNumber = (int) (Math.random() * 11);
    System.out.println("Generated random number: " + randomNumber);
    if(randomNumber == 10){
        notFound = false;
    }
}
```
#### [**Do-While**](WhileLoops) loop - allows a program to repeatedly execute a certain block of code as long as a given condition is met and always executes the code block at least once.
##### Useful when the loop condition depends on the result of the code inside the loop's block.
```java
int count = 0;
do {
    count++;
    System.out.println("Count is: " + count);
} while(count < 10);
```

#### [For Loop](ForLoops) - Allows a program to execute a block of code multiple times, with a different value for a loop variable each time.
##### Convenient and efficient way to iterate over a sequence of values and to execute a block of code a fixed number of times.
```java
for (int i = 0; i <= 10; i++){
    System.out.println(i);
}
```

#### ForEach Loop - Allows a program to execute a block of code for every element in a collection or array. 
##### Useful for iterating over collections or arrays in a concise and readable way
```java
String[] names = {"Supra", "Bob", "Fatiha"};
// loop variable name is declared before the colon symbol
for (String name: names){
   System.out.println(name); 
}
```

#### Break and Continue - Are used to control the flow of execution in loops and switch statements.
##### Break - Immediately exits a loop or switch statement and continue execution of the code that follows it.
##### Continue - Causes the loop to skip the rest of the current iteration and continue with the next iteration