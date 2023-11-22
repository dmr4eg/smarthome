package cz.cvut.fel.omo.semestralka.animatedObjects;

import cz.cvut.fel.omo.semestralka.Event;
import cz.cvut.fel.omo.semestralka.locations.Room;

import java.util.List;

public class Person {
    private final String name;
    private final String surname;
    List<Event> activities;
    Room location;

    public Person(String name, String surname, List<Event> activities, Room location) {
        this.name = name;
        this.surname = surname;
        this.activities = activities;
        this.location = location;
    }
}
