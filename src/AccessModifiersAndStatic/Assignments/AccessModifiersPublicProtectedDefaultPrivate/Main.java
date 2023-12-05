package AccessModifiersAndStatic.Assignments.AccessModifiersPublicProtectedDefaultPrivate;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println("Name : " + person1.name);
        System.out.println("Age: " + person1.age);
        System.out.println("Address: " + person1.address);
//        Wouldn't work because its private
//        System.out.println("SSN: " + person1.ssn);
    }
}
