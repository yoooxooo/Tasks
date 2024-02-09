package autoparkProject;

import autoparkProject.engines.DieselEngine;
import autoparkProject.engines.ElectricalEngine;
import autoparkProject.engines.GasolineEngine;
import autoparkProject.enums.VehicleColor;
import autoparkProject.exceptions.NotVehicleException;
import autoparkProject.vehicles.Vehicle;
import autoparkProject.vehicles.VehicleType;

public class Main {
    public static void main(String[] args) throws NotVehicleException {

        // Initialize Vehicle types
        VehicleType[] types = new VehicleType[] {
                new VehicleType("Bus", 1.2),
                new VehicleType("Car", 1),
                new VehicleType("Rink", 1.5),
                new VehicleType("Tractor", 1.2),
        };

        // Initialize Cars
        Vehicle[] vehicles = new Vehicle[] {
                new Vehicle(
                        types[0],
                        new GasolineEngine(2, 8.1, 75),
                        "Volkswagen Crafter",
                        "5427 AX-7",
                        2022,
                        2015,
                        376000,
                        VehicleColor.Blue,
                        75),
                new Vehicle(
                        types[0],
                        new GasolineEngine(2.18, 8.5, 75),
                        "Volkswagen Crafter",
                        "6427 AA-7",
                        2500,
                        2014,
                        227010,
                        VehicleColor.White,
                        75),
                new Vehicle(
                        types[0],
                        new ElectricalEngine(50, 150),
                        "Electric Bus E321",
                        "6785 BA-7",
                        12080,
                        2019,
                        20451,
                        VehicleColor.Green,
                        1000),
                new Vehicle(
                        types[1],
                        new DieselEngine(1.6, 7.2, 55),
                        "Golf 5",
                        "8682 AX-7",
                        1200,
                        2006,
                        230451,
                        VehicleColor.Gray,
                        55),
                new Vehicle(
                        types[1],
                        new ElectricalEngine(25, 70),
                        "Tesla Model S 70D",
                        "0001 AA-7",
                        2200,
                        2019,
                        10454,
                        VehicleColor.White,
                        1000),
                new Vehicle(
                        types[2],
                        new DieselEngine(3.2, 25, 20),
                        "Hamm HD 12 VV",
                        null,
                        3000,
                        2016,
                        122,
                        VehicleColor.Yellow,
                        20),
                new Vehicle(
                        types[3],
                        new DieselEngine(4.75, 20.1, 135),
                        "МТЗ Беларус - 1025.4",
                        "1145 AB-7",
                        1200,
                        2020,
                        109,
                        VehicleColor.Red,
                        135),
        };

        for (Vehicle vehicle: vehicles) {
            System.out.println(vehicle);
        }

        System.out.println();

        for (int i = 0; i < vehicles.length; i++) {
            for(int j = i + 1; j < vehicles.length; j++) {
                if (vehicles[i].equals(vehicles[j])) {
                    System.out.println("{" + vehicles[i] + "}" + " and " + "{" + vehicles[j] + "}" + " are similar");
                }
            }
        }

        System.out.println();

        Vehicle maxKMVehicle = null;
        double maxKM = 0;
        for (Vehicle vehicle: vehicles) {
            if (vehicle.getEngine().getMaxKilometers() > maxKM) {
                maxKM = vehicle.getEngine().getMaxKilometers();
                maxKMVehicle = vehicle;
            }
        }

        System.out.println("Max KM vehicle from list - {" + maxKMVehicle + "}");
    }
}
