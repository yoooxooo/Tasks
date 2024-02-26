package autoparkProject.utils.loaders.api;

import autoparkProject.exceptions.NotVehicleException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface CSVLoader <T> {

    final static String ILLEGAL_ARGUMENT_EXCEPTION = "Unable to get data from input File";

    final static String REGULAR_EXPRESSION_FOR_DIVIDING_CSV_LINE = "(?<=[\"])[^\"]+[^,](?=[\"])|[a-zа-яА-ЯA-Z0-9_]+[^,\"]*";

    default List<T> load(String csv) throws IllegalArgumentException {
        File vehicleFile = new File(csv);
        List<T> objects = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(vehicleFile))) {
            String bufferedLine;
            while ((bufferedLine = reader.readLine()) != null) {
                objects.add(createObject(bufferedLine));
            }
        } catch (IOException | NotVehicleException e) {
            throw new IllegalArgumentException(ILLEGAL_ARGUMENT_EXCEPTION, e);
        }
        return objects;
    }

    T createObject(String line) throws NotVehicleException, IllegalArgumentException;

    default List<String> divideInput(String input) {
        List<String> result = new ArrayList<>();
        Matcher matcher = Pattern.compile(REGULAR_EXPRESSION_FOR_DIVIDING_CSV_LINE).matcher(input);
        while (matcher.find()) {
            String bufferedMatch = matcher.group();
            if (bufferedMatch.contains(",")) {
                bufferedMatch = bufferedMatch.replaceAll(",", ".");
            }
            result.add(bufferedMatch);
        }
        return result;
    }
}
