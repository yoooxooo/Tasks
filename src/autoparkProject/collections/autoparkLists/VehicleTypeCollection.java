package autoparkProject.collections.autoparkLists;

import autoparkProject.collections.autoparkLists.api.AbstractAutoparkCollection;
import autoparkProject.utils.loaders.api.CSVLoader;
import autoparkProject.classes.VehicleType;

public class VehicleTypeCollection extends AbstractAutoparkCollection<VehicleType> {


    public VehicleTypeCollection(String csv, CSVLoader<VehicleType> loader) {
        super(csv, loader);
    }
}
