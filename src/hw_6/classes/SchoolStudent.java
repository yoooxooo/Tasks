package hw_6.classes;

public class SchoolStudent {

    static private int numOfStudents = 0;

    private final String firstName;

    private final String lastName;

    private final float averageMarkForStudent;

    public SchoolStudent(String firstName, String lastName, float score) {
        this.firstName = firstName;
        this.lastName = lastName;
        averageMarkForStudent = score;
        numOfStudents++;
        System.out.println("Default constructor execution - " + numOfStudents);
    }

    public float getMark(){
        return averageMarkForStudent;
    }

    private static int getNumOfStudents() {
        return numOfStudents;
    }

    public String toString() {
        return firstName + " " + lastName + " " + averageMarkForStudent;
    }

    public static void rebootStudentList() {
        numOfStudents = 0;
    }
}
