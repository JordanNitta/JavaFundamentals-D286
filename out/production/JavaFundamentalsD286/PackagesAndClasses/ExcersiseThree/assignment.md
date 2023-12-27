Next, you will create a package and class structure for a university application. In order to do this, you need to create Student, Course, and Enrollment classes with a few fields and a Main class to test your implementation.

1. Create a package named university.

2. Inside the university package, create the following classes with the specified fields:

Student:
studentId (int)
name (String)

Course:
courseId (int)
courseName (String)

Enrollment:
student (Student)
course (Course)
3. Create a package named main.

4. Inside the main package, create a class named Main with a main method.

5. Add the necessary imports to the Main class for the Student, Course, and Enrollment classes from the university package.

6. In the main method, create Student, Course, and Enrollment objects and set some values for their fields.

7. Print all the values of the field to the console to verify your solution.

Explanation:

This solution consists of two packages, university and main. In the university package, there are three classes: Student, Course, and Enrollment, each with their specified fields. In the main package, there is a Main class with a main method that creates Student, Course, and Enrollment objects and sets some values for their fields. Then, it prints the student and course details for the enrollment.

Please note, in a real-life application, you would want to use encapsulation by making the fields private and adding methods, constructors, and getters/setters to make the classes functional and interact with each other.