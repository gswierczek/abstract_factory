package com.gswierczek.client;

import com.gswierczek.beans.Car;
import com.gswierczek.factories.CarFactory;

/**
 * The client accesses only the abstract factory interface, although there are multiple factories which can make cars
 * The client accesses only the abstract product, although there are multiple concrete products
 *
 *
 */
public class Client {
    public Car requestCar(CarFactory abstractFactory) {
        //
        return abstractFactory.makeCar();
    }
}