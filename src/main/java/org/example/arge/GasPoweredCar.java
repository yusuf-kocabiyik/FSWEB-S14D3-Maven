package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description, String name, double avgKmPerLitre, int cylinders) {
        super(description, name);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }
    @Override
    public String drive() {
        return "run from gasPower car";
    }

    @Override
    public String startEngine() {
        runEngine(this);
        return getName()+ " car engine is starting.";
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }


}
