package cz.cvut.fel.omo.semestralka.entities;

import cz.cvut.fel.omo.semestralka.State;

public abstract class Device implements Controllable {
    public String name;
    protected State state = State.OFF;
    protected double consumption;

    public Device(String name) {
        this.name = name;
        this.state = state;
    }

    public Device(String name, double consumption) {
        this.name = name;
        this.consumption = consumption;
        this.state = state;
    }

    public void turnOn() {
        this.state = State.ON;
    }

    public void turnOff() {
        this.state = State.OFF;
    }

    public boolean isOn() {
        return this.state == State.ON;
    }

    public String getName() {
        return this.name;
    }

    public double getConsumption() {
        return this.consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public String getCurrentState() {
        return getName() + " is " + this.state;
    }
}
