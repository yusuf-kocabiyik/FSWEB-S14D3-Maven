package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
    }

    public CarSkeleton(String description, String name) {
        this.description = description;
        this.name = name;
    }
    public String startEngine(){
        System.out.println("classname: "+ getClass().getSimpleName());
        return getName() +" is starting engine";
    }
    public String drive(){
        runEngine(this);
        return getName()+" is driving";
    }
    protected void runEngine(CarSkeleton carSkeleton){
        if(carSkeleton instanceof ElectricCar){
            double avgKmPerCharge = ((ElectricCar) carSkeleton).getAvgKmPerCharge();
            int batterySize = ((ElectricCar) carSkeleton).getBatterySize();
            System.out.println("the car's per charge: " + avgKmPerCharge + "battery size : "+batterySize);
        } else if (carSkeleton instanceof HybridCar) {
            HybridCar hybridCar = (HybridCar) carSkeleton;
            System.out.println("hybrid car , per charge: "+hybridCar.getAvgKmPerLitre() + "battery size: " + hybridCar.getBatterySize() + "cyclinder: " +hybridCar.getCylinders());
        } else if (carSkeleton instanceof GasPoweredCar) {
            GasPoweredCar gasPoweredCar = (GasPoweredCar) carSkeleton;
            System.out.println("gaspowered car :avg km per litre :" +gasPoweredCar.getAvgKmPerLitre());
        }else {
            System.out.println("incalid car type");
        }
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
}
