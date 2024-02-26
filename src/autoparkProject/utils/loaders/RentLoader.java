package autoparkProject.utils.loaders;

import autoparkProject.classes.Rent;
import autoparkProject.utils.loaders.api.CSVLoader;
import autoparkProject.classes.Vehicle;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.List;

public class RentLoader implements CSVLoader<Rent> {

    private final List<Vehicle> vehicleList;

    public RentLoader(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public Rent createObject(String line) throws IllegalArgumentException {
        List<String> input = divideInput(line);
        Rent bufferedRent;
        try {
            bufferedRent = new Rent(DateFormat.getDateInstance().parse(input.get(1)), Double.parseDouble(input.get(2)));
        } catch (ParseException e) {
            throw new IllegalArgumentException(ILLEGAL_ARGUMENT_EXCEPTION, e);
        }
        vehicleList.get(Integer.parseInt(input.get(0)) - 1).getCarRentList().add(bufferedRent);
        return bufferedRent;
    }
}
