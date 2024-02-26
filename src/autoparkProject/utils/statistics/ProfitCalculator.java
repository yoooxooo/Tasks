package autoparkProject.utils.statistics;

import autoparkProject.classes.Vehicle;

import java.util.List;

public class ProfitCalculator {

    public static double sumTotalProfit(List<Vehicle> vehicleList) {
        double totalProfit = 0;
        for (Vehicle v: vehicleList) {
            totalProfit += v.getTotalProfit();
        }
        return totalProfit;
    }


}
