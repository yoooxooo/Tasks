package autoparkProject.engines;

public class ElectricalEngine extends AbstractEngine {

    static private final String ENGINE_TYPE_NAME = "Electrical";

    static private final double ENGINE_TAX_COEFFICIENT = 0.1;

    private double batteryCharge;

    private double chargeConsumptionPerKM;

    public ElectricalEngine(double batteryCharge, double chargeConsumptionPerKM) {
        super(ENGINE_TYPE_NAME, ENGINE_TAX_COEFFICIENT);
        this.batteryCharge = batteryCharge;
        this.chargeConsumptionPerKM = chargeConsumptionPerKM;
    }

    public double getTaxPerMonth() {
        return super.getTaxCoefficient();
    }

    public double getMaxKilometers() {
        return batteryCharge / chargeConsumptionPerKM;
    }

    public double getBatteryCharge() {
        return batteryCharge;
    }

    public void setBatteryCharge(double batteryCharge) {
        this.batteryCharge = batteryCharge;
    }

    public double getChargeConsumptionPerKM() {
        return chargeConsumptionPerKM;
    }

    public void setChargeConsumptionPerKM(double chargeConsumptionPerKM) {
        this.chargeConsumptionPerKM = chargeConsumptionPerKM;
    }
}
