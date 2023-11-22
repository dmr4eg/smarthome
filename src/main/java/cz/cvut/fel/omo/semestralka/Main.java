package cz.cvut.fel.omo.semestralka;

import cz.cvut.fel.omo.semestralka.deviceTypes.Bulb;
import cz.cvut.fel.omo.semestralka.entities.Controllable;
import cz.cvut.fel.omo.semestralka.entities.Device;

public class Main {
    public static void main(String[] args) {
        Device d = new Bulb("Bulb");
        System.out.println(d.isOn() + " - " + d.getCurrentState());
        d.turnOn();
        System.out.println(d.isOn() + " - " + d.getCurrentState());
        d.turnOff();
        System.out.println(d.isOn() + " - " + d.getCurrentState());

        System.out.println("=== === === === === === === === === === === ===");

        Device c = new Bulb("Bulb", 69);
        System.out.println(c.isOn() + " - " + c.getCurrentState());
        c.turnOn();
        System.out.println(c.isOn() + " - " + c.getCurrentState());
        c.turnOff();
        System.out.println(c.isOn() + " - " + c.getCurrentState());

    }
}
