package org.example.arge;

public class CarFactory {
    public static void main(String[] args) {
        CarSkeleton electricCar = new ElectricCar("tesla","model Y desc",650,2500);
        CarSkeleton hybridCar = new HybridCar("toyota","corolla desc",700,1000,3);
        CarSkeleton gasPoweredCar = new GasPoweredCar("honda","honda desc",780,4);
        startEngine(electricCar);
        startEngine(hybridCar);
        startEngine(gasPoweredCar);
    }

    public static void startEngine(CarSkeleton carSkeleton){
        System.out.println(carSkeleton.startEngine());

    }

}
