package com.gswierczek.factories;

import com.gswierczek.beans.Car;
import com.gswierczek.beans.Vauxhall;

public class VauxhallFactory extends CarFactory {

    @Override
    public Car makeCar() {
        return new Vauxhall();
    }
}
