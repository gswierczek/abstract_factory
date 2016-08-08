package com.gswierczek.beans;

public class Mercedez extends Car {

	@Override
	public int maximumSpeed() {
		return 200;
	}

	@Override
	public String getMake() {
		return "Mercedez";
	}

    @Override
    public String toString() {
        return "Mercedez [maximumSpeed()=" + maximumSpeed() + ", getMake()=" + getMake() + "]";
    }

}
