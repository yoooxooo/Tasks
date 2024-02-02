package technicalTasks.taskFromJoseph.classes;

import java.util.Arrays;

public class CircleOfFate {

    private final boolean[] warriors;

    private final int amountOfWarriors;

    private int stepSize;

    public CircleOfFate(int n) {
        amountOfWarriors = n;
        warriors = new boolean[amountOfWarriors];
        stepSize = 2;

    }

    public CircleOfFate(int n, int d) {
        amountOfWarriors = n;
        warriors = new boolean[amountOfWarriors];
        stepSize = d;
    }

    public int getLastSurvivor() {
        Arrays.fill(warriors, true);
        int currentWarrior = -1;
        for (int i = 0; i != amountOfWarriors - 1; ) {
            currentWarrior = goToNextWarrior(currentWarrior, stepSize);
            if (warriors[currentWarrior]) {
                warriors[currentWarrior] = false;
                i++;
            }
        }
        for (int i = 0; i <= warriors.length; i++) {
            if (warriors[i]) {
                return i + 1;
            }
        }
        return 0;
    }

    public int getStepSizeForFirstSurvive() {
        Arrays.fill(warriors, true);
        int currentWarrior = -1;
        for (int i = 0; i != amountOfWarriors - 1; ) {
            currentWarrior = goToNextWarrior(currentWarrior, 1);
            if (warriors[currentWarrior]) {
                if (currentWarrior == 0) {
                    return getStepSizeForFirstSurviveRecursive(2);
                }
                warriors[currentWarrior] = false;
                i++;
            }
        }
        return 1;
    }

    private int getStepSizeForFirstSurviveRecursive(int step) {
        Arrays.fill(warriors, true);
        int currentWarrior = -1;
        for (int i = 0; i != amountOfWarriors - 1; ) {
            currentWarrior = goToNextWarrior(currentWarrior, step);
            if (warriors[currentWarrior]) {
                if (currentWarrior == 0) {
                    return getStepSizeForFirstSurviveRecursive(step + 1);
                }
                warriors[currentWarrior] = false;
                i++;
            }
        }
        return step;
    }

    private int goToNextWarrior(int currentWarrior, int step) {
        int currentStep = step;
        while (true) {
            if (currentWarrior == amountOfWarriors - 1) {
                currentWarrior = -1;
            } else {
                currentWarrior += 1;
                if (warriors[currentWarrior]) {
                    currentStep -= 1;
                }
            }
            if (currentStep == 0) {
                return currentWarrior;
            }
        }
    }

    public void setStepSize(int stepSize) {
        this.stepSize = stepSize;
    }
}
