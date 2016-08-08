package com.gswierczek.beans;

public abstract class Car {

    public abstract int maximumSpeed();

    public abstract String getMake();
    
    @Override
    public String toString() {
        return "Car [maximumSpeed()=" + maximumSpeed() + ", getMake()=" + getMake() + "]";
    }
}
