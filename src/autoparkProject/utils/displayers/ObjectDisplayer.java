package autoparkProject.utils.displayers;

import autoparkProject.utils.statistics.ProfitCalculator;
import autoparkProject.classes.Vehicle;

import java.util.List;

public class ObjectDisplayer {

    public static void displayVehiclesList(List<Vehicle> vehicleList) {
        for (Vehicle v : vehicleList) {
            System.out.print(v.getCarID());
            System.out.print("   " + v.getVehicleType().getTypeName());
            System.out.print("   " + v.getModel());
            System.out.print("   " + v.getRegistrationNumber());
            System.out.print("   " + v.getMass());
            System.out.print("   " + v.getReleaseYear());
            System.out.print("   " + v.getTrackedKM());
            System.out.print("   " + v.getColor());
            System.out.printf("   %.2f", v.getTotalIncome());
            System.out.printf("   %.2f", v.getCalcTaxPerMonth());
            System.out.printf("   %.2f\n", v.getTotalProfit());
        }
        System.out.printf("Total profit - %.2f", ProfitCalculator.sumTotalProfit(vehicleList));
    }
}
