package autoparkProject.vehicles;

public class VehicleType {

    private String typeName;

    private double taxCoefficient;

    public VehicleType() {
    }

    public VehicleType(String typeName, double taxCoefficient) {
        this.typeName = typeName;
        this.taxCoefficient = taxCoefficient;
    }

    public void display() {
        System.out.println("typeName = " + typeName);
        System.out.println("taxCoefficient = " + taxCoefficient);
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(typeName).append(",");
        str.append("\"").append(taxCoefficient).append("\"");
        return str.toString();
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public double getTaxCoefficient() {
        return taxCoefficient;
    }

    public void setTaxCoefficient(double taxCoefficient) {
        this.taxCoefficient = taxCoefficient;
    }
}
