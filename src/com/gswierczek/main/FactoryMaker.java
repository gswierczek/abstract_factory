package com.gswierczek.main;

import com.gswierczek.factories.CarFactory;
import com.gswierczek.factories.MercedezFactory;
import com.gswierczek.factories.VauxhallFactory;

public class FactoryMaker {

    static CarFactory makeFactory(String type) {
        CarFactory factory = null;
        if ("Standard".equalsIgnoreCase(type)) {
            factory = new VauxhallFactory();
        } else if ("Luxury".equalsIgnoreCase(type)) {
            factory = new MercedezFactory();
        }
        return factory;
    }

}
