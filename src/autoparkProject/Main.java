package autoparkProject;

import autoparkProject.collections.autoparkLists.AutoparkCollection;
import autoparkProject.collections.autoparkLists.RentCollection;
import autoparkProject.collections.autoparkLists.VehicleCollection;
import autoparkProject.collections.autoparkLists.VehicleTypeCollection;
import autoparkProject.exceptions.NotVehicleException;
import autoparkProject.utils.displayers.ObjectDisplayer;
import autoparkProject.utils.loaders.RentLoader;
import autoparkProject.utils.loaders.VehicleLoader;
import autoparkProject.utils.loaders.VehicleTypeLoader;


public class Main {
    public static void main(String[] args) throws NotVehicleException {

        AutoparkCollection collection = new AutoparkCollection(
                "src/autoparkProject/files/types.csv",
                "src/autoparkProject/files/vehicles.csv",
                "src/autoparkProject/files/rents.csv");

        ObjectDisplayer.displayVehiclesList(collection.getVehicleCollection().getList());
    }
}
