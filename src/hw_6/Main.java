package hw_6;

import hw_6.classes.School;
import hw_6.classes.SchoolStudent;

public class Main {

    public static void performTest(String input) {
        School school = new School(input);
        school.printAVGScoreForAll();
        school.printLowTabStudents();
    }

    public static void showTest(int numOfTest, String input) {
        SchoolStudent.rebootStudentList();
        System.out.println("Test " + numOfTest + "\n");
        System.out.println("Input:");
        System.out.println(input);
        System.out.println("Result:");
        performTest(input);
        System.out.println();
    }

    public static void main(String[] args) {
        String input1 = "3\nPetrov\nVasya\n4\nOliver\nEdward\n9.4\nMorrison\nFrank\n6\n";
        String input2 = "1\nSimmons\nJohn\n7";
        showTest(1, input1);
        showTest(2, input2);


    }
}
