package org.example.arge;

public class ElectricCar extends CarSkeleton{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, String name, double avgKmPerCharge, int batterySize) {
        super(description, name);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public String drive() {
        return "run from EV car";
    }

    @Override
    public String startEngine() {
        runEngine(this);
        return getName()+ " car engine is starting.";
    }
}
