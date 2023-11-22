package cz.cvut.fel.omo.semestralka.deviceTypes;
import cz.cvut.fel.omo.semestralka.entities.Device;

public class Bulb extends Device {
    private int brightness;
    public Bulb(String name) {
        super(name);
        this.brightness = 100;
    }

    public Bulb(String name, int brightness){
        super(name);
        this.brightness = brightness;
    }

    public void setBrightness(int brightness){
        this.brightness = brightness;
    }

    public int getBrightness(){
        return this.brightness;
    }

    @Override
    public String getCurrentState() {
        if (isOn()) {
            return getName() + " is " + this.state + " with brightness " + this.brightness;
        } else {
            return getName() + " is " + this.state;
        }
    }
}
