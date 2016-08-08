package com.gswierczek.factories;

import com.gswierczek.beans.Car;
import com.gswierczek.beans.Mercedez;

public class MercedezFactory extends CarFactory {
	@Override
	public Car makeCar() {
	        return new Mercedez();
	}
}
