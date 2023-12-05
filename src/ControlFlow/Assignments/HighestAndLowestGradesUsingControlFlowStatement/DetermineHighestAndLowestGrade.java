package ControlFlow.Assignments.HighestAndLowestGradesUsingControlFlowStatement;

public class DetermineHighestAndLowestGrade {
    public static void main(String[] args) {
        int[] grades = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int highest = grades[0];
        int lowest = grades[0];

        for(int grade : grades){
            if(grade > highest){
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
    }
}
