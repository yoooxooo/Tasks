package hw_6.classes;

import static java.lang.Math.round;

public class School {

    private final SchoolStudent[] students;

    private float avgScoreForAll = 0;

    public School(String input) {
        String[] lines = input.split("\n");
        int numOfStudents = Integer.parseInt(lines[0]);
        students = new SchoolStudent[numOfStudents];
        int currentStudent = 0;
        for (int i = 1; i < lines.length - 2; i += 3) {
            float scoreForStudent = Float.parseFloat(lines[i + 2]);
            students[currentStudent] = new SchoolStudent(lines[i], lines[i + 1], scoreForStudent);
            avgScoreForAll += scoreForStudent;
            currentStudent++;
        }
        avgScoreForAll = (float) round(100 * (avgScoreForAll / numOfStudents)) / 100;
    }

    public void printAVGScoreForAll() {
        System.out.println(avgScoreForAll);
    }

    public void printLowTabStudents() {
        for (SchoolStudent student : students) {
            if (student.getMark() < avgScoreForAll) {
                System.out.println(student);
            }
        }
    }
}
