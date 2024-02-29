package autoparkProject.utils.mechanics;

import autoparkProject.engines.AbstractEngine;
import autoparkProject.engines.CombustionEngine;
import autoparkProject.engines.ElectricalEngine;
import autoparkProject.engines.api.IStartable;
import autoparkProject.enums.VehicleColor;
import autoparkProject.classes.VehicleType;

import java.util.regex.Pattern;

public class TechnicalSpecialist {

    public static final int LOWER_LIMIT_MANUFACTURE_YEAR = 1886;

    private static final String REGISTRATION_NUMBER_PATTERN = "\\d{4} [A-Z]{2}-\\d";

    static public boolean validateManufactureYear(int year) {
        return (String.valueOf(year).length() == 4) && (year >= LOWER_LIMIT_MANUFACTURE_YEAR);
    }

    static public boolean validateMileage(int mileage) {
        return (mileage >= 0);
    }

    static public boolean validateWeight(int weight) {
        return (weight >= 0);
    }

    static public boolean validateColor(VehicleColor color) {
        return !(color == null);
    }

    static public boolean validateVehicleType(VehicleType type) {
        return (type.getTypeName() != null) && (!type.getTypeName().isEmpty()) && (type.getTaxCoefficient() >= 0);
    }

    static public boolean validateRegistrationNumber(String number) {
        if (number != null) {
            return Pattern.matches(REGISTRATION_NUMBER_PATTERN, number);
        }
        return true;
    }

    static public boolean validateModelName(String name) {
        return !name.isEmpty();
    }

    static public boolean validateTankVolume(int volume) {
        return (volume >= 0);
    }

    static public boolean validateEngine(IStartable engine) {
        if (validateAbstractEngine((AbstractEngine) engine)) {
            if (engine instanceof CombustionEngine) {
                return validateCombustionEngine((CombustionEngine) engine);
            } else if (engine instanceof ElectricalEngine) {
                return validateElectricalEngine((ElectricalEngine) engine);
            }
        }
        return false;
    }

    static private boolean validateAbstractEngine(AbstractEngine engine) {
        return (engine.getEngineTypeName() != null) && (!engine.getEngineTypeName().isEmpty()) && (engine.getTaxCoefficient() >= 0);
    }

    static private boolean validateCombustionEngine(CombustionEngine engine) {
        return ((engine.getEngineVolume() >= 0) && (engine.getFuelConsumptionPer100() >= 0) && (engine.getTankVolumeCapacity() >= 0));
    }

    static private boolean validateElectricalEngine(ElectricalEngine engine) {
        return ((engine.getBatteryCharge() >= 0) && (engine.getChargeConsumptionPerKM() >= 0));
    }
}
