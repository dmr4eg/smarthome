package cz.cvut.fel.omo.semestralka.animatedObjects;

import cz.cvut.fel.omo.semestralka.entities.Controllable;

import java.util.List;

public class Pet {
    String name;
    String type;
    List<Controllable> controllables;

    public Pet(String name, String type, List<Controllable> controllables) {
        this.name = name;
        this.type = type;
        this.controllables = controllables;
    }
}
