package autoparkProject.utils.loaders;

import autoparkProject.engines.DieselEngine;
import autoparkProject.engines.ElectricalEngine;
import autoparkProject.engines.GasolineEngine;
import autoparkProject.engines.api.IStartable;
import autoparkProject.enums.VehicleColor;
import autoparkProject.exceptions.NotVehicleException;
import autoparkProject.utils.loaders.api.CSVLoader;
import autoparkProject.classes.Vehicle;
import autoparkProject.classes.VehicleType;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class VehicleLoader implements CSVLoader<Vehicle> {

    private final List<VehicleType> typesList;

    public VehicleLoader(List<VehicleType> typesList) {
        this.typesList = typesList;
    }

    public Vehicle createObject(String line) throws NotVehicleException {
        List<String> input = divideInput(line);
        IStartable engine = createEngine(input);
        return new Vehicle(
                Integer.parseInt(input.get(0)),
                new ArrayList<>(),
                typesList.get(Integer.parseInt(input.get(1)) - 1),
                engine,
                input.get(2),
                input.get(3),
                Integer.parseInt(input.get(4)),
                Integer.parseInt(input.get(5)),
                Integer.parseInt(input.get(6)),
                VehicleColor.valueOf(input.get(7))
        );
    }

    private IStartable createEngine(List<String> input) {
        if (Objects.equals(input.get(8), "Electrical")) {
            return new ElectricalEngine(
                    Double.parseDouble(input.get(9)),
                    Double.parseDouble(input.get(10)));
        } else if (Objects.equals(input.get(8), "Gasoline")) {
            return new GasolineEngine(
                    Double.parseDouble(input.get(9)),
                    Double.parseDouble(input.get(10)),
                    Double.parseDouble(input.get(11)));
        } else {
            return new DieselEngine(
                    Double.parseDouble(input.get(9)),
                    Double.parseDouble(input.get(10)),
                    Double.parseDouble(input.get(11)));
        }
    }

}
