package autoparkProject.engines;

public class DieselEngine extends CombustionEngine {

    static private final String ENGINE_TYPE_NAME = "Diesel";

    static private final double ENGINE_TAX_COEFFICIENT = 1.2;

    public DieselEngine(double engineVolume, double fuelConsumptionPer100, double tankVolumeCapacity) {
        super(ENGINE_TYPE_NAME, ENGINE_TAX_COEFFICIENT, engineVolume, fuelConsumptionPer100, tankVolumeCapacity);
    }
}
