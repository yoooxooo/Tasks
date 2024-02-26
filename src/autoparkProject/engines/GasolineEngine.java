package autoparkProject.engines;

public class GasolineEngine extends CombustionEngine{

    static private final String ENGINE_TYPE_NAME = "Gasoline";

    static private final double ENGINE_TAX_COEFFICIENT = 1.0;

    public GasolineEngine(double engineVolume, double fuelConsumptionPer100, double tankVolumeCapacity) {
        super(ENGINE_TYPE_NAME, ENGINE_TAX_COEFFICIENT, engineVolume, fuelConsumptionPer100, tankVolumeCapacity);
    }
}
