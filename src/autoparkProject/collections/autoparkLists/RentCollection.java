package autoparkProject.collections.autoparkLists;

import autoparkProject.classes.Rent;
import autoparkProject.collections.autoparkLists.api.AbstractAutoparkCollection;
import autoparkProject.utils.loaders.api.CSVLoader;

public class RentCollection extends AbstractAutoparkCollection<Rent> {
    public RentCollection(String csv, CSVLoader<Rent> loader) {
        super(csv, loader);
    }
}
