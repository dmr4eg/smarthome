package cz.cvut.fel.omo.semestralka.locations;

import cz.cvut.fel.omo.semestralka.animatedObjects.Person;
import cz.cvut.fel.omo.semestralka.animatedObjects.Pet;
import cz.cvut.fel.omo.semestralka.entities.Controllable;

import java.util.List;

public class House {
    String name;
    List<Room> rooms;
    List<Controllable> controllables;
    List<Person> persons;
    List<Pet> pets;
    int floors;

    public House(String name, List<Room> rooms, List<Controllable> controllables, List<Person> persons, List<Pet> pets) {
        this.name = name;
        this.rooms = rooms;
        this.controllables = controllables;
        this.persons = persons;
        this.pets = pets;
    }
}
