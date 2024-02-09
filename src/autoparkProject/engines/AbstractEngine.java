package autoparkProject.engines;

import autoparkProject.engines.api.IStartable;

public abstract class AbstractEngine implements IStartable {

    private String engineTypeName;

    private double taxCoefficient;

    public AbstractEngine(String engineTypeName, double taxCoefficient){
        this.engineTypeName = engineTypeName;
        this.taxCoefficient = taxCoefficient;
    }

    public abstract double getTaxPerMonth();

    public abstract double getMaxKilometers();

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(engineTypeName).append(",");
        str.append("\"").append(taxCoefficient).append("\"");
        return str.toString();
    }

    public String getEngineTypeName() {
        return engineTypeName;
    }

    public void setEngineTypeName(String engineTypeName) {
        this.engineTypeName = engineTypeName;
    }

    public double getTaxCoefficient() {
        return taxCoefficient;
    }

    public void setTaxCoefficient(double taxCoefficient) {
        this.taxCoefficient = taxCoefficient;
    }
}
