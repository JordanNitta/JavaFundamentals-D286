## Primitives Vs Objects
#### Primitives are the most basic data types. They just contain a value and there are 8 different kinds of primitives
```java
int x = 5;
```

#### Objects - Are composed of other data types. Objects are a collection of properties and methods.
```java
// Creating a object
Person person = new Person();
person.name = "Bill";
```
#### Class - Is a blueprint to create objects. There a collection of properties and methods.

#### The meaning of Pass By Value
1. Copying Primitive Values
   2. Primitives are immutable, when the copied value gets changed, the original is not affected
3. Copying Object References
   4. Objects are not immutable, changing the object with the copied reference is changing the object.

#### Stack and Heap 
1. Stack - holds the variables that are needed for running the program. The java memory can only access the current record the stack it on.
   2. Imagine a stack of plates at a buffet. When you add a plate, you put it on top of the stack, and when you want a plate, you take the one from the top. The last plate you put on is the first one you take off.
   3. Method Calls: Each time you call a method (a set of instructions), it's like adding a plate to the stack. The method at the top is the one currently being executed.
   4. Local Variables: When a method is called, any variables it uses are placed on the stack. They stay there until the method finishes, and then they're removed.
   5. Last In, First Out (LIFO): The principle is like the plates – the last method you called is the first one that finishes.
   6. Limited Space: Just like a stack of plates has limited space, the stack in Java has a limited capacity. If you have too many method calls without finishing them, you might run out of space.
   7. So, in Java, the stack is like a virtual stack of plates. It keeps track of method calls and local variables, managing them in a last-in, first-out manner. When a method finishes, it's like taking a plate off the top of the stack.
2. Heap - In simple terms, the heap in Java is a region of a computer's memory used for dynamic memory allocation. It's where objects are stored during the execution of a Java program. Unlike the stack, which handles method calls and local variables, the heap is used for objects that can persist beyond the scope of a single method.
      3. Think of the computer's memory as a playground, and the heap is like a big open area where you can build and play with your toys (objects). When you run a Java program, it needs a place to store information that changes during its execution.
      4. Objects Go in the Heap: Just like you put your toys on the playground, in Java, when you create things like variables, lists, or other objects, they go into the heap.
      5. No Fixed Size: The heap can grow and shrink based on how many toys (objects) you need. It's like the playground expanding if more kids want to play.
      6. Automatic Cleanup: Java has a helper (garbage collector) that helps clean up toys you're not using anymore. You don't have to worry about putting away your toys; the cleanup happens automatically.
      7. Shared Space: Everyone in the program can use the heap. It's like a shared play area where all the kids can bring and play with their toys.
      8. So, in simple terms, the heap is where your Java program puts things it needs to use while it's running, like variables and objects, and Java takes care of cleaning up when you're done using them.
