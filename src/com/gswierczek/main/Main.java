package com.gswierczek.main;

import com.gswierczek.client.Client;
import com.gswierczek.factories.CarFactory;

public class Main {

    public static void main(String args[]) {
        Client client = new Client();
        CarFactory factory = FactoryMaker.makeFactory(args[0]);
        System.out.println(client.requestCar(factory));
    }
}
