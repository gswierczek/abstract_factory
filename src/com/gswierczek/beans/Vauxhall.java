package com.gswierczek.beans;

public class Vauxhall extends Car {

	@Override
	public int maximumSpeed() {
		return 150;
	}

	@Override
	public String getMake() {
		return "Vauxhall";
	}

    @Override
    public String toString() {
        return "Vauxhall [maximumSpeed()=" + maximumSpeed() + ", getMake()=" + getMake() + "]";
    }

}
