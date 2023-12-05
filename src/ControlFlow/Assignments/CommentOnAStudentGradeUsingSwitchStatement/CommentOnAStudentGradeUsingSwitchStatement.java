package ControlFlow.Assignments.CommentOnAStudentGradeUsingSwitchStatement;
/*
1. Declare a char variable grade.

2. Assign a value to grade.

3. Use a switch statement to comment on the grade. Come up with different comments for A, B, C, D, F. If it’s something else, comment “Invalid grade.”

4. Print the comment. Run the code for different grades and verify the result.
 */
public class CommentOnAStudentGradeUsingSwitchStatement {
    public static void main(String[] args) {
        char grade = 'B';
        switch(grade){
            case 'A':
                System.out.println("You passed with an A good job");
                break;
            case 'B':
                System.out.println("You passed with an B");
                break;
            case 'C':
                System.out.println("You need to try harder");
                break;
            case 'D':
                System.out.println("Your failing");
                break;
            case 'F':
                System.out.println("You failed");
                break;
            default:
                System.out.println("We only support letter grades");
        }
    }
}
