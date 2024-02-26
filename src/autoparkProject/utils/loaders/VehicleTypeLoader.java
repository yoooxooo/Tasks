package autoparkProject.utils.loaders;

import autoparkProject.utils.loaders.api.CSVLoader;
import autoparkProject.classes.VehicleType;

import java.util.List;

public class VehicleTypeLoader implements CSVLoader<VehicleType> {

    public VehicleTypeLoader() {
    }

    public VehicleType createObject(String line) {
        List<String> input = divideInput(line);
        VehicleType bufferedType = new VehicleType(input.get(1), Double.parseDouble(input.get(2)));
        bufferedType.setCarID(Integer.parseInt(input.get(0)));
        return bufferedType;
    }
}
