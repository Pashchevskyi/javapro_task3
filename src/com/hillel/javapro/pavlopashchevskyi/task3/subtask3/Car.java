package com.hillel.javapro.pavlopashchevskyi.task3.subtask3;

public class Car {
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("Electricity has been started.");
    }

    private void startCommand() {
        System.out.println("Start command has been applied");
    }

    private void startFuelSystem() {
        System.out.println("Fuel system has been started");
    }
}
