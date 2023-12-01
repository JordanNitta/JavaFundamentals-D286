package PackagesAndClasses.ExcersiseThree;

public class Main {
    public static void main(String[] args){

        Student student = new Student();
        student.studentId = 1;
        student.name = "Bill";

        Course course = new Course();
        course.courseId = 1;
        course.courseName = "Java";

        Enrollment enrollment = new Enrollment();
        enrollment.student = student;
        enrollment.course = course;


        System.out.println("Student ID: " + enrollment.student.studentId + " Name" + enrollment.student.name);
        System.out.println("Course ID: " + enrollment.course.courseId + " Name" + enrollment.course.courseName);
    }
}
