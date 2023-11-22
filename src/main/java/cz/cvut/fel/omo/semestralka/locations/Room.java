package cz.cvut.fel.omo.semestralka.locations;

import cz.cvut.fel.omo.semestralka.animatedObjects.Person;
import cz.cvut.fel.omo.semestralka.animatedObjects.Pet;
import cz.cvut.fel.omo.semestralka.entities.Controllable;

import java.util.List;

public class Room {
    String name;
    int floor;
    List<Controllable> controllables;
    List<Person> persons;
    List<Pet> pets;

    public Room(String name, int floor, List<Controllable> controllables, List<Person> persons, List<Pet> pets) {
        this.name = name;
        this.floor = floor;
        this.controllables = controllables;
        this.persons = persons;
        this.pets = pets;
    }
}
