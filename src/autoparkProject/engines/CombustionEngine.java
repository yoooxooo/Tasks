package autoparkProject.engines;

public abstract class CombustionEngine extends AbstractEngine {

    private double engineVolume;

    private double tankVolumeCapacity;

    private double fuelConsumptionPer100;

    public CombustionEngine(String typeName, double taxCoefficient, double engineVolume, double fuelConsumptionPer100, double tankVolumeCapacity) {
        super(typeName, taxCoefficient);
        this.engineVolume = engineVolume;
        this.tankVolumeCapacity = tankVolumeCapacity;
        this.fuelConsumptionPer100 = fuelConsumptionPer100;
    }

    public double getTaxPerMonth() {
        return super.getTaxCoefficient();
    }

    public double getMaxKilometers() {
        return tankVolumeCapacity / fuelConsumptionPer100 * 100;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public double getTankVolumeCapacity() {
        return tankVolumeCapacity;
    }

    public void setTankVolumeCapacity(double tankVolumeCapacity) {
        this.tankVolumeCapacity = tankVolumeCapacity;
    }

    public double getFuelConsumptionPer100() {
        return fuelConsumptionPer100;
    }

    public void setFuelConsumptionPer100(double fuelConsumptionPer100) {
        this.fuelConsumptionPer100 = fuelConsumptionPer100;
    }
}
