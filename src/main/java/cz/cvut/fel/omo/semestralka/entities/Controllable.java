package cz.cvut.fel.omo.semestralka.entities;

public interface Controllable {
    String name = "";
    double consumption = 0;
    void turnOn();
    void turnOff();
    boolean isOn();
    String getName();
    double getConsumption();
    void setConsumption(double consumption);
    String getCurrentState();
}
