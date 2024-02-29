package autoparkProject.collections.autoparkLists;

import autoparkProject.classes.Rent;
import autoparkProject.utils.loaders.RentLoader;
import autoparkProject.utils.loaders.VehicleLoader;
import autoparkProject.utils.loaders.VehicleTypeLoader;

public class AutoparkCollection {


    private final VehicleTypeCollection typeCollection;

    private final VehicleCollection vehicleCollection;

    private final RentCollection rentCollection;

    public AutoparkCollection(String vehicleTypeCSV, String vehicleCSV, String rentCSV) {
        typeCollection = new VehicleTypeCollection("src/autoparkProject/files/types.csv",new VehicleTypeLoader());
        vehicleCollection = new VehicleCollection("src/autoparkProject/files/vehicles.csv", new VehicleLoader(typeCollection.getList()));
        rentCollection = new RentCollection("src/autoparkProject/files/rents.csv", new RentLoader(vehicleCollection.getList()));
    }

    public VehicleTypeCollection getTypeCollection() {
        return typeCollection;
    }

    public VehicleCollection getVehicleCollection() {
        return vehicleCollection;
    }

    public RentCollection getRentCollection() {
        return rentCollection;
    }
}
