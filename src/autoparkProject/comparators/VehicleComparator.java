package autoparkProject.comparators;

import autoparkProject.classes.Vehicle;

import java.util.Comparator;

public class VehicleComparator implements Comparator<Vehicle> {

    public int compare(Vehicle o1, Vehicle o2) {
        return o1.getModel().compareTo(o2.getModel());
    }
}
