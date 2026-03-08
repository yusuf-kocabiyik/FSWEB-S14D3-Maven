package org.example.company;

import java.util.Objects;

public class Car {
    private String name;
    private  int cylinders;
    private  boolean engine;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine= Boolean.TRUE;
        this.wheels=4;
    }

    public String startEngine(){
        printClassName();
        return "the car's engine is starting";
    }

    public String accelerate(){
        printClassName();
        return "the car is accelerating";
    }
    public String brake(){
        printClassName();
        return  "the car is braking";
    }
    private void printClassName() {
        System.out.println("Classname: "+getClass().getSimpleName());
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cylinders);
    }

    @Override
    public String toString() {
        return "Car{" +
                "cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", engine=" + engine +
                ", wheels=" + wheels +
                '}';
    }
}
