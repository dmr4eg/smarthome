package cz.cvut.fel.omo.semestralka.deviceTypes;

public class Sensor {
    private boolean on;

    public Sensor() {
        this.on = false;
    }

    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }

    public boolean isOn() {
        return this.on;
    }
}
