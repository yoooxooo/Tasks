package technicalTasks.taskFromJoseph;

import technicalTasks.taskFromJoseph.classes.CircleOfFate;

public class Main {
    public static void main(String[] args) {
        CircleOfFate test41 = new CircleOfFate(41);

        System.out.println("Test with n - 41:\n");

        System.out.println("Classic with d - 2: " + test41.getLastSurvivor());

        int d41 = test41.getStepSizeForFirstSurvive();

        System.out.println("d to let first one to survive: " + d41);

        test41.setStepSize(d41);

        System.out.println("If d - " + d41 + " last warrior - " + test41.getLastSurvivor() + "\n");

        CircleOfFate test100 = new CircleOfFate(100);

        System.out.println("Test with n - 100:\n");

        System.out.println("Classic with d - 2: " + test100.getLastSurvivor());

        int d100 = test100.getStepSizeForFirstSurvive();

        System.out.println("d to let first one to survive: " + d100);

        test100.setStepSize(d100);

        System.out.println("If d - " + d100 + " last warrior - " + test100.getLastSurvivor());

    }
}
