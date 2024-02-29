package autoparkProject.classes;

import autoparkProject.engines.AbstractEngine;
import autoparkProject.engines.api.IStartable;
import autoparkProject.enums.VehicleColor;
import autoparkProject.exceptions.NotVehicleException;
import autoparkProject.utils.mechanics.TechnicalSpecialist;

import java.util.List;
import java.util.Objects;

public class Vehicle implements Comparable<Vehicle>{

    private int carID;

    private List<Rent> carRentList;

    private VehicleType vehicleType;

    private IStartable engine;

    private String model;

    private String registrationNumber;

    private int mass;

    private int releaseYear;

    private int trackedKM;

    private VehicleColor color;

    private int tankVolume;

    public Vehicle() {
    }

    public Vehicle(VehicleType vehicleType, IStartable engine, String model, String registrationNumber, int mass,
                   int releaseYear, int trackedKM, VehicleColor color) throws NotVehicleException {
        this.setVehicleType(vehicleType);
        this.setEngine(engine);
        this.setModel(model);
        this.setRegistrationNumber(registrationNumber);
        this.setMass(mass);
        this.setReleaseYear(releaseYear);
        this.setTrackedKM(trackedKM);
        this.setColor(color);
    }

    public Vehicle(int carID, List<Rent> carRentList, VehicleType vehicleType, IStartable engine, String model,
                   String registrationNumber, int mass, int releaseYear, int trackedKM, VehicleColor color) throws NotVehicleException {
        this.setCarID(carID);
        this.setCarRentList(carRentList);
        this.setVehicleType(vehicleType);
        this.setEngine(engine);
        this.setModel(model);
        this.setRegistrationNumber(registrationNumber);
        this.setMass(mass);
        this.setReleaseYear(releaseYear);
        this.setTrackedKM(trackedKM);
        this.setColor(color);
    }

    public double getTotalIncome() {
        double totalIncome = 0;
        for (Rent rent: carRentList) {
            totalIncome += rent.getRentCost();
        }
        return totalIncome;
    }

    public double getTotalProfit() {
        return getTotalIncome() - getCalcTaxPerMonth();
    }

    public double getCalcTaxPerMonth() {
        return (mass * 0.0013) + (vehicleType.getTaxCoefficient() * engine.getTaxPerMonth() * 30) + 5;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(vehicleType).append(",");
        str.append(engine).append(",");
        str.append(model).append(",");
        str.append(registrationNumber).append(",");
        str.append(mass).append(",");
        str.append(releaseYear).append(",");
        str.append(trackedKM).append(",");
        str.append(color);
        return str.toString();
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(this.vehicleType.getTypeName(), ((Vehicle) o).vehicleType.getTypeName()) && Objects.equals(this.model, ((Vehicle) o).model);
    }

    public int hashCode() {
        return Objects.hash(vehicleType, model, registrationNumber, mass, releaseYear, trackedKM, color, tankVolume);
    }

    public int compareTo(Vehicle obj) {
        if (this.releaseYear < obj.releaseYear) {
            return -1;
        } else if (this.releaseYear > obj.releaseYear) {
            return 1;
        } else {
            if (this.trackedKM < obj.trackedKM) {
                return -1;
            } else if (this.trackedKM > obj.trackedKM) {
                return 1;
            }
        }
        return 0;
    }

    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public List<Rent> getCarRentList() {
        return carRentList;
    }

    public void setCarRentList(List<Rent> carRentList) {
        this.carRentList = carRentList;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) throws NotVehicleException {
        if (TechnicalSpecialist.validateVehicleType(vehicleType)) {
            this.vehicleType = vehicleType;
        } else {
            throw new NotVehicleException("Inappropriate vehicle type: " + vehicleType);
        }
    }

    public IStartable getEngine() {
        return engine;
    }

    public void setEngine(IStartable engine) throws NotVehicleException {
        if (TechnicalSpecialist.validateEngine(engine)) {
            this.engine = engine;
        } else {
            throw new NotVehicleException("Inappropriate engine: " + (AbstractEngine) engine);
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) throws NotVehicleException {
        if (TechnicalSpecialist.validateModelName(model)) {
            this.model = model;
        } else {
            throw new NotVehicleException("Inappropriate model name: " + model);
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) throws NotVehicleException {
        if (TechnicalSpecialist.validateRegistrationNumber(registrationNumber)) {
            this.registrationNumber = registrationNumber;
        } else {
            throw new NotVehicleException("Inappropriate registration number:" + registrationNumber);
        }
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) throws NotVehicleException {
        if (TechnicalSpecialist.validateWeight(mass)) {
            this.mass = mass;
        } else {
            throw new NotVehicleException("Inappropriate mass:" + mass);
        }
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) throws NotVehicleException {
        if (TechnicalSpecialist.validateManufactureYear(releaseYear)) {
            this.releaseYear = releaseYear;
        } else {
            throw new NotVehicleException("Inappropriate release year:" + releaseYear);
        }
    }

    public int getTrackedKM() {
        return trackedKM;
    }

    public void setTrackedKM(int trackedKM) throws NotVehicleException {
        if (TechnicalSpecialist.validateMileage(trackedKM)) {
            this.trackedKM = trackedKM;
        } else {
            throw new NotVehicleException("Inappropriate mileage: " + trackedKM);
        }
    }

    public VehicleColor getColor() {
        return color;
    }

    public void setColor(VehicleColor color) throws NotVehicleException {
        if (TechnicalSpecialist.validateColor(color)) {
            this.color = color;
        } else {
            throw new NotVehicleException("Inappropriate color: Null");
        }
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(int tankVolume) throws NotVehicleException {
            if (TechnicalSpecialist.validateTankVolume(tankVolume)) {
                this.tankVolume = tankVolume;
            } else {
                throw new NotVehicleException("Inappropriate tank volume:" + tankVolume);
            }
    }
}
