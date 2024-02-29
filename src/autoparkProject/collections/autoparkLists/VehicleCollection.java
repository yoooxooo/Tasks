package autoparkProject.collections.autoparkLists;

import autoparkProject.collections.autoparkLists.api.AbstractAutoparkCollection;
import autoparkProject.utils.loaders.api.CSVLoader;
import autoparkProject.classes.Vehicle;

public class VehicleCollection extends AbstractAutoparkCollection<Vehicle> {
    public VehicleCollection(String csv, CSVLoader<Vehicle> loader) {
        super(csv, loader);
    }
}
